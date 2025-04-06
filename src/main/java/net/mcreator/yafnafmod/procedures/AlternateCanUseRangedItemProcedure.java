package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class AlternateCanUseRangedItemProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean result = false;
		if (entity.isShiftKeyDown()) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
