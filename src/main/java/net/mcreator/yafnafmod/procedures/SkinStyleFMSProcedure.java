package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.WitheredJollyRatEntity;
import net.mcreator.yafnafmod.entity.WitheredJollyRatDayEntity;
import net.mcreator.yafnafmod.entity.WitheredGoldenFreddyEntity;
import net.mcreator.yafnafmod.entity.WitheredFreddyEntity;
import net.mcreator.yafnafmod.entity.WitheredFreddyDayEntity;
import net.mcreator.yafnafmod.entity.WitheredFoxyEntity;
import net.mcreator.yafnafmod.entity.WitheredFoxyDayEntity;
import net.mcreator.yafnafmod.entity.WitheredDougDogEntity;
import net.mcreator.yafnafmod.entity.WitheredDougDogDayEntity;
import net.mcreator.yafnafmod.entity.WitheredChicaEntity;
import net.mcreator.yafnafmod.entity.WitheredChicaDayEntity;
import net.mcreator.yafnafmod.entity.WitheredBonnieEntity;
import net.mcreator.yafnafmod.entity.WitheredBonnieDayEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyStillDayEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyDayEntity;
import net.mcreator.yafnafmod.entity.ToyFoxyStillDayEntity;
import net.mcreator.yafnafmod.entity.ToyFoxyEntity;
import net.mcreator.yafnafmod.entity.ToyFoxyDayEntity;
import net.mcreator.yafnafmod.entity.ToyChicaStillDayEntity;
import net.mcreator.yafnafmod.entity.ToyChicaEntity;
import net.mcreator.yafnafmod.entity.ToyChicaDayEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieStillDayEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieDayEntity;
import net.mcreator.yafnafmod.entity.SpringbonnieEntity;
import net.mcreator.yafnafmod.entity.SpringbonnieDayEntity;
import net.mcreator.yafnafmod.entity.SparkyDogEntity;
import net.mcreator.yafnafmod.entity.SparkyDogDayEntity;
import net.mcreator.yafnafmod.entity.ShadowBonnieEntity;
import net.mcreator.yafnafmod.entity.RustyEntity;
import net.mcreator.yafnafmod.entity.RustyDayEntity;
import net.mcreator.yafnafmod.entity.RickyRatEntity;
import net.mcreator.yafnafmod.entity.RickyRatDayEntity;
import net.mcreator.yafnafmod.entity.RetroFreddyEntity;
import net.mcreator.yafnafmod.entity.RetroFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RetroFoxyEntity;
import net.mcreator.yafnafmod.entity.RetroFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RetroChicaEntity;
import net.mcreator.yafnafmod.entity.RetroChicaDayEntity;
import net.mcreator.yafnafmod.entity.RetroBonnieEntity;
import net.mcreator.yafnafmod.entity.RetroBonnieDayEntity;
import net.mcreator.yafnafmod.entity.PuppetEntity;
import net.mcreator.yafnafmod.entity.PuppetDayEntity;
import net.mcreator.yafnafmod.entity.PopgoesWeaselEntity;
import net.mcreator.yafnafmod.entity.PopgoesWeaselDayEntity;
import net.mcreator.yafnafmod.entity.PitbonnieEntity;
import net.mcreator.yafnafmod.entity.PitbonnieDayEntity;
import net.mcreator.yafnafmod.entity.PigpatchEntity;
import net.mcreator.yafnafmod.entity.PigpatchDayEntity;
import net.mcreator.yafnafmod.entity.OrvilleElephantEntity;
import net.mcreator.yafnafmod.entity.OrvilleElephantDayEntity;
import net.mcreator.yafnafmod.entity.NeddbearEntity;
import net.mcreator.yafnafmod.entity.NeddBearDayEntity;
import net.mcreator.yafnafmod.entity.MrHippoEntity;
import net.mcreator.yafnafmod.entity.MrHippoDayEntity;
import net.mcreator.yafnafmod.entity.MangleEntity;
import net.mcreator.yafnafmod.entity.MangleDayEntity;
import net.mcreator.yafnafmod.entity.JollyRatEntity;
import net.mcreator.yafnafmod.entity.JollyRatDayEntity;
import net.mcreator.yafnafmod.entity.IgnitedChicaEntity;
import net.mcreator.yafnafmod.entity.IgnitedChicaDayEntity;
import net.mcreator.yafnafmod.entity.HappyFrogEntity;
import net.mcreator.yafnafmod.entity.HappyFrogDayEntity;
import net.mcreator.yafnafmod.entity.GusThePugStillDayEntity;
import net.mcreator.yafnafmod.entity.GusThePugEntity;
import net.mcreator.yafnafmod.entity.GusThePugDayEntity;
import net.mcreator.yafnafmod.entity.GoldenFreddyEntity;
import net.mcreator.yafnafmod.entity.FreddyFazbearEntity;
import net.mcreator.yafnafmod.entity.FreddyFazbearDayEntity;
import net.mcreator.yafnafmod.entity.FredbearEntity;
import net.mcreator.yafnafmod.entity.FredbearDayEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateDayEntity;
import net.mcreator.yafnafmod.entity.Endo02Entity;
import net.mcreator.yafnafmod.entity.Endo02DayEntity;
import net.mcreator.yafnafmod.entity.Endo01Entity;
import net.mcreator.yafnafmod.entity.Endo01DayEntity;
import net.mcreator.yafnafmod.entity.DrTeethEntity;
import net.mcreator.yafnafmod.entity.DrTeethDayEntity;
import net.mcreator.yafnafmod.entity.DougDogEntity;
import net.mcreator.yafnafmod.entity.DougDogDayEntity;
import net.mcreator.yafnafmod.entity.CindyCatEntity;
import net.mcreator.yafnafmod.entity.CindyCatDayEntity;
import net.mcreator.yafnafmod.entity.ChicaChickenEntity;
import net.mcreator.yafnafmod.entity.ChicaChickenDayEntity;
import net.mcreator.yafnafmod.entity.CandyCatEntity;
import net.mcreator.yafnafmod.entity.CandyCatDayEntity;
import net.mcreator.yafnafmod.entity.BonnieBunnyEntity;
import net.mcreator.yafnafmod.entity.BonnieBunnyDayEntity;
import net.mcreator.yafnafmod.entity.BlakeBadgerEntity;
import net.mcreator.yafnafmod.entity.BlakeBadgerDayEntity;
import net.mcreator.yafnafmod.entity.BarryPolarEntity;
import net.mcreator.yafnafmod.entity.BarryPolarDayEntity;

public class SkinStyleFMSProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof FreddyFazbearEntity animatable)
			animatable.setTexture("freddyfazbear_fms");
		if (entity instanceof FreddyFazbearDayEntity animatable)
			animatable.setTexture("freddyfazbear_fms");
		if (entity instanceof BonnieBunnyEntity animatable)
			animatable.setTexture("bonniebunny_fms");
		if (entity instanceof BonnieBunnyDayEntity animatable)
			animatable.setTexture("bonniebunny_fms");
		if (entity instanceof ChicaChickenEntity animatable)
			animatable.setTexture("chicachicken_fms");
		if (entity instanceof ChicaChickenDayEntity animatable)
			animatable.setTexture("chicachicken_fms");
		if (entity instanceof FoxyPirateEntity animatable)
			animatable.setTexture("foxy_pirate_fms");
		if (entity instanceof FoxyPirateDayEntity animatable)
			animatable.setTexture("foxy_pirate_fms");
		if (entity instanceof GoldenFreddyEntity animatable)
			animatable.setTexture("gfreddy_fms");
		if (entity instanceof Endo01Entity animatable)
			animatable.setTexture("endo1_fms");
		if (entity instanceof Endo01DayEntity animatable)
			animatable.setTexture("endo1_fms");
		if (entity instanceof SparkyDogEntity animatable)
			animatable.setTexture("sparky_fms");
		if (entity instanceof SparkyDogDayEntity animatable)
			animatable.setTexture("sparky_fms");
		if (entity instanceof ToyFreddyEntity animatable)
			animatable.setTexture("tfreddy_night_fms");
		if (entity instanceof ToyFreddyDayEntity animatable)
			animatable.setTexture("tfreddy_day_fms");
		if (entity instanceof ToyFreddyStillDayEntity animatable)
			animatable.setTexture("tfreddy_day_fms");
		if (entity instanceof ToyBonnieEntity animatable)
			animatable.setTexture("tbonnie_fms_night");
		if (entity instanceof ToyBonnieDayEntity animatable)
			animatable.setTexture("tbonnie_fms_day");
		if (entity instanceof ToyBonnieStillDayEntity animatable)
			animatable.setTexture("tbonnie_fms_day");
		if (entity instanceof ToyChicaEntity animatable)
			animatable.setTexture("tchica_night_fms");
		if (entity instanceof ToyChicaDayEntity animatable)
			animatable.setTexture("tchica_day_fms");
		if (entity instanceof ToyChicaStillDayEntity animatable)
			animatable.setTexture("tchica_day_fms");
		if (entity instanceof ToyFoxyEntity animatable)
			animatable.setTexture("tfoxy_night_fms");
		if (entity instanceof ToyFoxyDayEntity animatable)
			animatable.setTexture("tfoxy_day_fms");
		if (entity instanceof ToyFoxyStillDayEntity animatable)
			animatable.setTexture("tfoxy_day_fms");
		if (entity instanceof MangleEntity animatable)
			animatable.setTexture("mangle_fms");
		if (entity instanceof MangleDayEntity animatable)
			animatable.setTexture("mangle_fms");
		if (entity instanceof PuppetEntity animatable)
			animatable.setTexture("puppet_night_fms");
		if (entity instanceof PuppetDayEntity animatable)
			animatable.setTexture("puppet_day_fms");
		if (entity instanceof ShadowBonnieEntity animatable)
			animatable.setTexture("sbonnie_fms");
		if (entity instanceof WitheredFreddyEntity animatable)
			animatable.setTexture("withered_freddy_fms");
		if (entity instanceof WitheredFreddyDayEntity animatable)
			animatable.setTexture("withered_freddy_fms");
		if (entity instanceof WitheredBonnieEntity animatable)
			animatable.setTexture("withered_bonnie_fms");
		if (entity instanceof WitheredBonnieDayEntity animatable)
			animatable.setTexture("withered_bonnie_fms");
		if (entity instanceof WitheredChicaEntity animatable)
			animatable.setTexture("withered_chica_fms");
		if (entity instanceof WitheredChicaDayEntity animatable)
			animatable.setTexture("withered_chica_fms");
		if (entity instanceof WitheredFoxyEntity animatable)
			animatable.setTexture("withered_foxy_fms");
		if (entity instanceof WitheredFoxyDayEntity animatable)
			animatable.setTexture("withered_foxy_fms");
		if (entity instanceof WitheredGoldenFreddyEntity animatable)
			animatable.setTexture("wgfreddy_fms");
		if (entity instanceof RetroFreddyEntity animatable)
			animatable.setTexture("retro_freddy_fms");
		if (entity instanceof RetroFreddyDayEntity animatable)
			animatable.setTexture("retro_freddy_fms");
		if (entity instanceof RetroBonnieEntity animatable)
			animatable.setTexture("retro_bonnie_fms");
		if (entity instanceof RetroBonnieDayEntity animatable)
			animatable.setTexture("retro_bonnie_fms");
		if (entity instanceof RetroChicaEntity animatable)
			animatable.setTexture("retro_chica_fms");
		if (entity instanceof RetroChicaDayEntity animatable)
			animatable.setTexture("retro_chica_fms");
		if (entity instanceof RetroFoxyEntity animatable)
			animatable.setTexture("retro_foxy_fms");
		if (entity instanceof RetroFoxyDayEntity animatable)
			animatable.setTexture("retro_foxy_fms");
		if (entity instanceof Endo02Entity animatable)
			animatable.setTexture("endo2_fms");
		if (entity instanceof Endo02DayEntity animatable)
			animatable.setTexture("endo2_fms");
		if (entity instanceof FredbearEntity animatable)
			animatable.setTexture("fredbear_fms");
		if (entity instanceof FredbearDayEntity animatable)
			animatable.setTexture("fredbear_fms");
		if (entity instanceof SpringbonnieEntity animatable)
			animatable.setTexture("springbonnie_fms");
		if (entity instanceof SpringbonnieDayEntity animatable)
			animatable.setTexture("springbonnie_fms");
		if ((entity.getPersistentData().getString("skin")).equals("stage01")) {
			if (entity instanceof FredbearEntity animatable)
				animatable.setTexture("fredbear_stage01_fms");
			if (entity instanceof FredbearDayEntity animatable)
				animatable.setTexture("fredbear_stage01_fms");
			if (entity instanceof SpringbonnieEntity animatable)
				animatable.setTexture("springbonnie_stage01_fms");
			if (entity instanceof SpringbonnieDayEntity animatable)
				animatable.setTexture("springbonnie_stage01_fms");
		} else if ((entity.getPersistentData().getString("skin")).equals("fixed")) {
			if (entity instanceof FoxyPirateEntity animatable)
				animatable.setTexture("foxy_pirate_fixed_fms");
			if (entity instanceof FoxyPirateDayEntity animatable)
				animatable.setTexture("foxy_pirate_fixed_fms");
		}
		if (entity instanceof HappyFrogEntity animatable)
			animatable.setTexture("happy_frog_fms");
		if (entity instanceof HappyFrogDayEntity animatable)
			animatable.setTexture("happy_frog_fms");
		if (entity instanceof PigpatchEntity animatable)
			animatable.setTexture("pigpatch_fms");
		if (entity instanceof PigpatchDayEntity animatable)
			animatable.setTexture("pigpatch_fms");
		if (entity instanceof MrHippoEntity animatable)
			animatable.setTexture("mr_hippo_fms");
		if (entity instanceof MrHippoDayEntity animatable)
			animatable.setTexture("mr_hippo_fms");
		if (entity instanceof NeddbearEntity animatable)
			animatable.setTexture("neddbear_fms");
		if (entity instanceof NeddBearDayEntity animatable)
			animatable.setTexture("neddbear_fms");
		if (entity instanceof OrvilleElephantEntity animatable)
			animatable.setTexture("orville_elephant_fms");
		if (entity instanceof OrvilleElephantDayEntity animatable)
			animatable.setTexture("orville_elephant_fms");
		if (entity instanceof PitbonnieEntity animatable)
			animatable.setTexture("pitbonnie_fms");
		if (entity instanceof PitbonnieDayEntity animatable)
			animatable.setTexture("pitbonnie_fms");
		if ((entity.getPersistentData().getString("skin")).equals("alt")) {
			if (entity instanceof PitbonnieEntity animatable)
				animatable.setTexture("pitbonnie_novel_fms");
			if (entity instanceof PitbonnieDayEntity animatable)
				animatable.setTexture("pitbonnie_novel_fms");
		}
		if (entity instanceof CandyCatEntity animatable)
			animatable.setTexture("candythecat_fms");
		if (entity instanceof CandyCatDayEntity animatable)
			animatable.setTexture("candythecat_fms");
		if (entity instanceof CindyCatEntity animatable)
			animatable.setTexture("cindythecat_fms");
		if (entity instanceof CindyCatDayEntity animatable)
			animatable.setTexture("cindythecat_fms");
		if (entity instanceof PopgoesWeaselEntity animatable)
			animatable.setTexture("popgoes_fms");
		if (entity instanceof PopgoesWeaselDayEntity animatable)
			animatable.setTexture("popgoes_fms");
		if (entity instanceof BlakeBadgerEntity animatable)
			animatable.setTexture("blakebadger_fms");
		if (entity instanceof BlakeBadgerDayEntity animatable)
			animatable.setTexture("blakebadger_fms");
		if (entity instanceof IgnitedChicaEntity animatable)
			animatable.setTexture("ignited_chica_fms");
		if (entity instanceof IgnitedChicaDayEntity animatable)
			animatable.setTexture("ignited_chica_fms");
		if (entity instanceof DougDogEntity animatable)
			animatable.setTexture("doug_fms");
		if (entity instanceof DougDogDayEntity animatable)
			animatable.setTexture("doug_fms");
		if (entity instanceof WitheredDougDogEntity animatable)
			animatable.setTexture("withered_doug_fms");
		if (entity instanceof WitheredDougDogDayEntity animatable)
			animatable.setTexture("withered_doug_fms");
		if (entity instanceof JollyRatEntity animatable)
			animatable.setTexture("jollyrat_fms");
		if (entity instanceof JollyRatDayEntity animatable)
			animatable.setTexture("jollyrat_fms");
		if (entity instanceof RickyRatEntity animatable)
			animatable.setTexture("rickyrat_fms");
		if (entity instanceof RickyRatDayEntity animatable)
			animatable.setTexture("rickyrat_fms");
		if (entity instanceof WitheredJollyRatEntity animatable)
			animatable.setTexture("withered_jollyrat_fms");
		if (entity instanceof WitheredJollyRatDayEntity animatable)
			animatable.setTexture("withered_jollyrat_fms");
		if (entity instanceof BarryPolarEntity animatable)
			animatable.setTexture("barrypolar_fms");
		if (entity instanceof BarryPolarDayEntity animatable)
			animatable.setTexture("barrypolar_fms");
		if (entity instanceof RustyEntity animatable)
			animatable.setTexture("endo1_rusty_fms");
		if (entity instanceof RustyDayEntity animatable)
			animatable.setTexture("endo1_rusty_fms");
		if (entity instanceof GusThePugEntity animatable)
			animatable.setTexture("gus_the_pug_fms");
		if (entity instanceof GusThePugDayEntity animatable)
			animatable.setTexture("gus_the_pug_fms");
		if (entity instanceof GusThePugStillDayEntity animatable)
			animatable.setTexture("gus_the_pug_fms");
		if (entity instanceof DrTeethEntity animatable)
			animatable.setTexture("drteeth_fms");
		if (entity instanceof DrTeethDayEntity animatable)
			animatable.setTexture("drteeth_fms");
	}
}
