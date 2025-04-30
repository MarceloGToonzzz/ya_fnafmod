package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

public class ChildOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("aistate", 1);
		if ((entity.getPersistentData().getString("parent1")).isEmpty() && (entity.getPersistentData().getString("parent2")).isEmpty()) {
			entity.getPersistentData().putDouble("gender", (Mth.nextInt(RandomSource.create(), 0, 3)));
			entity.getPersistentData().putDouble("nameorigin", (Mth.nextInt(RandomSource.create(), 0, 3)));
			entity.getPersistentData().putDouble("namelastorigin", (entity.getPersistentData().getDouble("nameorigin")));
			entity.setCustomName(Component.literal(ChooseNamesProcedure.execute(entity)));
		}
	}
}
