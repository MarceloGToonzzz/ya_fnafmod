package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class MakeGoAwayProcedure {
	public static void execute(Entity entity, double A_x, double A_y, double A_z, double B_x, double B_y, double B_z, double distance) {
		if (entity == null)
			return;
		double result_x = 0;
		double result_y = 0;
		double result_z = 0;
		if (A_x < B_x) {
			result_x = A_x + distance;
		} else if (A_x > B_x) {
			result_x = A_x - distance;
		} else if (A_x == B_x) {
			result_x = B_x;
		}
		if (A_y < B_y) {
			result_y = A_y + distance;
		} else if (A_y > B_y) {
			result_y = A_y - distance;
		} else if (A_y == B_y) {
			result_y = B_y;
		}
		if (A_z < B_z) {
			result_z = A_z + distance;
		} else if (A_z > B_z) {
			result_z = A_z - distance;
		} else if (A_z == B_z) {
			result_z = B_z;
		}
		if (entity instanceof Mob _entity)
			_entity.getNavigation().moveTo(result_x, result_y, result_z, 1);
	}
}
