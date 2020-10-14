package com.nekroquest.morefood.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class HerbItemBase extends BlockItem {

    public HerbItemBase(Block block) {
        super(block, new Properties().group(ItemGroup.DECORATIONS));
    }
}
