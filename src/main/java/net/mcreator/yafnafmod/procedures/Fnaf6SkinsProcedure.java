package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.LeftyEntity;
import net.mcreator.yafnafmod.entity.LeftyDayEntity;

public class Fnaf6SkinsProcedure {
	public static void execute(Entity entity, double skin, String suffixa) {
		if (entity == null || suffixa == null)
			return;
		String suffix = "";
		suffix = suffixa;
		if (skin == 0) {
			if (entity instanceof LeftyEntity animatable)
				animatable.setTexture(("lefty" + suffix));
			if (entity instanceof LeftyDayEntity animatable)
				animatable.setTexture(("lefty" + suffix));
		} else if (skin == 1) {
			if (entity instanceof LeftyEntity animatable)
				animatable.setTexture(("lefty_alt" + suffix));
			if (entity instanceof LeftyDayEntity animatable)
				animatable.setTexture(("lefty_alt" + suffix));
		}
	}
}
