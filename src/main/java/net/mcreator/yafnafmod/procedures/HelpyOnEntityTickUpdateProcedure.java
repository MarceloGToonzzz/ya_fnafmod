package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.yafnafmod.entity.HelpyEntity;

public class HelpyOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String number = "";
		if (world.getServer() != null) {
			LevelAccessor _origWorld = world;
			for (ServerLevel worlditerator : world.getServer().getAllLevels()) {
				world = worlditerator;
				if (!(entity.getPersistentData().getString("style")).equals("fms")) {
					if (entity instanceof HelpyEntity animatable)
						animatable.setTexture(("helpy" + entity.getPersistentData().getString("outfit")));
				} else {
					if (entity instanceof HelpyEntity animatable)
						animatable.setTexture(("helpy" + entity.getPersistentData().getString("outfit") + "_fms"));
				}
			}
			world = _origWorld;
		}
	}
}
