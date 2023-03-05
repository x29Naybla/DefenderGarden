package com.x29naybla.defendergarden.event;

import com.x29naybla.defendergarden.DefenderGarden;
import com.x29naybla.defendergarden.entity.ModEntityTypes;
import com.x29naybla.defendergarden.entity.custom.SunflowerEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DefenderGarden.MOD_ID)
public class ModEvents {

    //@SubscribeEvent
    public static class ForgeEvents{

    }

    @Mod.EventBusSubscriber(modid = DefenderGarden.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents{
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event){
            event.put(ModEntityTypes.SUNFLOWER.get(), SunflowerEntity.setAttributes());
        }

    }

}
