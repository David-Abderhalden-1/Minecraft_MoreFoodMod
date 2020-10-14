package com.nekroquest.morefood.events;

import com.nekroquest.morefood.MoreFood;
import com.nekroquest.morefood.util.RegistryHandler;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.items.ItemHandlerHelper;


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
    private void clientSetup(final FMLClientSetupEvent event){

        //Render Types
        RenderTypeLookup.setRenderLayer(RegistryHandler.HERB.get(), RenderType.getCutout());
    }
}