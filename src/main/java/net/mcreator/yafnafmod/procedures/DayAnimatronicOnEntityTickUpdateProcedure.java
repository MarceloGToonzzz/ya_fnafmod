package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.network.YaFnafmodModVariables;

public class DayAnimatronicOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		SettingSkinProcedure.execute(entity, entity.getPersistentData().getString("skin"), entity.getPersistentData().getString("style"));
		DuckingProcedure.execute(world, x, y, z, entity);
		if (YaFnafmodModVariables.MapVariables.get(world).STRUCTUREBUILD_BUILD == false) {
			SetNbtPositionsProcedure.execute(x, y, z, entity);
		}
		NightActionProcedure.execute(world, x, y, z, entity);
	}
}
