package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;

public class IsItDaytimeProcedure {
	public static boolean execute(LevelAccessor world) {
		boolean daghagd = false;
		if (IsItNighttimeProcedure.execute(world) == false) {
			daghagd = false;
		} else {
			daghagd = true;
		}
		return daghagd;
	}
}
