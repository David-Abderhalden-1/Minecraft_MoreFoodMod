package com.nekroquest.morefood.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FleshBase extends Item {
    public FleshBase() {
        super(new Properties().group(ItemGroup.FOOD).food(new Food.Builder()
                .hunger(4)
                .saturation(0.8f)
                .meat()
                .fastToEat()
                .build())
        );
    }
}
