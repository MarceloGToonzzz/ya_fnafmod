package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.yafnafmod.network.YaFnafmodModVariables;
import net.mcreator.yafnafmod.entity.PlushbabyMobEntity;
import net.mcreator.yafnafmod.entity.PlushbabyMobDayEntity;

public class PlushbabyVariantsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double a = 0;
		String wah = "";
		if (entity instanceof PlushbabyMobDayEntity || entity instanceof PlushbabyMobEntity) {
			if (entity.getPersistentData().getBoolean("plushbabySetVariant") == false) {
				entity.getPersistentData().putDouble("plushbabyVariant", (Mth.nextInt(RandomSource.create(), 1, 6)));
				entity.getPersistentData().putBoolean("plushbabySetVariant", true);
			}
			wah = "plushbaby" + ("" + entity.getPersistentData().getDouble("plushbabyVariant")).replace(".0", "");
			if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == true) {
				wah = wah + "_plushkin";
			}
			if (entity instanceof PlushbabyMobDayEntity animatable)
				animatable.setTexture(wah);
			if (entity instanceof PlushbabyMobEntity animatable)
				animatable.setTexture(wah);
		}
	}
}
