/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hongxusworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.hongxusworld.HongxusWorldMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HongxusWorldModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HongxusWorldMod.MODID);
	public static final RegistryObject<CreativeModeTab> HONGXUS_WORK = REGISTRY.register("hongxus_work",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hongxus_world.hongxus_work")).icon(() -> new ItemStack(HongxusWorldModItems.WATCH_1.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HongxusWorldModItems.STARBUCKS.get());
				tabData.accept(HongxusWorldModItems.SHOUWO.get());
				tabData.accept(HongxusWorldModItems.WATCH_1.get());
				tabData.accept(HongxusWorldModItems.WATCH_500.get());
				tabData.accept(HongxusWorldModBlocks.REDTREELEAVES.get().asItem());
				tabData.accept(HongxusWorldModBlocks.REDTREESAPLING.get().asItem());
				tabData.accept(HongxusWorldModBlocks.REDTREELOG.get().asItem());
				tabData.accept(HongxusWorldModBlocks.STRIPPEDREDTREE_LOG.get().asItem());
				tabData.accept(HongxusWorldModBlocks.REDTREEPLANKS.get().asItem());
				tabData.accept(HongxusWorldModBlocks.HONG_ORE.get().asItem());
				tabData.accept(HongxusWorldModItems.HONG_INGOT.get());
				tabData.accept(HongxusWorldModItems.HONGPICKAXE.get());
				tabData.accept(HongxusWorldModBlocks.HONSNEYWORKER.get().asItem());
				tabData.accept(HongxusWorldModItems.HX_SPAWN_EGG.get());
				tabData.accept(HongxusWorldModItems.HONGSWORD.get());
				tabData.accept(HongxusWorldModBlocks.HONGSTONEBRICKS.get().asItem());
				tabData.accept(HongxusWorldModBlocks.REDSTONE.get().asItem());
				tabData.accept(HongxusWorldModBlocks.REREDCOBBLESTONE.get().asItem());
				tabData.accept(HongxusWorldModBlocks.WATCHMACHINE.get().asItem());
				tabData.accept(HongxusWorldModBlocks.REDBROKENORE.get().asItem());
				tabData.accept(HongxusWorldModItems.HONGNUGGETS.get());
				tabData.accept(HongxusWorldModItems.NORMALWATCH.get());
				tabData.accept(HongxusWorldModItems.WATCH_1000.get());
				tabData.accept(HongxusWorldModItems.WATCH_2000.get());
				tabData.accept(HongxusWorldModItems.WATCH_3000.get());
				tabData.accept(HongxusWorldModItems.WATCH_3000PINK.get());
				tabData.accept(HongxusWorldModItems.WATCHMACHINEUPDATE.get());
				tabData.accept(HongxusWorldModItems.RUBBISH.get());
				tabData.accept(HongxusWorldModItems.PUSHINGTORCH.get());
				tabData.accept(HongxusWorldModBlocks.REDBLOCK.get().asItem());
				tabData.accept(HongxusWorldModItems.KEY_1.get());
				tabData.accept(HongxusWorldModItems.KEY_2.get());
				tabData.accept(HongxusWorldModItems.KEY_3.get());
				tabData.accept(HongxusWorldModItems.KEY_4.get());
				tabData.accept(HongxusWorldModItems.KEY_5.get());
				tabData.accept(HongxusWorldModItems.KEY_6.get());
				tabData.accept(HongxusWorldModItems.KEY_7.get());
				tabData.accept(HongxusWorldModItems.KEY_8.get());
				tabData.accept(HongxusWorldModItems.KEY_9.get());
				tabData.accept(HongxusWorldModItems.KEY_10.get());
				tabData.accept(HongxusWorldModItems.KEY_11.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(HongxusWorldModBlocks.REDTREESAPLING.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(HongxusWorldModItems.HONGPICKAXE.get());
			tabData.accept(HongxusWorldModItems.HONGSWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(HongxusWorldModItems.HX_SPAWN_EGG.get());
			tabData.accept(HongxusWorldModItems.KLEEBOSS_SPAWN_EGG.get());
			tabData.accept(HongxusWorldModItems.QIQIBOSS_SPAWN_EGG.get());
			tabData.accept(HongxusWorldModItems.CHESTBOSS_SPAWN_EGG.get());
			tabData.accept(HongxusWorldModItems.COWBOSS_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(HongxusWorldModBlocks.REDSTONE.get().asItem());
			tabData.accept(HongxusWorldModBlocks.REREDCOBBLESTONE.get().asItem());
		}
	}
}