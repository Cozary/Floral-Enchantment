package com.cozary.floralench;

import com.cozary.floralench.init.ModItems;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RenderPlayerEvent;

@Mod.EventBusSubscriber(modid = FloralEnchantment.MOD_ID)
public class EventHandler {

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void renderHeldPot(RenderPlayerEvent.Pre event) {
        Player player = event.getEntity();
        PlayerRenderer render = event.getRenderer();
        PlayerModel<AbstractClientPlayer> model = render.getModel();
        Pose pose = player.getPose();
        if (!ModList.get().isLoaded("obfuscate")) {
            if (pose != Pose.SWIMMING && pose != Pose.FALL_FLYING && pose != Pose.SLEEPING && player != null && player.getMainHandItem().getItem().toString().contains("large") && player.getMainHandItem().getItem().toString().contains("pot") || player.getMainHandItem().getItem() == ModItems.DANCING_SUNFLOWER.get()) {

                model.leftArm.visible = false;
                model.leftSleeve.visible = false;
                model.rightArm.visible = false;
                model.rightSleeve.visible = false;
            }
        }
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void holdPotPost(RenderPlayerEvent.Post event) {
        Player player = event.getEntity();
        PlayerModel<AbstractClientPlayer> model = event.getRenderer().getModel();

        if (player != null && player.getMainHandItem().getItem().toString().contains("large") && player.getMainHandItem().getItem().toString().contains("pot") || player.getMainHandItem().getItem() == ModItems.DANCING_SUNFLOWER.get()) {

            renderArmModelHoldingPot(model, player, event);

        }
    }

    @OnlyIn(Dist.CLIENT)
    private static void renderArmModelHoldingPot(PlayerModel<AbstractClientPlayer> model, Player player, RenderPlayerEvent event) {
        PoseStack matrix = event.getPoseStack();
        VertexConsumer buffer = event.getMultiBufferSource().getBuffer(model.renderType(((AbstractClientPlayer) player).getSkin().texture()));
        int light = event.getPackedLight();
        int texture = OverlayTexture.NO_OVERLAY;

        Pose pose = player.getPose();

        if (pose == Pose.SWIMMING || pose == Pose.FALL_FLYING)
            return;

        if (!ModList.get().isLoaded("obfuscate")) {

            model.rightArm.x = -Mth.cos((float) Math.toRadians(player.yBodyRot)) * 4.2F;
            model.rightArm.y = player.isCrouching() ? 16.5F : 20.5F;
            model.rightArm.z = -Mth.sin((float) Math.toRadians(player.yBodyRot)) * 5.0F;
            model.rightArm.xRot = 9.0F + model.rightArm.xRot * 0.5F - ((float) Math.PI / 10F);
            model.rightArm.yRot = (float) -Math.toRadians(player.yBodyRot);
            model.rightArm.zRot = 0.0F;

            model.leftArm.x = Mth.cos((float) Math.toRadians(player.yBodyRot)) * 4.2F;
            model.leftArm.y = player.isCrouching() ? 16.5F : 20.5F;
            model.leftArm.z = Mth.sin((float) Math.toRadians(player.yBodyRot)) * 5.0F;
            model.leftArm.xRot = model.rightArm.xRot;
            model.leftArm.yRot = (float) -Math.toRadians(player.yBodyRot);
            model.leftArm.zRot = 0.0F;

            model.rightArm.visible = true;
            model.leftArm.visible = true;
            model.rightArm.render(matrix, buffer, light, texture);
            model.leftArm.render(matrix, buffer, light, texture);

            //

            model.rightSleeve.x = -Mth.cos((float) Math.toRadians(player.yBodyRot)) * 4.2F;
            model.rightSleeve.y = player.isCrouching() ? 16.5F : 20.5F;
            model.rightSleeve.z = -Mth.sin((float) Math.toRadians(player.yBodyRot)) * 5.0F;
            model.rightSleeve.xRot = 9.0F + model.rightSleeve.xRot * 0.5F - ((float) Math.PI / 10F);
            model.rightSleeve.yRot = (float) -Math.toRadians(player.yBodyRot);
            model.rightSleeve.zRot = 0.0F;

            model.leftSleeve.x = Mth.cos((float) Math.toRadians(player.yBodyRot)) * 4.2F;
            model.leftSleeve.y = player.isCrouching() ? 16.5F : 20.5F;
            model.leftSleeve.z = Mth.sin((float) Math.toRadians(player.yBodyRot)) * 5.0F;
            model.leftSleeve.xRot = model.rightSleeve.xRot;
            model.leftSleeve.yRot = (float) -Math.toRadians(player.yBodyRot);
            model.leftSleeve.zRot = 0.0F;

            model.rightSleeve.visible = true;
            model.leftSleeve.visible = true;
            model.rightSleeve.render(matrix, buffer, light, texture);
            model.leftSleeve.render(matrix, buffer, light, texture);
        }
    }

}
