package com.x29naybla.defendergarden.block;

import com.x29naybla.defendergarden.DefenderGarden;
import com.x29naybla.defendergarden.block.custom.*;
import com.x29naybla.defendergarden.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DefenderGarden.MOD_ID);

    public static RegistryObject<Block> SUNFLOWER = registerBlock("sunflower",
            () -> new SunflowerBlock(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0f).noOcclusion()), CreativeModeTab.TAB_MISC);
    public static RegistryObject<Block> PEASHOOTER = registerBlock("peashooter",
            () -> new PeashooterBlock(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0f).noOcclusion()), CreativeModeTab.TAB_MISC);
    public static RegistryObject<Block> SNOWPEA = registerBlock("snowpea",
            () -> new SnowpeaBlock(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0f).noOcclusion()), CreativeModeTab.TAB_MISC);
    public static RegistryObject<Block> REPEATER = registerBlock("repeater",
            () -> new RepeaterBlock(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0f).noOcclusion()), CreativeModeTab.TAB_MISC);


    public static RegistryObject<Block> PEASHOOTER_SEEDS = registerBlock("peashooter_seeds",
            () -> new SeedBlock(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0f).noOcclusion()), CreativeModeTab.TAB_MISC);
    public static RegistryObject<Block> SNOWPEA_SEEDS = registerBlock("snowpea_seeds",
            () -> new SeedBlock(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0f).noOcclusion()), CreativeModeTab.TAB_MISC);
    public static RegistryObject<Block> REPEATER_SEEDS = registerBlock("repeater_seeds",
            () -> new SeedBlock(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0f).noOcclusion()), CreativeModeTab.TAB_MISC);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
