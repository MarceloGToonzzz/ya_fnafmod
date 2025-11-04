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
	public static void execute(Entity entity, double skin, String suffixa) {
		if (entity == null || suffixa == null)
			return;
		String suffix = "";
		suffix = suffixa;
		if (skin == 0) {
			if (entity instanceof FreddyFazbearEntity animatable)
				animatable.setTexture(("freddyfazbear" + suffix));
			if (entity instanceof FreddyFazbearDayEntity animatable)
				animatable.setTexture(("freddyfazbear" + suffix));
			if (entity instanceof BonnieBunnyEntity animatable)
				animatable.setTexture(("bonniebunny" + suffix));
			if (entity instanceof BonnieBunnyDayEntity animatable)
				animatable.setTexture(("bonniebunny" + suffix));
			if (entity instanceof ChicaChickenEntity animatable)
				animatable.setTexture(("chicachicken" + suffix));
			if (entity instanceof ChicaChickenDayEntity animatable)
				animatable.setTexture(("chicachicken" + suffix));
			if (entity instanceof CupcakeEntityEntity animatable)
				animatable.setTexture(("cupcake" + suffix));
			if (entity instanceof FoxyPirateEntity animatable)
				animatable.setTexture(("foxy_pirate" + suffix));
			if (entity instanceof FoxyPirateDayEntity animatable)
				animatable.setTexture(("foxy_pirate" + suffix));
			if (entity instanceof GoldenFreddyEntity animatable)
				animatable.setTexture(("gfreddy" + suffix));
			if (entity instanceof SparkyDogEntity animatable)
				animatable.setTexture(("sparky" + suffix));
			if (entity instanceof SparkyDogDayEntity animatable)
				animatable.setTexture(("sparky" + suffix));
			if (entity instanceof Endo01Entity animatable)
				animatable.setTexture(("endo1" + suffix));
			if (entity instanceof Endo01DayEntity animatable)
				animatable.setTexture(("endo1" + suffix));
		} else if (skin == 1) {
			if (entity instanceof FreddyFazbearEntity animatable)
				animatable.setTexture(("freddyfazbear_movie" + suffix));
			if (entity instanceof FreddyFazbearDayEntity animatable)
				animatable.setTexture(("freddyfazbear_movie" + suffix));
			if (entity instanceof BonnieBunnyEntity animatable)
				animatable.setTexture(("bonniebunny_movie" + suffix));
			if (entity instanceof BonnieBunnyDayEntity animatable)
				animatable.setTexture(("bonniebunny_movie" + suffix));
			if (entity instanceof ChicaChickenEntity animatable)
				animatable.setTexture(("chicachicken_movie" + suffix));
			if (entity instanceof ChicaChickenDayEntity animatable)
				animatable.setTexture(("chicachicken_movie" + suffix));
			if (entity instanceof CupcakeEntityEntity animatable)
				animatable.setTexture(("cupcake_movie" + suffix));
			if (entity instanceof FoxyPirateEntity animatable)
				animatable.setTexture(("foxy_pirate_movie" + suffix));
			if (entity instanceof FoxyPirateDayEntity animatable)
				animatable.setTexture(("foxy_pirate_movie" + suffix));
			if (entity instanceof GoldenFreddyEntity animatable)
				animatable.setTexture(("gfreddy_movie" + suffix));
			if (entity instanceof SparkyDogEntity animatable)
				animatable.setTexture(("sparky_movie" + suffix));
			if (entity instanceof SparkyDogDayEntity animatable)
				animatable.setTexture(("sparky_movie" + suffix));
		} else if (skin == 2) {
			if (entity instanceof FreddyFazbearEntity animatable)
				animatable.setTexture(("freddyfazbear_sign" + suffix));
			if (entity instanceof FreddyFazbearDayEntity animatable)
				animatable.setTexture(("freddyfazbear_sign" + suffix));
			if (entity instanceof FoxyPirateEntity animatable)
				animatable.setTexture(("foxy_pirate_fixed" + suffix));
			if (entity instanceof FoxyPirateDayEntity animatable)
				animatable.setTexture(("foxy_pirate_fixed" + suffix));
			if (entity instanceof SparkyDogEntity animatable)
				animatable.setTexture(("sparky_hoax" + suffix));
			if (entity instanceof SparkyDogDayEntity animatable)
				animatable.setTexture(("sparky_hoax" + suffix));
		}
	}
}
