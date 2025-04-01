package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.item.ItemStack;

public class FatLetterPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("sel_letter");
	}
}
