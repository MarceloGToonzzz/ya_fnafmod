package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;

public class IsItNighttimeProcedure {
	public static boolean execute(LevelAccessor world) {
		boolean daghagd = false;
		boolean can_laugh = false;
		double end_time = 0;
		double time = 0;
		time = world.dayTime();
		end_time = world.dayTime();
		while (end_time > 24000) {
			end_time = end_time - 24000;
		}
		if ((end_time) > (17999) && (end_time) < (24000)) {
			daghagd = true;
		} else {
			daghagd = false;
		}
		return daghagd;
	}
}
