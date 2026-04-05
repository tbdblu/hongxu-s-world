package net.mcreator.hongxusworld.block.grower;

import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.util.RandomSource;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.features.FeatureUtils;

public class RedtreesaplingTreeGrower extends AbstractTreeGrower {
	protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean hasFlower) {
		if (randomSource.nextFloat() < 0.1) {
			return FeatureUtils.createKey("hongxus_world:redtree");
		}
		return FeatureUtils.createKey("hongxus_world:redtree");
	}
}