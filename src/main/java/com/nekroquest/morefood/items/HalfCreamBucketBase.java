package com.nekroquest.morefood.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class HalfCreamBucketBase extends Item {
    public HalfCreamBucketBase() {
        super(new Properties().maxStackSize(1).group(ItemGroup.FOOD).food(new Food.Builder()
                .hunger(0)
                .setAlwaysEdible()
                .saturation(1)
                .build())
        );
    }
}

