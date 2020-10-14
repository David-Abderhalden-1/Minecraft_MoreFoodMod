package com.nekroquest.morefood.blocks;

import javafx.geometry.Side;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;

public class HerbBase extends TallGrassBlock {

    public HerbBase() {
        super(Properties.create(Material.PLANTS)
                .sound(SoundType.PLANT)
                .harvestLevel(0)
                .notSolid()
                .zeroHardnessAndResistance()
                .doesNotBlockMovement()
        );
    }

}