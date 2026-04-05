package net.mcreator.hongxusworld.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.hongxusworld.procedures.ShouwoWanJiaWanChengShiYongWuPinShiProcedure;

public class StarbucksItem extends Item {
	public StarbucksItem() {
		super(new Item.Properties().rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(17).saturationMod(0.3f).alwaysEat().build()));
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
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