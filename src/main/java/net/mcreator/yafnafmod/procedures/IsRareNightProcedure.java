package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.yafnafmod.network.YaFnafmodModVariables;

public class IsRareNightProcedure {
	public static boolean execute(LevelAccessor world) {
		return YaFnafmodModVariables.MapVariables.get(world).rare_night;
	}
}
