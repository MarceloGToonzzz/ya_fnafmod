package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class AnimatronicOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		double a = 0;
		if (entity.getPersistentData().getBoolean("GotCordinates") == false) {
			entity.getPersistentData().putDouble("x", (entity.getX()));
			entity.getPersistentData().putDouble("y", (entity.getY()));
			entity.getPersistentData().putDouble("z", (entity.getZ()));
			entity.getPersistentData().putDouble("yaw", (entity.getYRot()));
			entity.getPersistentData().putBoolean("GotCordinates", true);
		}
		SettingSkinProcedure.execute(entity, entity.getPersistentData().getDouble("skin"), entity.getPersistentData().getDouble("style"));
	}
}
