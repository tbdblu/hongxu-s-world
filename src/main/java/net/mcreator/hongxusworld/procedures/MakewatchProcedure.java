package net.mcreator.hongxusworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.hongxusworld.network.HongxusWorldModVariables;
import net.mcreator.hongxusworld.init.HongxusWorldModMenus;
import net.mcreator.hongxusworld.init.HongxusWorldModItems;

public class MakewatchProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double randomnumber = 0;
		double createwhat = 0;
		double plus = 0;
		double random2 = 0;
		createwhat = 0;
		HongxusWorldModVariables.MapVariables.get(world).machine_no = 0;
		HongxusWorldModVariables.MapVariables.get(world).markSyncDirty();
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == HongxusWorldModItems.NORMALWATCH.get()) {
			createwhat = 1;
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == HongxusWorldModItems.WATCH_1.get()) {
			createwhat = 2;
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == HongxusWorldModItems.WATCH_500.get()) {
			createwhat = 3;
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == HongxusWorldModItems.WATCH_1000.get()) {
			createwhat = 4;
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == HongxusWorldModItems.WATCH_2000.get()) {
			createwhat = 5;
		}
		if (createwhat == 0) {
			HongxusWorldModVariables.MapVariables.get(world).machine_no = 1;
			HongxusWorldModVariables.MapVariables.get(world).markSyncDirty();
		} else {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == HongxusWorldModItems.WATCHMACHINEUPDATE
					.get()) {
				plus = getAmountInGUISlot(entity, 3);
			}
			randomnumber = Mth.nextInt(RandomSource.create(), 1, 1000);
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT) {
				if (20 + 10 * plus >= 1000 ? true : randomnumber <= 20 + 10 * plus) {
					createwhat = createwhat + 1;
				} else {
					createwhat = 0;
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu16 ? _menu16.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == HongxusWorldModItems.HONG_INGOT
					.get()) {
				if (600 + 10 * plus >= 1000 ? true : randomnumber <= 600 + 10 * plus) {
					createwhat = createwhat + 1;
				} else {
					createwhat = 0;
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu18 ? _menu18.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.GOLD_INGOT) {
				if (100 + 10 * plus >= 1000 ? true : randomnumber <= 100 + 10 * plus) {
					createwhat = createwhat + 1;
				} else {
					createwhat = 0;
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu20 ? _menu20.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND) {
				if (200 + 10 * plus >= 1000 ? true : randomnumber <= 200 + 10 * plus) {
					createwhat = createwhat + 1;
				} else {
					createwhat = 0;
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu22 ? _menu22.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.EMERALD) {
				if (300 + 10 * plus >= 1000 ? true : randomnumber <= 300 + 10 * plus) {
					createwhat = createwhat + 1;
				} else {
					createwhat = 0;
				}
			} else {
				HongxusWorldModVariables.MapVariables.get(world).machine_no = 1;
				HongxusWorldModVariables.MapVariables.get(world).markSyncDirty();
			}
		}
		if (HongxusWorldModVariables.MapVariables.get(world).machine_no == 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_menu.getSlots().get(2).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			random2 = Mth.nextInt(RandomSource.create(), 1, 10);
			if (createwhat == 0) {
				if (entity instanceof Player _player && _player.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu) {
					ItemStack _setstack27 = new ItemStack(HongxusWorldModItems.RUBBISH.get()).copy();
					_setstack27.setCount(5);
					_menu.getSlots().get(0).set(_setstack27);
					_player.containerMenu.broadcastChanges();
				}
			} else if (createwhat == 2) {
				if (entity instanceof Player _player && _player.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu) {
					ItemStack _setstack28 = new ItemStack(HongxusWorldModItems.WATCH_1.get()).copy();
					_setstack28.setCount(1);
					_menu.getSlots().get(0).set(_setstack28);
					_player.containerMenu.broadcastChanges();
				}
			} else if (createwhat == 3) {
				if (random2 <= 8) {
					if (entity instanceof Player _player && _player.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu) {
						ItemStack _setstack29 = new ItemStack(HongxusWorldModItems.WATCH_500.get()).copy();
						_setstack29.setCount(1);
						_menu.getSlots().get(0).set(_setstack29);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (entity instanceof Player _player && _player.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu) {
						ItemStack _setstack30 = new ItemStack(HongxusWorldModItems.WATCH_1.get()).copy();
						_setstack30.setCount(1);
						_menu.getSlots().get(0).set(_setstack30);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if (createwhat == 4) {
				if (random2 <= 6) {
					if (entity instanceof Player _player && _player.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu) {
						ItemStack _setstack31 = new ItemStack(HongxusWorldModItems.WATCH_1000.get()).copy();
						_setstack31.setCount(1);
						_menu.getSlots().get(0).set(_setstack31);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (entity instanceof Player _player && _player.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu) {
						ItemStack _setstack32 = new ItemStack(HongxusWorldModItems.WATCH_500.get()).copy();
						_setstack32.setCount(1);
						_menu.getSlots().get(0).set(_setstack32);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if (createwhat == 5) {
				if (random2 <= 4) {
					if (entity instanceof Player _player && _player.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu) {
						ItemStack _setstack33 = new ItemStack(HongxusWorldModItems.WATCH_2000.get()).copy();
						_setstack33.setCount(1);
						_menu.getSlots().get(0).set(_setstack33);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (entity instanceof Player _player && _player.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu) {
						ItemStack _setstack34 = new ItemStack(HongxusWorldModItems.WATCH_1000.get()).copy();
						_setstack34.setCount(1);
						_menu.getSlots().get(0).set(_setstack34);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if (createwhat == 6) {
				if (random2 <= 4) {
					if (entity instanceof Player _player && _player.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu) {
						ItemStack _setstack35 = new ItemStack(HongxusWorldModItems.WATCH_3000.get()).copy();
						_setstack35.setCount(1);
						_menu.getSlots().get(0).set(_setstack35);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (entity instanceof Player _player && _player.containerMenu instanceof HongxusWorldModMenus.MenuAccessor _menu) {
						ItemStack _setstack36 = new ItemStack(HongxusWorldModItems.WATCH_2000.get()).copy();
						_setstack36.setCount(1);
						_menu.getSlots().get(0).set(_setstack36);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
		}
	}

	private static int getAmountInGUISlot(Entity entity, int sltid) {
		if (entity instanceof Player player && player.containerMenu instanceof HongxusWorldModMenus.MenuAccessor menuAccessor) {
			ItemStack stack = menuAccessor.getSlots().get(sltid).getItem();
			if (stack != null)
				return stack.getCount();
		}
		return 0;
	}
}