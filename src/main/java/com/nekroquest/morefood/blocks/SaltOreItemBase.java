package com.nekroquest.morefood.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class SaltOreItemBase extends BlockItem {

    public SaltOreItemBase(Block block) {
        super(block, new Properties().group(ItemGroup.BUILDING_BLOCKS));
    }
}
