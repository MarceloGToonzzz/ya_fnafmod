package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class SetBabyScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double scale = 0;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.isBaby())) {
			scale = 1;
		} else {
			scale = 0.625;
		}
		return scale;
	}
}
