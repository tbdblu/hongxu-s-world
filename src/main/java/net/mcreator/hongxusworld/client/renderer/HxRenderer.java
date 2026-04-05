package net.mcreator.hongxusworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.hongxusworld.entity.HxEntity;

public class HxRenderer extends HumanoidMobRenderer<HxEntity, HumanoidModel<HxEntity>> {
	public HxRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<HxEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(HxEntity entity) {
		return new ResourceLocation("hongxus_world:textures/entities/skinseedskin_1770383192349.png");
	}
}