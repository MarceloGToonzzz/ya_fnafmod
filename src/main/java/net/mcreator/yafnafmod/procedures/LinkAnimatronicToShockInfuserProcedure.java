package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class LinkAnimatronicToShockInfuserProcedure {
	public static void execute(Entity entity, double shock_x, double shock_y, double shock_z) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("controlshock_x", shock_x);
		entity.getPersistentData().putDouble("controlshock_y", shock_y);
		entity.getPersistentData().putDouble("controlshock_z", shock_z);
		entity.getPersistentData().putBoolean("controlshock_linked", true);
	}
}
