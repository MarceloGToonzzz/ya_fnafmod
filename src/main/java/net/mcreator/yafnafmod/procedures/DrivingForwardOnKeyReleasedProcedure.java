package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class DrivingForwardOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("WPress", 0);
	}
}
