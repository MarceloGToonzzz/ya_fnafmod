package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.item.ItemStack;

public class FatPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("state");
	}
}
