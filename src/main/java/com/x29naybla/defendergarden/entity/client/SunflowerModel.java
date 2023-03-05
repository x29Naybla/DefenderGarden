package com.x29naybla.defendergarden.entity.client;

import com.x29naybla.defendergarden.DefenderGarden;
import com.x29naybla.defendergarden.entity.custom.SunflowerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SunflowerModel extends AnimatedGeoModel<SunflowerEntity> {
    @Override
    public ResourceLocation getModelResource(SunflowerEntity object) {
        return new ResourceLocation(DefenderGarden.MOD_ID,"geo/sunflower.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SunflowerEntity object) {
        return new ResourceLocation(DefenderGarden.MOD_ID,"textures/entity/sunflower.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SunflowerEntity animatable) {
        return new ResourceLocation(DefenderGarden.MOD_ID,"animations/sunflower.animation.json");
    }
}
