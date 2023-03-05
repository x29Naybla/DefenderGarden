package com.x29naybla.defendergarden.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.x29naybla.defendergarden.DefenderGarden;
import com.x29naybla.defendergarden.entity.custom.SunflowerEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SunflowerRenderer extends GeoEntityRenderer<SunflowerEntity> {
    public SunflowerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SunflowerModel());
        this.shadowRadius = 0.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(SunflowerEntity animatable) {
        return new ResourceLocation(DefenderGarden.MOD_ID,"textures/entity/sunflower.png");
    }

    @Override
    public RenderType getRenderType(SunflowerEntity animatable, float partialTick, PoseStack poseStack,
                                    @Nullable MultiBufferSource bufferSource,
                                    @Nullable VertexConsumer buffer, int packedLight,
                                    ResourceLocation texture) {
        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
