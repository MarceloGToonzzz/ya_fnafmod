package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class ChildStateCanMoveProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean result = false;
		result = true;
		if (entity.getPersistentData().getDouble("aistate") == 2) {
			result = false;
		}
		return result;
	}
}
