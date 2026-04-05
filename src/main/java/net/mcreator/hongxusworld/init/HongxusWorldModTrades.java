/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.hongxusworld.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class HongxusWorldModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == HongxusWorldModVillagerProfessions.HONSNEYVILLAGER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(HongxusWorldModItems.HONG_INGOT.get(), 3), new ItemStack(HongxusWorldModItems.HONGSWORD.get()), 15, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(HongxusWorldModItems.HONG_INGOT.get()), new ItemStack(HongxusWorldModBlocks.REDTREESAPLING.get(), 3), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(HongxusWorldModBlocks.REDTREELOG.get(), 32), new ItemStack(HongxusWorldModItems.HONG_INGOT.get(), 2), 10, 5, 0.05f));
			event.getTrades().get(4)
					.add(new BasicItemListing(new ItemStack(HongxusWorldModItems.HONG_INGOT.get(), 64), new ItemStack(HongxusWorldModBlocks.STRIPPEDREDTREE_LOG.get(), 32), new ItemStack(HongxusWorldModBlocks.WATCHMACHINE.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(HongxusWorldModItems.NORMALWATCH.get()), new ItemStack(HongxusWorldModItems.HONG_INGOT.get(), 4), new ItemStack(HongxusWorldModItems.WATCH_500.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(HongxusWorldModItems.HONG_INGOT.get(), 2), new ItemStack(HongxusWorldModItems.REDPLATE.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(HongxusWorldModItems.WATCH_3000.get()), new ItemStack(HongxusWorldModItems.HONG_INGOT.get(), 24), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(HongxusWorldModItems.WATCH_500.get()), new ItemStack(HongxusWorldModItems.HONG_INGOT.get(), 6), 10, 5, 0.05f));
		}
	}
}