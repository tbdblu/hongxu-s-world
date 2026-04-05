/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hongxusworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.hongxusworld.item.*;
import net.mcreator.hongxusworld.HongxusWorldMod;

public class HongxusWorldModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HongxusWorldMod.MODID);
	public static final RegistryObject<Item> STARBUCKS;
	public static final RegistryObject<Item> SHOUWO;
	public static final RegistryObject<Item> WATCH_1;
	public static final RegistryObject<Item> WATCH_500;
	public static final RegistryObject<Item> REDTREELEAVES;
	public static final RegistryObject<Item> REDTREESAPLING;
	public static final RegistryObject<Item> REDTREELOG;
	public static final RegistryObject<Item> STRIPPEDREDTREE_LOG;
	public static final RegistryObject<Item> REDTREEPLANKS;
	public static final RegistryObject<Item> HONG_ORE;
	public static final RegistryObject<Item> HONG_INGOT;
	public static final RegistryObject<Item> HONGPICKAXE;
	public static final RegistryObject<Item> HONSNEYWORKER;
	public static final RegistryObject<Item> HX_SPAWN_EGG;
	public static final RegistryObject<Item> HONGSWORD;
	public static final RegistryObject<Item> HONGSTONEBRICKS;
	public static final RegistryObject<Item> REDSTONE;
	public static final RegistryObject<Item> REREDCOBBLESTONE;
	public static final RegistryObject<Item> WATCHMACHINE;
	public static final RegistryObject<Item> REDBROKENORE;
	public static final RegistryObject<Item> HONGNUGGETS;
	public static final RegistryObject<Item> NORMALWATCH;
	public static final RegistryObject<Item> WATCH_1000;
	public static final RegistryObject<Item> WATCH_2000;
	public static final RegistryObject<Item> WATCH_3000;
	public static final RegistryObject<Item> WATCH_3000PINK;
	public static final RegistryObject<Item> WATCHMACHINEUPDATE;
	public static final RegistryObject<Item> RUBBISH;
	public static final RegistryObject<Item> REDPLATE;
	public static final RegistryObject<Item> PUSHINGTORCH;
	public static final RegistryObject<Item> REDBLOCK;
	public static final RegistryObject<Item> KEY_1;
	public static final RegistryObject<Item> KEY_2;
	public static final RegistryObject<Item> KEY_3;
	public static final RegistryObject<Item> KEY_4;
	public static final RegistryObject<Item> KEY_5;
	public static final RegistryObject<Item> KEY_6;
	public static final RegistryObject<Item> KEY_7;
	public static final RegistryObject<Item> KEY_8;
	public static final RegistryObject<Item> KEY_9;
	public static final RegistryObject<Item> KEY_10;
	public static final RegistryObject<Item> KEY_11;
	public static final RegistryObject<Item> KLEEBOSS_SPAWN_EGG;
	public static final RegistryObject<Item> QIQIBOSS_SPAWN_EGG;
	public static final RegistryObject<Item> CHESTBOSS_SPAWN_EGG;
	public static final RegistryObject<Item> COWBOSS_SPAWN_EGG;
	public static final RegistryObject<Item> RUBBISHPOWERGENERATOR;
	static {
		STARBUCKS = REGISTRY.register("starbucks", StarbucksItem::new);
		SHOUWO = REGISTRY.register("shouwo", ShouwoItem::new);
		WATCH_1 = REGISTRY.register("watch_1", Watch1Item::new);
		WATCH_500 = REGISTRY.register("watch_500", Watch500Item::new);
		REDTREELEAVES = block(HongxusWorldModBlocks.REDTREELEAVES);
		REDTREESAPLING = block(HongxusWorldModBlocks.REDTREESAPLING);
		REDTREELOG = block(HongxusWorldModBlocks.REDTREELOG);
		STRIPPEDREDTREE_LOG = block(HongxusWorldModBlocks.STRIPPEDREDTREE_LOG);
		REDTREEPLANKS = block(HongxusWorldModBlocks.REDTREEPLANKS);
		HONG_ORE = block(HongxusWorldModBlocks.HONG_ORE);
		HONG_INGOT = REGISTRY.register("hong_ingot", HongingotItem::new);
		HONGPICKAXE = REGISTRY.register("hongpickaxe", HongpickaxeItem::new);
		HONSNEYWORKER = block(HongxusWorldModBlocks.HONSNEYWORKER);
		HX_SPAWN_EGG = REGISTRY.register("hx_spawn_egg", () -> new ForgeSpawnEggItem(HongxusWorldModEntities.HX, -13108, -52429, new Item.Properties()));
		HONGSWORD = REGISTRY.register("hongsword", HongswordItem::new);
		HONGSTONEBRICKS = block(HongxusWorldModBlocks.HONGSTONEBRICKS);
		REDSTONE = block(HongxusWorldModBlocks.REDSTONE);
		REREDCOBBLESTONE = block(HongxusWorldModBlocks.REREDCOBBLESTONE);
		WATCHMACHINE = block(HongxusWorldModBlocks.WATCHMACHINE);
		REDBROKENORE = block(HongxusWorldModBlocks.REDBROKENORE);
		HONGNUGGETS = REGISTRY.register("hongnuggets", HongnuggetsItem::new);
		NORMALWATCH = REGISTRY.register("normalwatch", NormalwatchItem::new);
		WATCH_1000 = REGISTRY.register("watch_1000", Watch1000Item::new);
		WATCH_2000 = REGISTRY.register("watch_2000", Watch2000Item::new);
		WATCH_3000 = REGISTRY.register("watch_3000", Watch3000Item::new);
		WATCH_3000PINK = REGISTRY.register("watch_3000pink", Watch3000pinkItem::new);
		WATCHMACHINEUPDATE = REGISTRY.register("watchmachineupdate", WatchmachineupdateItem::new);
		RUBBISH = REGISTRY.register("rubbish", RubbishItem::new);
		REDPLATE = REGISTRY.register("redplate", RedplateItem::new);
		PUSHINGTORCH = REGISTRY.register("pushingtorch", PushingtorchItem::new);
		REDBLOCK = block(HongxusWorldModBlocks.REDBLOCK);
		KEY_1 = REGISTRY.register("key_1", Key1Item::new);
		KEY_2 = REGISTRY.register("key_2", Key2Item::new);
		KEY_3 = REGISTRY.register("key_3", Key3Item::new);
		KEY_4 = REGISTRY.register("key_4", Key4Item::new);
		KEY_5 = REGISTRY.register("key_5", Key5Item::new);
		KEY_6 = REGISTRY.register("key_6", Key6Item::new);
		KEY_7 = REGISTRY.register("key_7", Key7Item::new);
		KEY_8 = REGISTRY.register("key_8", Key8Item::new);
		KEY_9 = REGISTRY.register("key_9", Key9Item::new);
		KEY_10 = REGISTRY.register("key_10", Key10Item::new);
		KEY_11 = REGISTRY.register("key_11", Key11Item::new);
		KLEEBOSS_SPAWN_EGG = REGISTRY.register("kleeboss_spawn_egg", () -> new ForgeSpawnEggItem(HongxusWorldModEntities.KLEEBOSS, -1, -1, new Item.Properties()));
		QIQIBOSS_SPAWN_EGG = REGISTRY.register("qiqiboss_spawn_egg", () -> new ForgeSpawnEggItem(HongxusWorldModEntities.QIQIBOSS, -1, -1, new Item.Properties()));
		CHESTBOSS_SPAWN_EGG = REGISTRY.register("chestboss_spawn_egg", () -> new ForgeSpawnEggItem(HongxusWorldModEntities.CHESTBOSS, -1, -1, new Item.Properties()));
		COWBOSS_SPAWN_EGG = REGISTRY.register("cowboss_spawn_egg", () -> new ForgeSpawnEggItem(HongxusWorldModEntities.COWBOSS, -1, -1, new Item.Properties()));
		RUBBISHPOWERGENERATOR = block(HongxusWorldModBlocks.RUBBISHPOWERGENERATOR);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}