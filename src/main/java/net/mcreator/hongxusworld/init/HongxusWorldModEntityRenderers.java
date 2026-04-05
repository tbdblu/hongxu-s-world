/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hongxusworld.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.hongxusworld.client.renderer.QiqibossRenderer;
import net.mcreator.hongxusworld.client.renderer.KleebossRenderer;
import net.mcreator.hongxusworld.client.renderer.HxRenderer;
import net.mcreator.hongxusworld.client.renderer.CowbossRenderer;
import net.mcreator.hongxusworld.client.renderer.ChestbossRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HongxusWorldModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HongxusWorldModEntities.WATCH.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HongxusWorldModEntities.HX.get(), HxRenderer::new);
		event.registerEntityRenderer(HongxusWorldModEntities.KLEEBOSS.get(), KleebossRenderer::new);
		event.registerEntityRenderer(HongxusWorldModEntities.QIQIBOSS.get(), QiqibossRenderer::new);
		event.registerEntityRenderer(HongxusWorldModEntities.CHESTBOSS.get(), ChestbossRenderer::new);
		event.registerEntityRenderer(HongxusWorldModEntities.COWBOSS.get(), CowbossRenderer::new);
	}
}