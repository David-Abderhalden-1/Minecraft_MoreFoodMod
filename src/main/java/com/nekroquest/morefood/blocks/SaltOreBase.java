package com.nekroquest.morefood.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class SaltOreBase extends OreBlock {

    public SaltOreBase() {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(1.5f, 6f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .func_235861_h_()
        );
    }
    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
            return 1;
    }
}
