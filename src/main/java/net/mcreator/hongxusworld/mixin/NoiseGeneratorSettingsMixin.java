package net.mcreator.hongxusworld.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.hongxusworld.init.HongxusWorldModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements HongxusWorldModBiomes.HongxusWorldModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> hongxus_world_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.hongxus_world_dimensionTypeReference != null) {
			retval = HongxusWorldModBiomes.adaptSurfaceRule(retval, this.hongxus_world_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void sethongxus_worldDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.hongxus_world_dimensionTypeReference = dimensionType;
	}
}