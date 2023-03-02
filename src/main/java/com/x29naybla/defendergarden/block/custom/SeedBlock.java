package com.x29naybla.defendergarden.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SeedBlock extends PlantBlock{
    public SeedBlock(Properties properties) {
        super(properties);
    }

    private static final VoxelShape SHAPE = Block.box(6,0,6,11,5,11);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
}
