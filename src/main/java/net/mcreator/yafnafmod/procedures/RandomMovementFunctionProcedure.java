package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.Difficulty;

public class RandomMovementFunctionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean move_fail = false;
		double ai = 0;
		double time = 0;
		double des_x = 0;
		double des_z = 0;
		double movechance1 = 0;
		double des_x2 = 0;
		double des_z2 = 0;
		double range = 0;
		time = 6;
		if (world.getDifficulty() == Difficulty.EASY) {
			ai = 5;
		} else if (world.getDifficulty() == Difficulty.NORMAL) {
			ai = 10;
		} else if (world.getDifficulty() == Difficulty.HARD) {
			ai = 15;
		}
		entity.getPersistentData().putDouble("aimove_tick", (entity.getPersistentData().getDouble("aimove_tick") + 1));
		if (entity.getPersistentData().getDouble("aimove_tick") == time * 20) {
			if (Math.random() < (ai) / ((float) 20)) {
			}
			entity.getPersistentData().putDouble("aimove_tick", 0);
		}
	}
}
