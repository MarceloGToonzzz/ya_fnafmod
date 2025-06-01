package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;

public class CustomPizzeriaSignBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String text1 = "";
		String text2 = "";
		String color = "";
		String command = "";
		double yaw = 0;
		ApplyNewSignTextProcedure.execute(world, x, y, z, "ffffff", "default", "Insert Text 1", "Insert Text 2");
	}
}
