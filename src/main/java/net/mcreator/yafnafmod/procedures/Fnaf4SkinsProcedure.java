package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.PlushtrapEntity;
import net.mcreator.yafnafmod.entity.PlushtrapDayEntity;
import net.mcreator.yafnafmod.entity.NightmareFredbearEntity;
import net.mcreator.yafnafmod.entity.NightmareEntity;
import net.mcreator.yafnafmod.entity.NightmareBbEntity;
import net.mcreator.yafnafmod.entity.NightmareBbDayEntity;

public class Fnaf4SkinsProcedure {
	public static void execute(Entity entity, double skin, double style, String suffixa) {
		if (entity == null || suffixa == null)
			return;
		String suffix = "";
		suffix = suffixa;
		if (style == 0) {
			suffix = "";
		} else if (style == 1) {
			suffix = "-skin";
		}
		if (skin == 0) {
			if (entity instanceof NightmareFredbearEntity animatable)
				animatable.setTexture(("nightmare_fredbear" + suffix));
			if (entity instanceof NightmareEntity animatable)
				animatable.setTexture(("nightmare" + suffix));
			if (entity instanceof NightmareBbEntity animatable)
				animatable.setTexture(("nightmare_bb" + suffix));
			if (entity instanceof NightmareBbDayEntity animatable)
				animatable.setTexture(("nightmare_bb" + suffix));
			if (entity instanceof PlushtrapEntity animatable)
				animatable.setTexture(("plushtrap" + suffix));
			if (entity instanceof PlushtrapDayEntity animatable)
				animatable.setTexture(("plushtrap" + suffix));
		} else if (skin == 1) {
			if (entity instanceof NightmareFredbearEntity animatable)
				animatable.setTexture(("nightmare_fredbear_teaser" + suffix));
			if (entity instanceof NightmareEntity animatable)
				animatable.setTexture(("nightmare_solid" + suffix));
			if (entity instanceof NightmareBbEntity animatable)
				animatable.setTexture(("nightmare_bb_jjskin" + suffix));
			if (entity instanceof NightmareBbDayEntity animatable)
				animatable.setTexture(("nightmare_bb_jjskin" + suffix));
			if (entity instanceof PlushtrapEntity animatable)
				animatable.setTexture(("plushtrap_fingertrap" + suffix));
			if (entity instanceof PlushtrapDayEntity animatable)
				animatable.setTexture(("plushtrap_fingertrap" + suffix));
		} else if (skin == 2) {
			if (entity instanceof NightmareFredbearEntity animatable)
				animatable.setTexture(("nightmare_fredbear_vrtrailer" + suffix));
		}
	}
}
