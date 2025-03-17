package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.item.ItemStack;

public class FlashlightPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		double gadg = 0;
		if (itemstack.getOrCreateTag().getBoolean("damaged") == true) {
			gadg = 1;
		} else {
			gadg = 0;
		}
		return gadg;
	}
}
