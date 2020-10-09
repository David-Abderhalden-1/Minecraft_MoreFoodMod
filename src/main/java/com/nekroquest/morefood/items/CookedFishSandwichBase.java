package com.nekroquest.morefood.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CookedFishSandwichBase extends Item {
    public CookedFishSandwichBase() {
        super(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder()
                .hunger(7)
                .saturation(11f)
                .build())
        );
    }
}
