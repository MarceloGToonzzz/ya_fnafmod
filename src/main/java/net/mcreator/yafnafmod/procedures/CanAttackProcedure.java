package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class CanAttackProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean result = false;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getPersistentData().getBoolean("hiding_mask") == true) {
			result = false;
		} else {
			result = true;
		}
		return result;
	}
}
