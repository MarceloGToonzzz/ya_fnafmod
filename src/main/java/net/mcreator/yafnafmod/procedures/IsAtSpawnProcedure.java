package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class IsAtSpawnProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean isthere = false;
		if (entity.getX() == entity.getPersistentData().getDouble("x") && entity.getY() == entity.getPersistentData().getDouble("y") && entity.getZ() == entity.getPersistentData().getDouble("z")) {
			isthere = true;
		} else {
			isthere = false;
		}
		return isthere;
	}
}
