package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.network.YaFnafmodModVariables;

public class DayAnimatronicOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		SettingSkinProcedure.execute(entity, entity.getPersistentData().getString("skin"));
		DuckingProcedure.execute(world, x, y, z, entity);
		if (YaFnafmodModVariables.MapVariables.get(world).STRUCTUREBUILD_BUILD == false) {
			SetNbtPositionsProcedure.execute(world, x, y, z, entity);
		} else {
			entity.setDeltaMovement(new Vec3(0, 0, 0));
			if (entity instanceof Mob _entity)
				_entity.getNavigation().stop();
		}
		NightActionProcedure.execute(world, x, y, z, entity);
	}
}
