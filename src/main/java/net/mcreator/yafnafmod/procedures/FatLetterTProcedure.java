package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class FatLetterTProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		LetterSelectProcedure.execute(entity, "t");
	}
}
