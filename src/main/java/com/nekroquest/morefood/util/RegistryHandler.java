package com.nekroquest.morefood.util;

import com.nekroquest.morefood.MoreFood;
import com.nekroquest.morefood.blocks.SaltOreBase;
import com.nekroquest.morefood.blocks.SaltOreItemBase;
import com.nekroquest.morefood.items.SaltBase;
import net.minecraft.block.Block;
import net.minecraft.data.LootTableProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.*;
import net.minecraft.loot.conditions.KilledByPlayer;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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

    //Blocks
    public static final RegistryObject<Block> SALT_ORE = BLOCKS.register("salt_ore", SaltOreBase::new);

    //Block Items
    public static final RegistryObject<Item> SALT_ORE_ITEM = ITEMS.register("salt_ore", () -> new SaltOreItemBase(SALT_ORE.get()));

    //Events


}

