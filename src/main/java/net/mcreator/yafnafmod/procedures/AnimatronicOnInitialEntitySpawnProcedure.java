package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class AnimatronicOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("GotCordinates") == false) {
			entity.getPersistentData().putDouble("x", (entity.getX()));
			entity.getPersistentData().putDouble("y", (entity.getY()));
			entity.getPersistentData().putDouble("z", (entity.getZ()));
			entity.getPersistentData().putDouble("yaw", (entity.getYRot()));
			entity.getPersistentData().putBoolean("GotCordinates", true);
		}
		SettingSkinProcedure.execute(entity, entity.getPersistentData().getString("skin"), entity.getPersistentData().getString("style"));
	}
}
