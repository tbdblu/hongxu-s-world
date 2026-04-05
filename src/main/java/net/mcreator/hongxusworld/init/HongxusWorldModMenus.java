/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hongxusworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.hongxusworld.world.inventory.WatchmachineguiMenu;
import net.mcreator.hongxusworld.world.inventory.RubbishpowergeneratorguiMenu;
import net.mcreator.hongxusworld.network.MenuStateUpdateMessage;
import net.mcreator.hongxusworld.HongxusWorldMod;

import java.util.Map;

public class HongxusWorldModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HongxusWorldMod.MODID);
	public static final RegistryObject<MenuType<WatchmachineguiMenu>> HONGXUSWORLDMODMENUS = REGISTRY.register("hongxusworldmodmenus", () -> IForgeMenuType.create(WatchmachineguiMenu::new));
	public static final RegistryObject<MenuType<RubbishpowergeneratorguiMenu>> RUBBISHPOWERGENERATORGUI = REGISTRY.register("rubbishpowergeneratorgui", () -> IForgeMenuType.create(RubbishpowergeneratorguiMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				HongxusWorldMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof HongxusWorldModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				HongxusWorldMod.PACKET_HANDLER.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}