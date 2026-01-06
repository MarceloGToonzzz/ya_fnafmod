package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.network.YaFnafmodModVariables;

public class SetNbtPositionsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean can_laugh = false;
		double a = 0;
		if (YaFnafmodModVariables.MapVariables.get(world).STRUCTUREBUILD_BUILD == false) {
			if (entity.getPersistentData().getBoolean("GotCordinates") == false) {
				entity.getPersistentData().putDouble("x", x);
				entity.getPersistentData().putDouble("y", y);
				entity.getPersistentData().putDouble("z", z);
				entity.getPersistentData().putDouble("yaw", (entity.getYRot()));
				entity.getPersistentData().putBoolean("GotCordinates", true);
			}
		}
	}
}
