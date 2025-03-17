package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;

public class IsItNighttimeSimpleProcedure {
	public static boolean execute(LevelAccessor world) {
		boolean daghagd = false;
		boolean can_laugh = false;
		double end_time = 0;
		double time = 0;
		if ((GetWorldTimeProcedure.execute(world)) > (17999) && (GetWorldTimeProcedure.execute(world)) < (24000)) {
			daghagd = true;
		} else {
			daghagd = false;
		}
		return daghagd;
	}
}
