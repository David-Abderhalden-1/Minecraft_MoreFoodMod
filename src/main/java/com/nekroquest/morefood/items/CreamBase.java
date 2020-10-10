package com.nekroquest.morefood.items;

import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CreamBase extends Item {
    public CreamBase() {
        super(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder()
                .hunger(0)
                .setAlwaysEdible()
                .saturation(5)
                .effect(new EffectInstance(Effects.MINING_FATIGUE, 1000, 1), 0.5f)
                .build())
        );
    }
}

