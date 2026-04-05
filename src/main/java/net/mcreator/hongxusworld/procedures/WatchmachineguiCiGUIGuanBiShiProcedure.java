package net.mcreator.hongxusworld.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.hongxusworld.network.HongxusWorldModVariables;

public class WatchmachineguiCiGUIGuanBiShiProcedure {
	public static void execute(LevelAccessor world) {
		HongxusWorldModVariables.MapVariables.get(world).machine_no = 0;
		HongxusWorldModVariables.MapVariables.get(world).markSyncDirty();
	}
}