package com.cozary.floralench.mixin;

import com.cozary.floralench.blocks.base.LargePotBase;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerModel.class)
public abstract class PlayerModelMixin extends HumanoidModel<AvatarRenderState> {

    protected PlayerModelMixin(ModelPart root) {
        super(root);
    }

    private static boolean floralench$isHoldingLargePot(AvatarRenderState renderState) {
        if (floralench$isLargePot(renderState.getMainHandItemStack())) {
            return true;
        }

        ItemStack offhandStack = renderState.mainArm == HumanoidArm.RIGHT ? renderState.leftHandItemStack : renderState.rightHandItemStack;

        return renderState.getMainHandItemStack().isEmpty() && floralench$isLargePot(offhandStack);
    }

    private static boolean floralench$isLargePot(ItemStack itemStack) {
        return !itemStack.isEmpty() && itemStack.getItem() instanceof BlockItem blockItem && blockItem.getBlock() instanceof LargePotBase;
    }

    @Inject(method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;)V", at = @At("TAIL"))
    private void floralench$holdLargePotStill(AvatarRenderState renderState, CallbackInfo callbackInfo) {
        if (renderState.attackTime > 0.0F) {
            return;
        }

        if (renderState.isVisuallySwimming || renderState.isFallFlying || renderState.pose == Pose.SLEEPING || renderState.pose == Pose.SPIN_ATTACK) {
            return;
        }

        if (!floralench$isHoldingLargePot(renderState)) {
            return;
        }

        float cos = (float) Math.cos(this.body.yRot);
        float sin = (float) Math.sin(this.body.yRot);

        this.rightArm.y = renderState.isCrouching ? 5.2F : 2.0F;
        this.rightArm.z = sin * 5.0F;
        this.rightArm.x = -cos * 5.0F;

        this.leftArm.y = renderState.isCrouching ? 5.2F : 2.0F;
        this.leftArm.z = -sin * 5.0F;
        this.leftArm.x = cos * 5.0F;

        float basePitch = renderState.isCrouching ? -0.376F : -0.576F;

        float idleBob = (float) Math.sin(renderState.ageInTicks * 0.067F) * 0.05F;
        float walkBob = (float) Math.cos(renderState.walkAnimationPos * 0.6662F) * 0.15F * renderState.walkAnimationSpeed;

        float totalPitch = basePitch + idleBob + walkBob;

        this.rightArm.xRot = totalPitch;
        this.rightArm.yRot = 0.0F;
        this.rightArm.zRot = 0.0F;

        this.leftArm.xRot = totalPitch;
        this.leftArm.yRot = 0.0F;
        this.leftArm.zRot = 0.0F;
    }
}
