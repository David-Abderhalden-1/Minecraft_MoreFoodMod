package com.nekroquest.morefood.util;

import com.nekroquest.morefood.MoreFood;
import com.nekroquest.morefood.blocks.HerbBase;
import com.nekroquest.morefood.blocks.HerbItemBase;
import com.nekroquest.morefood.blocks.SaltOreBase;
import com.nekroquest.morefood.blocks.SaltOreItemBase;
import com.nekroquest.morefood.items.*;
import com.nekroquest.morefood.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
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
    public static final RegistryObject<Item> OLD_FLESH = ITEMS.register("old_flesh", OldFleshBase::new);
    public static final RegistryObject<Item> FLESH = ITEMS.register("flesh", FleshBase::new);
    public static final RegistryObject<Item> PARSLEY = ITEMS.register("parsley", ParsleyBase::new);
    public static final RegistryObject<Item> BASIL = ITEMS.register("basil", BasilBase::new);
    public static final RegistryObject<Item> ROSEMARY = ITEMS.register("rosemary", RosemaryBase::new);

    //Tools
    public static final RegistryObject<SwordItem> SCRAPER = ITEMS.register("scraper", () -> new SwordItem(ModItemTier.SCRAPER, 0, 0, new Item.Properties().group(ItemGroup.TOOLS).setNoRepair()));

    //Blocks
    public static final RegistryObject<Block> SALT_ORE = BLOCKS.register("salt_ore", SaltOreBase::new);
    public static final RegistryObject<Block> HERB = BLOCKS.register("herb", HerbBase::new);

    //Block Items
    public static final RegistryObject<Item> SALT_ORE_ITEM = ITEMS.register("salt_ore", () -> new SaltOreItemBase(SALT_ORE.get()));
    public static final RegistryObject<Item> HERB_ITEM = ITEMS.register("herb", () -> new HerbItemBase(HERB.get()));

    //Events

}

