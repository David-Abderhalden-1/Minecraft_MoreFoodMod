package com.nekroquest.morefood.events;

import com.nekroquest.morefood.MoreFood;
import com.nekroquest.morefood.util.RegistryHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = MoreFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent //addItemStackToInventory(new ItemStack(Items.BUCKET, 1))
    public static void onReturnBowl(PlayerInteractEvent.RightClickItem event)
    {
        LivingEntity player = event.getEntityLiving();
        if(player.getHeldItemMainhand().getItem() == RegistryHandler.HALF_CREAM_BUCKET.get()) {

            int index = event.getPlayer().inventory.getSlotFor(new ItemStack(RegistryHandler.HALF_CREAM_BUCKET.get()));
            event.getPlayer().inventory.setInventorySlotContents(index, new ItemStack(Items.BUCKET));
        }
    }
}
