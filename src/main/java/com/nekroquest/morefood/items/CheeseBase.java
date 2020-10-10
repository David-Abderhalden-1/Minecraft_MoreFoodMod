package com.nekroquest.morefood.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CheeseBase extends Item {
    public CheeseBase() {
        super(new Properties().group(ItemGroup.FOOD).food(new Food.Builder()
                .hunger(5)
                .saturation(10)
                .build())
        );
    }
}

