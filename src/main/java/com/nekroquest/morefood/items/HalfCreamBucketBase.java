package com.nekroquest.morefood.items;

import net.minecraft.item.Food;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.MilkBucketItem;

public class HalfCreamBucketBase extends MilkBucketItem {
    public HalfCreamBucketBase() {
        super(new Properties().maxStackSize(1).group(ItemGroup.MATERIALS).food(new Food.Builder()
                .hunger(0)
                .setAlwaysEdible()
                .saturation(1)
                .build())
        );
    }
}

