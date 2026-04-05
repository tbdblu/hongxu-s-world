/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hongxusworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.hongxusworld.entity.*;
import net.mcreator.hongxusworld.HongxusWorldMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HongxusWorldModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HongxusWorldMod.MODID);
	public static final RegistryObject<EntityType<WatchEntity>> WATCH = register("watch",
			EntityType.Builder.<WatchEntity>of(WatchEntity::new, MobCategory.MISC).setCustomClientFactory(WatchEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HxEntity>> HX = register("hx",
			EntityType.Builder.<HxEntity>of(HxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HxEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KleebossEntity>> KLEEBOSS = register("kleeboss",
			EntityType.Builder.<KleebossEntity>of(KleebossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KleebossEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<QiqibossEntity>> QIQIBOSS = register("qiqiboss",
			EntityType.Builder.<QiqibossEntity>of(QiqibossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(QiqibossEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChestbossEntity>> CHESTBOSS = register("chestboss",
			EntityType.Builder.<ChestbossEntity>of(ChestbossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChestbossEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CowbossEntity>> COWBOSS = register("cowboss",
			EntityType.Builder.<CowbossEntity>of(CowbossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CowbossEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			HxEntity.init();
			KleebossEntity.init();
			QiqibossEntity.init();
			ChestbossEntity.init();
			CowbossEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(HX.get(), HxEntity.createAttributes().build());
		event.put(KLEEBOSS.get(), KleebossEntity.createAttributes().build());
		event.put(QIQIBOSS.get(), QiqibossEntity.createAttributes().build());
		event.put(CHESTBOSS.get(), ChestbossEntity.createAttributes().build());
		event.put(COWBOSS.get(), CowbossEntity.createAttributes().build());
	}
}