package net.mcreator.hongxusworld.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.hongxusworld.init.HongxusWorldModMenus;
import net.mcreator.hongxusworld.init.HongxusWorldModItems;

import java.util.concurrent.atomic.AtomicInteger;

public class RubbishpowergeneratorguiCiGUIDaKaiShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double energy = 0;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == HongxusWorldModItems.RUBBISH.get()) {
			if (energy >= 400000) {
				energy = 400000;
			} else {
				energy = energy + 500;
				if (entity instanceof Player _player && _player.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(0).remove(1);
					_player.containerMenu.broadcastChanges();
				}
			}
			if (extractEnergySimulate(world, BlockPos.containing(x, y, z), 100, null) == 100) {
				if (energy >= 0) {
					energy = energy - 100;
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 100;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu) {
						_menu.getSlots().get(0).remove(1);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
		}
	}

	private static int extractEnergySimulate(LevelAccessor level, BlockPos pos, int amount, Direction direction) {
		AtomicInteger result = new AtomicInteger(0);
		BlockEntity entity = level.getBlockEntity(pos);
		if (entity != null)
			entity.getCapability(ForgeCapabilities.ENERGY, direction).ifPresent(capability -> result.set(capability.extractEnergy(amount, true)));
		return result.get();
	}
}