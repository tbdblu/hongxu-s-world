package net.mcreator.hongxusworld.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.hongxusworld.procedures.ShouwoWanJiaWanChengShiYongWuPinShiProcedure;

public class ShouwoItem extends Item {
	public ShouwoItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(20).saturationMod(10f).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		ShouwoWanJiaWanChengShiYongWuPinShiProcedure.execute(entity);
		return retval;
	}
}