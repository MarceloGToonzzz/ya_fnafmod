package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.yafnafmod.network.YaFnafmodModVariables;

public class WitheredGoldenFreddyFunctionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double chance = 0;
		if (YaFnafmodModVariables.MapVariables.get(world).rare_night == true) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getPersistentData().getBoolean("hiding_mask") == false) {
				if (entity.getPersistentData().getBoolean("is_head") == false) {
					entity.getPersistentData().putDouble("head_tick", (entity.getPersistentData().getDouble("head_tick") + 1));
					if (entity.getPersistentData().getDouble("head_tick") == 40) {
						chance = Mth.nextInt(RandomSource.create(), 1, 2);
						if (chance == 2) {
							entity.getPersistentData().putBoolean("is_head", true);
						}
						entity.getPersistentData().putDouble("head_tick", 0);
					}
				}
			} else {
				entity.getPersistentData().putDouble("head_tick", 0);
				entity.getPersistentData().putBoolean("is_head", false);
			}
		}
	}
}
