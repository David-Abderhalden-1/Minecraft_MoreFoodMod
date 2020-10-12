package com.nekroquest.morefood.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CheeseBase extends Item {
    public CheeseBase() {
        super(new Properties().group(ItemGroup.FOOD).food(new Food.Builder()
                .hunger(5)
                .saturation(10)
                .build())
        );
    }
}

