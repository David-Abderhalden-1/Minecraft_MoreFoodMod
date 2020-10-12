package com.nekroquest.morefood.util;

import com.nekroquest.morefood.MoreFood;
import com.nekroquest.morefood.blocks.SaltOreBase;
import com.nekroquest.morefood.blocks.SaltOreItemBase;
import com.nekroquest.morefood.items.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreFood.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreFood.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    //Items
    public static final RegistryObject<Item> SALT = ITEMS.register("salt", SaltBase::new);
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", TomatoBase::new);
    public static final RegistryObject<Item> COOKED_FISH_SANDWICH = ITEMS.register("cooked_fish_sandwich", CookedFishSandwichBase::new);
    public static final RegistryObject<Item> RAW_FISH_SANDWICH = ITEMS.register("raw_fish_sandwich", RawFishSandwichBase::new);
    public static final RegistryObject<Item> CREAM = ITEMS.register("cream", CreamBase::new);
    public static final RegistryObject<Item> CREAM_BUCKET = ITEMS.register("cream_bucket", CreamBucketBase::new);
    public static final RegistryObject<Item> HALF_CREAM_BUCKET = ITEMS.register("half_cream_bucket", HalfCreamBucketBase::new);
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", CheeseBase::new);
    public static final RegistryObject<Item> WHITE_CHEESE = ITEMS.register("white_cheese", WhiteCheeseBase::new);

    //Blocks
    public static final RegistryObject<Block> SALT_ORE = BLOCKS.register("salt_ore", SaltOreBase::new);

    //Block Items
    public static final RegistryObject<Item> SALT_ORE_ITEM = ITEMS.register("salt_ore", () -> new SaltOreItemBase(SALT_ORE.get()));

    //Events

}

