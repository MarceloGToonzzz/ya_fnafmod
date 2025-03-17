package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class DeathCoinLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.kill();
	}
}
