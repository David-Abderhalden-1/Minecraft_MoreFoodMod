package com.nekroquest.morefood.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;


public class WhiteCheeseBase extends Item {
    public WhiteCheeseBase() {
        super(new Properties().group(ItemGroup.FOOD).food(new Food.Builder()
                .hunger(5)
                .saturation(10)
                .effect(new EffectInstance(Effects.NAUSEA, 1000, 3), 1)
                .effect(new EffectInstance(Effects.HUNGER, 1000, 5), 0.5f)
                .effect(new EffectInstance(Effects.BLINDNESS, 1000, 1), 0.4f)
                .build())
        );
    }
}

