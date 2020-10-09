package com.nekroquest.morefood.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class RawFishSandwichBase extends Item {
    public RawFishSandwichBase() {
        super(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder()
                .hunger(6)
                .saturation(6f)
                .effect(new EffectInstance(Effects.HUNGER, 120, 1), 0.1f)
                .build())
        );
    }
}
