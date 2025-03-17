package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class FreddyMaskConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getBoolean("hiding_mask");
	}
}
