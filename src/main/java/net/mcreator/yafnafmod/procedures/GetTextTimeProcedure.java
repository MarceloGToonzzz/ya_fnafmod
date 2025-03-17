package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;

public class GetTextTimeProcedure {
	public static String execute(LevelAccessor world) {
		String minute_text = "";
		String result = "";
		if (GetTimeProcedure.execute(world, false, false) < 10) {
			minute_text = "0" + ("" + GetTimeProcedure.execute(world, false, false)).replace(".0", "");
		} else {
			minute_text = "" + ("" + GetTimeProcedure.execute(world, false, false)).replace(".0", "");
		}
		if (!((GetWorldTimeProcedure.execute(world)) > (5999) && (GetWorldTimeProcedure.execute(world)) < (17999))) {
			result = ("" + GetTimeProcedure.execute(world, true, false)).replace(".0", "") + ":" + minute_text + " AM";
		} else {
			result = ("" + GetTimeProcedure.execute(world, true, false)).replace(".0", "") + ":" + minute_text + " PM";
		}
		return result;
	}
}
