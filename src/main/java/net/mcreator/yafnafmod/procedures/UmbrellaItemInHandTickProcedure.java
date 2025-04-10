package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class UmbrellaItemInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (0 > entity.getDeltaMovement().y()) {
			entity.fallDistance = 0;
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() / 3), (entity.getDeltaMovement().z())));
		}
	}
}
