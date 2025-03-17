package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class IsEntityBeingLookedAtProcedure {
	public static boolean execute(LevelAccessor world, Entity entity, Entity player, double height) {
		if (entity == null || player == null)
			return false;
		double dx = 0;
		double dy = 0;
		double dz = 0;
		double nx = 0;
		double ny = 0;
		double nz = 0;
		double length = 0;
		double dotProduct = 0;
		boolean result = false;
		dx = entity.getX() - player.getX();
		dy = (entity.getY() - 1 + height) - (player.getY() - 1 + player.getEyeHeight());
		dz = entity.getZ() - player.getZ();
		length = Math.sqrt(dx * dx + dy * dy + dz * dz);
		nx = dx / length;
		ny = dy / length;
		nz = dz / length;
		dotProduct = nx * player.getLookAngle().x + ny * player.getLookAngle().y + nz * player.getLookAngle().z;
		if (dotProduct > 0.735) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
