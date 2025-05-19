package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class IsTargetWearingMaskProcedure {
	public static boolean execute(Entity target) {
		if (target == null)
			return false;
		boolean can_attack = false;
		boolean is_wearing = false;
		if (target instanceof LivingEntity && target.getPersistentData().getBoolean("hiding_mask") == true) {
			is_wearing = true;
		} else {
			is_wearing = false;
		}
		return is_wearing;
	}
}
