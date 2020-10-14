package com.nekroquest.morefood.events;

import com.nekroquest.morefood.MoreFood;
import com.nekroquest.morefood.util.RegistryHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.wrapper.PlayerOffhandInvWrapper;


@Mod.EventBusSubscriber(modid = MoreFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {


    @SubscribeEvent
    public static void onEmptyCreamBucket(PlayerInteractEvent.RightClickItem event) {
        LivingEntity player = event.getEntityLiving();
        if (player.getHeldItemMainhand().getItem() == RegistryHandler.CREAM_BUCKET.get()) {

            int index = event.getPlayer().inventory.currentItem;
            event.getPlayer().inventory.setInventorySlotContents(index, new ItemStack(RegistryHandler.CREAM.get()));
            ItemHandlerHelper.giveItemToPlayer(event.getPlayer(), new ItemStack(Items.BUCKET));
        }
    }

    @SubscribeEvent
    public static void onDeleteBucket(PlayerEvent.ItemCraftedEvent event) {
        if (event.getCrafting().getItem() == RegistryHandler.HALF_CREAM_BUCKET.get()) {
            //After Bucket out of Crafting Inventory.
            //int index = event.getPlayer().inventory.getSlotFor(new ItemStack(Items.BUCKET));
            //event.getPlayer().inventory.setInventorySlotContents(index, new ItemStack(Items.AIR));
            PlayerEntity player = event.getPlayer();
            if (!event.getPlayer().getEntityWorld().isRemote) {
                String message = TextFormatting.RED + "Please remove one Bucket!";
                player.sendMessage(new StringTextComponent(message), player.getUniqueID());
            }
        }
    }
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