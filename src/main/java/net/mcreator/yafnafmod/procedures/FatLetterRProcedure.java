package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class FatLetterRProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		LetterSelectProcedure.execute(world, entity, "r");
	}
}
