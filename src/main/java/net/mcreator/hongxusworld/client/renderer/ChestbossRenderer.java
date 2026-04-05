package net.mcreator.hongxusworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.hongxusworld.entity.ChestbossEntity;

public class ChestbossRenderer extends HumanoidMobRenderer<ChestbossEntity, HumanoidModel<ChestbossEntity>> {
	public ChestbossRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<ChestbossEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(ChestbossEntity entity) {
		return new ResourceLocation("hongxus_world:textures/entities/chestboss.png");
	}
}