package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.item.ItemStack;

public class MopPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("variant");
	}
}
