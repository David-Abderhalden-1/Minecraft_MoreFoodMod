package com.nekroquest.morefood.world.gen;

import com.nekroquest.morefood.MoreFood;
import com.nekroquest.morefood.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureRadiusConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;

@Mod.EventBusSubscriber(modid = MoreFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModPlantGen {

    @SubscribeEvent
    public static void generatePlants(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {

            if (biome.getCategory() == Biome.Category.NETHER) {

            } else if (biome.getCategory() == Biome.Category.THEEND) {

            } else {

            }
        }
    }

    private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
        this.addHerb(RegistryHandler.HERB.get(), world, random, chunkX, chunkZ);
    }

    public void addHerb(Block block, World world, Random random, int chunkX, int chunkZ) {
        for (int i = 0; i < 20; i++) {
            int posX = chunkX + random.nextInt(16);
            int posZ = chunkZ + random.nextInt(16);
            int posY = 40 + random.nextInt(25);

        }
    }
}
