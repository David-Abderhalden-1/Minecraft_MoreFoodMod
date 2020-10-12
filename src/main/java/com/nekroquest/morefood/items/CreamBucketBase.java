package com.nekroquest.morefood.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CreamBucketBase extends Item {
    public CreamBucketBase() {
        super(new Properties().maxStackSize(1).group(ItemGroup.MATERIALS));
    }
}
