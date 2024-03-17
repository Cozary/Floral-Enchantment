package com.cozary.floralench.mixin;


import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerModel.class)
public abstract class PlayerEntityModelMixin<T extends LivingEntity> extends HumanoidModel<T> {

    @Shadow
    @Final
    public ModelPart leftSleeve;

    @Shadow
    @Final
    public ModelPart rightSleeve;

    public PlayerEntityModelMixin() {
        super(null);
    }

    @SuppressWarnings("unchecked")
    @Inject(method = "setupAnim", at = @At(value = "HEAD"))
    public void setupAnimHEAD(T livingEntity, float swing, float g, float tick, float i, float j, CallbackInfo info) {

        if (livingEntity instanceof AbstractClientPlayer) {
            Player player = (Player) livingEntity;
            Pose pose = livingEntity.getPose();

            if (pose != Pose.SWIMMING && pose != Pose.FALL_FLYING && pose != Pose.SLEEPING && player != null && ((player.getHandSlots().toString().contains("large") && player.getHandSlots().toString().contains("pot")) || player.getHandSlots().toString().contains("dancing"))) {

                leftArm.visible = false;
                leftSleeve.visible = false;
                rightArm.visible = false;
                rightSleeve.visible = false;
            }
        }
    }

    @Inject(method = "setupAnim", at = @At(value = "RETURN"))
    public void setupAnimEnd(T livingEntity, float swing, float g, float tick, float i, float j, CallbackInfo info) {
        if (livingEntity instanceof AbstractClientPlayer) {
            Player player = (Player) livingEntity;
            Pose pose = livingEntity.getPose();

            if (pose != Pose.SWIMMING && pose != Pose.FALL_FLYING && pose != Pose.SLEEPING && player != null && ((player.getHandSlots().toString().contains("large") && player.getHandSlots().toString().contains("pot")) || player.getHandSlots().toString().contains("dancing"))) {

                this.rightArm.y = player.isCrouching() ? 5.2f : 2.0f;
                this.rightArm.z = (float) (Math.sin(this.body.yRot) * 5.0f);
                this.rightArm.x = (float) (-Math.cos(this.body.yRot) * 5.0f);
                this.rightArm.xRot = this.rightArm.xRot * 0.5f - 0.31415927f;
                this.rightArm.yRot = 0.0f;

                this.leftArm.y = player.isCrouching() ? 5.2f : 2.0f;
                this.leftArm.z = (float) (-Math.sin(this.body.yRot) * 5.0f);
                this.leftArm.x = (float) (Math.cos(this.body.yRot) * 5.0f);
                this.leftArm.xRot = this.rightArm.xRot;
                this.leftArm.yRot = 0.0f;

                rightArm.visible = true;
                leftArm.visible = true;

                this.rightSleeve.y = player.isCrouching() ? 5.2f : 2.0f;
                this.rightSleeve.z = (float) (Math.sin(this.body.yRot) * 5.0f);
                this.rightSleeve.x = (float) (-Math.cos(this.body.yRot) * 5.0f);
                this.rightSleeve.xRot = this.rightSleeve.xRot * 0.5f - 0.31415927f;
                this.rightSleeve.yRot = 0.0f;

                this.leftSleeve.y = player.isCrouching() ? 5.2f : 2.0f;
                this.leftSleeve.z = (float) (-Math.sin(this.body.yRot) * 5.0f);
                this.leftSleeve.x = (float) (Math.cos(this.body.yRot) * 5.0f);
                this.leftSleeve.xRot = this.rightSleeve.xRot;
                this.leftSleeve.yRot = 0.0f;

                rightSleeve.visible = true;
                leftSleeve.visible = true;

            }
        }

    }


}
