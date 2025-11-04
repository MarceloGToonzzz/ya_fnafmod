package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.SpringtrapEntity;
import net.mcreator.yafnafmod.entity.SpringtrapDayEntity;
import net.mcreator.yafnafmod.entity.SpringbonnieEntity;
import net.mcreator.yafnafmod.entity.SpringbonnieDayEntity;
import net.mcreator.yafnafmod.entity.FredbearEntity;
import net.mcreator.yafnafmod.entity.FredbearDayEntity;

public class Fnaf3SkinsProcedure {
	public static void execute(Entity entity, double skin, String suffixa) {
		if (entity == null || suffixa == null)
			return;
		String suffix = "";
		suffix = suffixa;
		if (skin == 0) {
			if (entity instanceof SpringtrapEntity animatable)
				animatable.setTexture(("springtrap" + suffix));
			if (entity instanceof SpringtrapDayEntity animatable)
				animatable.setTexture(("springtrap" + suffix));
			if (entity instanceof FredbearEntity animatable)
				animatable.setTexture(("fredbear" + suffix));
			if (entity instanceof FredbearDayEntity animatable)
				animatable.setTexture(("fredbear" + suffix));
			if (entity instanceof SpringbonnieEntity animatable)
				animatable.setTexture(("springbonnie" + suffix));
			if (entity instanceof SpringbonnieDayEntity animatable)
				animatable.setTexture(("springbonnie" + suffix));
		} else if (skin == 1) {
			if (entity instanceof SpringtrapEntity animatable)
				animatable.setTexture(("springtrap_dark" + suffix));
			if (entity instanceof SpringtrapDayEntity animatable)
				animatable.setTexture(("springtrap_dark" + suffix));
			if (entity instanceof FredbearEntity animatable)
				animatable.setTexture(("fredbear_stage01" + suffix));
			if (entity instanceof FredbearDayEntity animatable)
				animatable.setTexture(("fredbear_stage01" + suffix));
			if (entity instanceof SpringbonnieEntity animatable)
				animatable.setTexture(("springbonnie_stage01" + suffix));
			if (entity instanceof SpringbonnieDayEntity animatable)
				animatable.setTexture(("springbonnie_stage01" + suffix));
		} else if (skin == 2) {
			if (entity instanceof SpringtrapEntity animatable)
				animatable.setTexture(("springtrap_dbd" + suffix));
			if (entity instanceof SpringtrapDayEntity animatable)
				animatable.setTexture(("springtrap_dbd" + suffix));
			if (entity instanceof FredbearEntity animatable)
				animatable.setTexture(("fredbear_poster" + suffix));
			if (entity instanceof FredbearDayEntity animatable)
				animatable.setTexture(("fredbear_poster" + suffix));
			if (entity instanceof SpringbonnieEntity animatable)
				animatable.setTexture(("springbonnie_poster" + suffix));
			if (entity instanceof SpringbonnieDayEntity animatable)
				animatable.setTexture(("springbonnie_poster" + suffix));
		} else if (skin == 3) {
			if (entity instanceof SpringbonnieEntity animatable)
				animatable.setTexture(("springbonnie_fnaf4" + suffix));
			if (entity instanceof SpringbonnieDayEntity animatable)
				animatable.setTexture(("springbonnie_fnaf4" + suffix));
		}
	}
}
