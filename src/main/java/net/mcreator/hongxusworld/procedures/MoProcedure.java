package net.mcreator.hongxusworld.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.hongxusworld.network.HongxusWorldModVariables;

public class MoProcedure {
	public static boolean execute(LevelAccessor world) {
		if (HongxusWorldModVariables.MapVariables.get(world).machine_no == 1) {
			return true;
		}
		return false;
	}
}