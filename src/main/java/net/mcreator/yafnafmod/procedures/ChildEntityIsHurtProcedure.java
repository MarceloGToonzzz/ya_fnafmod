package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.yafnafmod.entity.ChildEntity;

public class ChildEntityIsHurtProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity) {
			if (!(Mth.nextInt(RandomSource.create(), 1, 3) == 2)) {
				if (entity instanceof ChildEntity _datEntSetS)
					_datEntSetS.getEntityData().set(ChildEntity.DATA_emotion, "sad");
			} else {
				if (entity instanceof ChildEntity _datEntSetS)
					_datEntSetS.getEntityData().set(ChildEntity.DATA_emotion, "angry");
			}
		}
	}
}
