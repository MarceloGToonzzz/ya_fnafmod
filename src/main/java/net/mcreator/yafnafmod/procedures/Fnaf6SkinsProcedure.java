package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.LeftyEntity;
import net.mcreator.yafnafmod.entity.LeftyDayEntity;

public class Fnaf6SkinsProcedure {
	public static void execute(Entity entiti, double skin, String suffixa) {
		if (entiti == null || suffixa == null)
			return;
		String suffix = "";
		suffix = suffixa;
		if (skin == 0) {
			if (entiti instanceof LeftyEntity animatable)
				animatable.setTexture(("lefty" + suffix));
			if (entiti instanceof LeftyDayEntity animatable)
				animatable.setTexture(("lefty" + suffix));
		} else if (skin == 1) {
			if (entiti instanceof LeftyEntity animatable)
				animatable.setTexture(("lefty_alt" + suffix));
			if (entiti instanceof LeftyDayEntity animatable)
				animatable.setTexture(("lefty_alt" + suffix));
		}
	}
}
