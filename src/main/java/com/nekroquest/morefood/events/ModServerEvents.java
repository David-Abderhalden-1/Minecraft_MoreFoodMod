package com.nekroquest.morefood.events;

import com.nekroquest.morefood.MoreFood;
import com.nekroquest.morefood.util.RegistryHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.ItemHandlerHelper;


@Mod.EventBusSubscriber(modid = MoreFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.DEDICATED_SERVER)
public class ModServerEvents {


    //@SubscribeEvent
    //public static void onScrapeSneak(InputUpdateEvent event) {
    //LivingEntity player = event.getEntityLiving();
    //if (event.getMovementInput().sneaking){
    //if (player.getHeldItemMainhand().getItem() == RegistryHandler.SCRAPER.get()) {
    //if (player.getHeldItemOffhand().getItem() == Items.ROTTEN_FLESH) {
                    //event.getPlayer().addItemStackToInventory(new ItemStack(RegistryHandler.OLD_FLESH.get()));
    //ItemHandlerHelper.giveItemToPlayer(event.getPlayer(), new ItemStack(RegistryHandler.OLD_FLESH.get()));
    //}

    //}
    //}
    //}
}