package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class SetNbtPositionsProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean can_laugh = false;
		if (entity.getPersistentData().getBoolean("GotCordinates") == false) {
			entity.getPersistentData().putDouble("x", x);
			entity.getPersistentData().putDouble("y", y);
			entity.getPersistentData().putDouble("z", z);
			entity.getPersistentData().putDouble("yaw", (entity.getYRot()));
			entity.getPersistentData().putBoolean("GotCordinates", true);
		}
	}
}
