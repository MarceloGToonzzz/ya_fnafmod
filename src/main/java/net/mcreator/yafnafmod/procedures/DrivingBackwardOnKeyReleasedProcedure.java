package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class DrivingBackwardOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("SPress", 0);
	}
}
