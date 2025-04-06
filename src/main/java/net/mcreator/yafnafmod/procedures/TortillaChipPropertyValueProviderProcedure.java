package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.item.ItemStack;

public class TortillaChipPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("dip");
	}
}
