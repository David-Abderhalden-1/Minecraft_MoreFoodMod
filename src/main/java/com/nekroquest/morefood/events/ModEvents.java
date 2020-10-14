package com.nekroquest.morefood.events;

import com.nekroquest.morefood.MoreFood;
import com.nekroquest.morefood.util.RegistryHandler;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = MoreFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEvents {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event){

        //Render Types
        RenderTypeLookup.setRenderLayer(RegistryHandler.HERB.get(), RenderType.getCutout());
    }
}