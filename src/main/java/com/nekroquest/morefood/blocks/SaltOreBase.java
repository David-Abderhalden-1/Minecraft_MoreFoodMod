package com.nekroquest.morefood.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SaltOreBase extends Block {

    public SaltOreBase() {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(1.5f, 6f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .func_235861_h_()
        );
    }
}
