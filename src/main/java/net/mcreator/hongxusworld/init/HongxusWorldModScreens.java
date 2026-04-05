/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hongxusworld.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.hongxusworld.client.gui.WatchmachineguiScreen;
import net.mcreator.hongxusworld.client.gui.RubbishpowergeneratorguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HongxusWorldModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HongxusWorldModMenus.HONGXUSWORLDMODMENUS.get(), WatchmachineguiScreen::new);
			MenuScreens.register(HongxusWorldModMenus.RUBBISHPOWERGENERATORGUI.get(), RubbishpowergeneratorguiScreen::new);
		});
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}