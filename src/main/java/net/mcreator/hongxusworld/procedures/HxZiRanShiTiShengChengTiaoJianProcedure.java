package net.mcreator.hongxusworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.hongxusworld.init.HongxusWorldModEntities;

public class HxZiRanShiTiShengChengTiaoJianProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double number = 0;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("hongxus_world:redworld")) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && number <= 10 && Mth.nextInt(RandomSource.create(), 1, 100) < 10) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = HongxusWorldModEntities.HX.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		}
	}
}