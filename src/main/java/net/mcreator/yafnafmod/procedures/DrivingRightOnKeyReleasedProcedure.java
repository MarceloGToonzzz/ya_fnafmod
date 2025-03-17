package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class DrivingRightOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("DPress", 0);
	}
}
