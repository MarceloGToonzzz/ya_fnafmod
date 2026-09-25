package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.PlushtrapEntity;
import net.mcreator.yafnafmod.entity.PlushtrapDayEntity;
import net.mcreator.yafnafmod.entity.NightmarionneEntity;
import net.mcreator.yafnafmod.entity.NightmareMangleEntity;
import net.mcreator.yafnafmod.entity.NightmareFreddyEntity;
import net.mcreator.yafnafmod.entity.NightmareFredbearEntity;
import net.mcreator.yafnafmod.entity.NightmareFoxyEntity;
import net.mcreator.yafnafmod.entity.NightmareEntity;
import net.mcreator.yafnafmod.entity.NightmareCupcakeEntityEntity;
import net.mcreator.yafnafmod.entity.NightmareChicaEntity;
import net.mcreator.yafnafmod.entity.NightmareBonnieEntity;
import net.mcreator.yafnafmod.entity.NightmareBbEntity;
import net.mcreator.yafnafmod.entity.NightmareBbDayEntity;
import net.mcreator.yafnafmod.entity.JackOChicaEntity;
import net.mcreator.yafnafmod.entity.JackOBonnieEntity;

public class Fnaf4SkinsProcedure {
	public static void execute(Entity entiti, double skin, String suffixa) {
		if (entiti == null || suffixa == null)
			return;
		String suffix = "";
		suffix = suffixa;
		if (skin == 0) {
			if (entiti instanceof NightmareFreddyEntity animatable)
				animatable.setTexture(("nightmare_freddy" + suffix));
			if (entiti instanceof NightmareBonnieEntity animatable)
				animatable.setTexture(("nightmare_bonnie" + suffix));
			if (entiti instanceof NightmareChicaEntity animatable)
				animatable.setTexture(("nightmare_chica" + suffix));
			if (entiti instanceof NightmareCupcakeEntityEntity animatable)
				animatable.setTexture(("nightmare_cupcake" + suffix));
			if (entiti instanceof NightmareFoxyEntity animatable)
				animatable.setTexture(("nightmare_foxy" + suffix));
			if (entiti instanceof JackOBonnieEntity animatable)
				animatable.setTexture(("nightmare_bonnie_jacko" + suffix));
			if (entiti instanceof JackOChicaEntity animatable)
				animatable.setTexture(("nightmare_chica_jacko" + suffix));
			if (entiti instanceof NightmareMangleEntity animatable)
				animatable.setTexture(("nightmare_fredbear" + suffix));
			if (entiti instanceof NightmarionneEntity animatable)
				animatable.setTexture(("nightmarionne" + suffix));
			if (entiti instanceof NightmareFredbearEntity animatable)
				animatable.setTexture(("nightmare_fredbear" + suffix));
			if (entiti instanceof NightmareEntity animatable)
				animatable.setTexture(("nightmare" + suffix));
			if (entiti instanceof NightmareBbEntity animatable)
				animatable.setTexture(("nightmare_bb" + suffix));
			if (entiti instanceof NightmareBbDayEntity animatable)
				animatable.setTexture(("nightmare_bb" + suffix));
			if (entiti instanceof PlushtrapEntity animatable)
				animatable.setTexture(("plushtrap" + suffix));
			if (entiti instanceof PlushtrapDayEntity animatable)
				animatable.setTexture(("plushtrap" + suffix));
		} else if (skin == 1) {
			if (entiti instanceof NightmareFredbearEntity animatable)
				animatable.setTexture(("nightmare_fredbear_teaser" + suffix));
			if (entiti instanceof NightmareEntity animatable)
				animatable.setTexture(("nightmare_solid" + suffix));
			if (entiti instanceof NightmareBbEntity animatable)
				animatable.setTexture(("nightmare_bb_jjskin" + suffix));
			if (entiti instanceof NightmareBbDayEntity animatable)
				animatable.setTexture(("nightmare_bb_jjskin" + suffix));
			if (entiti instanceof PlushtrapEntity animatable)
				animatable.setTexture(("plushtrap_fingertrap" + suffix));
			if (entiti instanceof PlushtrapDayEntity animatable)
				animatable.setTexture(("plushtrap_fingertrap" + suffix));
		} else if (skin == 2) {
			if (entiti instanceof NightmareFredbearEntity animatable)
				animatable.setTexture(("nightmare_fredbear_vrtrailer" + suffix));
		}
	}
}
