package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.SparkyDogEntity;
import net.mcreator.yafnafmod.entity.SparkyDogDayEntity;
import net.mcreator.yafnafmod.entity.GoldenFreddyEntity;
import net.mcreator.yafnafmod.entity.FreddyFazbearEntity;
import net.mcreator.yafnafmod.entity.FreddyFazbearDayEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateDayEntity;
import net.mcreator.yafnafmod.entity.Endo01Entity;
import net.mcreator.yafnafmod.entity.Endo01DayEntity;
import net.mcreator.yafnafmod.entity.CupcakeEntityEntity;
import net.mcreator.yafnafmod.entity.ChicaChickenEntity;
import net.mcreator.yafnafmod.entity.ChicaChickenDayEntity;
import net.mcreator.yafnafmod.entity.BonnieBunnyEntity;
import net.mcreator.yafnafmod.entity.BonnieBunnyDayEntity;

public class Fnaf1SkinsProcedure {
	public static void execute(Entity entiti, double skin, String suffixa) {
		if (entiti == null || suffixa == null)
			return;
		String suffix = "";
		suffix = suffixa;
		if (skin == 0) {
			if (entiti instanceof FreddyFazbearEntity animatable)
				animatable.setTexture(("freddyfazbear" + suffix));
			if (entiti instanceof FreddyFazbearDayEntity animatable)
				animatable.setTexture(("freddyfazbear" + suffix));
			if (entiti instanceof BonnieBunnyEntity animatable)
				animatable.setTexture(("bonniebunny" + suffix));
			if (entiti instanceof BonnieBunnyDayEntity animatable)
				animatable.setTexture(("bonniebunny" + suffix));
			if (entiti instanceof ChicaChickenEntity animatable)
				animatable.setTexture(("chicachicken" + suffix));
			if (entiti instanceof ChicaChickenDayEntity animatable)
				animatable.setTexture(("chicachicken" + suffix));
			if (entiti instanceof CupcakeEntityEntity animatable)
				animatable.setTexture(("cupcake" + suffix));
			if (entiti instanceof FoxyPirateEntity animatable)
				animatable.setTexture(("foxy_pirate" + suffix));
			if (entiti instanceof FoxyPirateDayEntity animatable)
				animatable.setTexture(("foxy_pirate" + suffix));
			if (entiti instanceof GoldenFreddyEntity animatable)
				animatable.setTexture(("gfreddy" + suffix));
			if (entiti instanceof SparkyDogEntity animatable)
				animatable.setTexture(("sparky" + suffix));
			if (entiti instanceof SparkyDogDayEntity animatable)
				animatable.setTexture(("sparky" + suffix));
			if (entiti instanceof Endo01Entity animatable)
				animatable.setTexture(("endo1" + suffix));
			if (entiti instanceof Endo01DayEntity animatable)
				animatable.setTexture(("endo1" + suffix));
		} else if (skin == 1) {
			if (entiti instanceof FreddyFazbearEntity animatable)
				animatable.setTexture(("freddyfazbear_movie" + suffix));
			if (entiti instanceof FreddyFazbearDayEntity animatable)
				animatable.setTexture(("freddyfazbear_movie" + suffix));
			if (entiti instanceof BonnieBunnyEntity animatable)
				animatable.setTexture(("bonniebunny_movie" + suffix));
			if (entiti instanceof BonnieBunnyDayEntity animatable)
				animatable.setTexture(("bonniebunny_movie" + suffix));
			if (entiti instanceof ChicaChickenEntity animatable)
				animatable.setTexture(("chicachicken_movie" + suffix));
			if (entiti instanceof ChicaChickenDayEntity animatable)
				animatable.setTexture(("chicachicken_movie" + suffix));
			if (entiti instanceof CupcakeEntityEntity animatable)
				animatable.setTexture(("cupcake_movie" + suffix));
			if (entiti instanceof FoxyPirateEntity animatable)
				animatable.setTexture(("foxy_pirate_movie" + suffix));
			if (entiti instanceof FoxyPirateDayEntity animatable)
				animatable.setTexture(("foxy_pirate_movie" + suffix));
			if (entiti instanceof GoldenFreddyEntity animatable)
				animatable.setTexture(("gfreddy_movie" + suffix));
			if (entiti instanceof SparkyDogEntity animatable)
				animatable.setTexture(("sparky_movie" + suffix));
			if (entiti instanceof SparkyDogDayEntity animatable)
				animatable.setTexture(("sparky_movie" + suffix));
		} else if (skin == 2) {
			if (entiti instanceof FreddyFazbearEntity animatable)
				animatable.setTexture(("freddyfazbear_blacklight" + suffix));
			if (entiti instanceof FreddyFazbearDayEntity animatable)
				animatable.setTexture(("freddyfazbear_blacklight" + suffix));
			if (entiti instanceof BonnieBunnyEntity animatable)
				animatable.setTexture(("bonniebunny_blacklight" + suffix));
			if (entiti instanceof BonnieBunnyDayEntity animatable)
				animatable.setTexture(("bonniebunny_blacklight" + suffix));
			if (entiti instanceof ChicaChickenEntity animatable)
				animatable.setTexture(("chicachicken_blacklight" + suffix));
			if (entiti instanceof ChicaChickenDayEntity animatable)
				animatable.setTexture(("chicachicken_blacklight" + suffix));
			if (entiti instanceof CupcakeEntityEntity animatable)
				animatable.setTexture(("cupcake_blacklight" + suffix));
			if (entiti instanceof FoxyPirateEntity animatable)
				animatable.setTexture(("foxy_pirate_blacklight" + suffix));
			if (entiti instanceof FoxyPirateDayEntity animatable)
				animatable.setTexture(("foxy_pirate_blacklight" + suffix));
			if (entiti instanceof SparkyDogEntity animatable)
				animatable.setTexture(("sparky_hoax" + suffix));
			if (entiti instanceof SparkyDogDayEntity animatable)
				animatable.setTexture(("sparky_hoax" + suffix));
		} else if (skin == 3) {
			if (entiti instanceof FreddyFazbearEntity animatable)
				animatable.setTexture(("freddyfazbear_hw" + suffix));
			if (entiti instanceof FreddyFazbearDayEntity animatable)
				animatable.setTexture(("freddyfazbear_hw" + suffix));
			if (entiti instanceof BonnieBunnyEntity animatable)
				animatable.setTexture(("bonniebunny_hw" + suffix));
			if (entiti instanceof BonnieBunnyDayEntity animatable)
				animatable.setTexture(("bonniebunny_hw" + suffix));
			if (entiti instanceof ChicaChickenEntity animatable)
				animatable.setTexture(("chicachicken_hw" + suffix));
			if (entiti instanceof ChicaChickenDayEntity animatable)
				animatable.setTexture(("chicachicken_hw" + suffix));
			if (entiti instanceof CupcakeEntityEntity animatable)
				animatable.setTexture(("cupcake_hw" + suffix));
			if (entiti instanceof FoxyPirateEntity animatable)
				animatable.setTexture(("foxy_pirate_hw" + suffix));
			if (entiti instanceof FoxyPirateDayEntity animatable)
				animatable.setTexture(("foxy_pirate_hw" + suffix));
		} else if (skin == 4) {
			if (entiti instanceof FreddyFazbearEntity animatable)
				animatable.setTexture(("freddyfazbear_novel" + suffix));
			if (entiti instanceof FreddyFazbearDayEntity animatable)
				animatable.setTexture(("freddyfazbear_novel" + suffix));
			if (entiti instanceof BonnieBunnyEntity animatable)
				animatable.setTexture(("bonniebunny_novel" + suffix));
			if (entiti instanceof BonnieBunnyDayEntity animatable)
				animatable.setTexture(("bonniebunny_novel" + suffix));
			if (entiti instanceof ChicaChickenEntity animatable)
				animatable.setTexture(("chicachicken_novel" + suffix));
			if (entiti instanceof ChicaChickenDayEntity animatable)
				animatable.setTexture(("chicachicken_novel" + suffix));
			if (entiti instanceof CupcakeEntityEntity animatable)
				animatable.setTexture(("cupcake_novel" + suffix));
			if (entiti instanceof FoxyPirateEntity animatable)
				animatable.setTexture(("foxy_pirate_novel" + suffix));
			if (entiti instanceof FoxyPirateDayEntity animatable)
				animatable.setTexture(("foxy_pirate_novel" + suffix));
		} else if (skin == 5) {
			if (entiti instanceof FreddyFazbearEntity animatable)
				animatable.setTexture(("freddyfazbear_vrhard" + suffix));
			if (entiti instanceof FreddyFazbearDayEntity animatable)
				animatable.setTexture(("freddyfazbear_vrhard" + suffix));
			if (entiti instanceof BonnieBunnyEntity animatable)
				animatable.setTexture(("bonniebunny_vrhard" + suffix));
			if (entiti instanceof BonnieBunnyDayEntity animatable)
				animatable.setTexture(("bonniebunny_vrhard" + suffix));
			if (entiti instanceof ChicaChickenEntity animatable)
				animatable.setTexture(("chicachicken_vrhard" + suffix));
			if (entiti instanceof ChicaChickenDayEntity animatable)
				animatable.setTexture(("chicachicken_vrhard" + suffix));
			if (entiti instanceof CupcakeEntityEntity animatable)
				animatable.setTexture(("cupcake_vrhard" + suffix));
			if (entiti instanceof FoxyPirateEntity animatable)
				animatable.setTexture(("foxy_pirate_vrhard" + suffix));
			if (entiti instanceof FoxyPirateDayEntity animatable)
				animatable.setTexture(("foxy_pirate_vrhard" + suffix));
		} else if (skin == 6) {
			if (entiti instanceof FreddyFazbearEntity animatable)
				animatable.setTexture(("freddyfazbear_sign" + suffix));
			if (entiti instanceof FreddyFazbearDayEntity animatable)
				animatable.setTexture(("freddyfazbear_sign" + suffix));
			if (entiti instanceof FoxyPirateEntity animatable)
				animatable.setTexture(("foxy_pirate_fixed" + suffix));
			if (entiti instanceof FoxyPirateDayEntity animatable)
				animatable.setTexture(("foxy_pirate_fixed" + suffix));
		}
	}
}
