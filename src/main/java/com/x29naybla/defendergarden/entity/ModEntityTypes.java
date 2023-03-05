package com.x29naybla.defendergarden.entity;

import com.x29naybla.defendergarden.DefenderGarden;
import com.x29naybla.defendergarden.entity.custom.SunflowerEntity;
import net.minecraft.ResourceLocationException;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DefenderGarden.MOD_ID);

    public static final RegistryObject<EntityType<SunflowerEntity>> SUNFLOWER =
            ENTITY_TYPES.register("sunflower",
                    () -> EntityType.Builder.of(SunflowerEntity::new, MobCategory.CREATURE)
                            .sized(0.4f, 1.0f)
                            .build(new ResourceLocation(DefenderGarden.MOD_ID,"sunflower").toString()));
    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
