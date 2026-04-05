/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hongxusworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.hongxusworld.block.*;
import net.mcreator.hongxusworld.HongxusWorldMod;

public class HongxusWorldModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HongxusWorldMod.MODID);
	public static final RegistryObject<Block> REDTREELEAVES;
	public static final RegistryObject<Block> REDTREESAPLING;
	public static final RegistryObject<Block> REDTREELOG;
	public static final RegistryObject<Block> STRIPPEDREDTREE_LOG;
	public static final RegistryObject<Block> REDTREEPLANKS;
	public static final RegistryObject<Block> HONG_ORE;
	public static final RegistryObject<Block> HONSNEYWORKER;
	public static final RegistryObject<Block> HONGSTONEBRICKS;
	public static final RegistryObject<Block> REDSTONE;
	public static final RegistryObject<Block> REREDCOBBLESTONE;
	public static final RegistryObject<Block> WATCHMACHINE;
	public static final RegistryObject<Block> REDBROKENORE;
	public static final RegistryObject<Block> REDBLOCK;
	public static final RegistryObject<Block> RUBBISHPOWERGENERATOR;
	static {
		REDTREELEAVES = REGISTRY.register("redtreeleaves", RedtreeleavesBlock::new);
		REDTREESAPLING = REGISTRY.register("redtreesapling", RedtreesaplingBlock::new);
		REDTREELOG = REGISTRY.register("redtreelog", RedtreelogBlock::new);
		STRIPPEDREDTREE_LOG = REGISTRY.register("strippedredtree_log", StrippedredtreeLogBlock::new);
		REDTREEPLANKS = REGISTRY.register("redtreeplanks", RedtreeplanksBlock::new);
		HONG_ORE = REGISTRY.register("hong_ore", HongoreBlock::new);
		HONSNEYWORKER = REGISTRY.register("honsneyworker", HonsneyworkerBlock::new);
		HONGSTONEBRICKS = REGISTRY.register("hongstonebricks", HongstonebricksBlock::new);
		REDSTONE = REGISTRY.register("redstone", RedstoneBlock::new);
		REREDCOBBLESTONE = REGISTRY.register("reredcobblestone", ReredcobblestoneBlock::new);
		WATCHMACHINE = REGISTRY.register("watchmachine", WatchmachineBlock::new);
		REDBROKENORE = REGISTRY.register("redbrokenore", RedbrokenoreBlock::new);
		REDBLOCK = REGISTRY.register("redblock", RedblockBlock::new);
		RUBBISHPOWERGENERATOR = REGISTRY.register("rubbishpowergenerator", RubbishpowergeneratorBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}