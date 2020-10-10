package com.nekroquest.morefood.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class HalfCreamBase extends Item {
    public HalfCreamBase() {
        super(new Properties().group(ItemGroup.FOOD).food(new Food.Builder()
                .hunger(0)
                .setAlwaysEdible()
                .saturation(1)
                .build())
        );
    }
}

