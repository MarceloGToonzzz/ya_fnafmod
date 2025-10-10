package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.YellowRabbitEntity;
import net.mcreator.yafnafmod.entity.WitheredFreddyEntity;
import net.mcreator.yafnafmod.entity.WitheredFreddyDayEntity;
import net.mcreator.yafnafmod.entity.WitheredFoxyEntity;
import net.mcreator.yafnafmod.entity.WitheredFoxyDayEntity;
import net.mcreator.yafnafmod.entity.WitheredChicaEntity;
import net.mcreator.yafnafmod.entity.WitheredChicaDayEntity;
import net.mcreator.yafnafmod.entity.WitheredBonnieEntity;
import net.mcreator.yafnafmod.entity.WitheredBonnieDayEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyDayEntity;
import net.mcreator.yafnafmod.entity.ToyFoxyEntity;
import net.mcreator.yafnafmod.entity.ToyFoxyDayEntity;
import net.mcreator.yafnafmod.entity.ToyCupcakeEntityEntity;
import net.mcreator.yafnafmod.entity.ToyChicaEntity;
import net.mcreator.yafnafmod.entity.ToyChicaDayEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieDayEntity;
import net.mcreator.yafnafmod.entity.SpringtrapEntity;
import net.mcreator.yafnafmod.entity.SpringtrapDayEntity;
import net.mcreator.yafnafmod.entity.SpringbonnieEntity;
import net.mcreator.yafnafmod.entity.SpringbonnieDayEntity;
import net.mcreator.yafnafmod.entity.SparkyDogEntity;
import net.mcreator.yafnafmod.entity.SparkyDogDayEntity;
import net.mcreator.yafnafmod.entity.ShadowFreddyEntity;
import net.mcreator.yafnafmod.entity.ShadowBonnieEntity;
import net.mcreator.yafnafmod.entity.RetroFreddyEntity;
import net.mcreator.yafnafmod.entity.RetroFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RetroFoxyEntity;
import net.mcreator.yafnafmod.entity.RetroFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RetroCupcakeEntityEntity;
import net.mcreator.yafnafmod.entity.RetroChicaEntity;
import net.mcreator.yafnafmod.entity.RetroChicaDayEntity;
import net.mcreator.yafnafmod.entity.RetroBonnieEntity;
import net.mcreator.yafnafmod.entity.RetroBonnieDayEntity;
import net.mcreator.yafnafmod.entity.PlushtrapEntity;
import net.mcreator.yafnafmod.entity.PlushtrapDayEntity;
import net.mcreator.yafnafmod.entity.PitbonnieEntity;
import net.mcreator.yafnafmod.entity.PitbonnieDayEntity;
import net.mcreator.yafnafmod.entity.NightmareFredbearEntity;
import net.mcreator.yafnafmod.entity.NightmareEntity;
import net.mcreator.yafnafmod.entity.NightmareBbEntity;
import net.mcreator.yafnafmod.entity.NightmareBbDayEntity;
import net.mcreator.yafnafmod.entity.MangleEntity;
import net.mcreator.yafnafmod.entity.MangleDayEntity;
import net.mcreator.yafnafmod.entity.LolbitEntity;
import net.mcreator.yafnafmod.entity.LeftyEntity;
import net.mcreator.yafnafmod.entity.LeftyDayEntity;
import net.mcreator.yafnafmod.entity.GoldenFreddyEntity;
import net.mcreator.yafnafmod.entity.FuntimeFreddyEntity;
import net.mcreator.yafnafmod.entity.FuntimeFreddyDayEntity;
import net.mcreator.yafnafmod.entity.FuntimeFoxyEntity;
import net.mcreator.yafnafmod.entity.FuntimeFoxyDayEntity;
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
import net.mcreator.yafnafmod.entity.CupcakeEntityEntity;
import net.mcreator.yafnafmod.entity.ChicaChickenEntity;
import net.mcreator.yafnafmod.entity.ChicaChickenDayEntity;
import net.mcreator.yafnafmod.entity.CandyCatEntity;
import net.mcreator.yafnafmod.entity.CandyCatDayEntity;
import net.mcreator.yafnafmod.entity.BonnieBunnyEntity;
import net.mcreator.yafnafmod.entity.BonnieBunnyDayEntity;
import net.mcreator.yafnafmod.entity.BonbonEntity;
import net.mcreator.yafnafmod.entity.BalloonBoyEntity;
import net.mcreator.yafnafmod.entity.BalloonBoyDayEntity;

public class SettingSkinProcedure {
	public static void execute(Entity entity, double skin, double style) {
		if (entity == null)
			return;
		boolean can_laugh = false;
		String suffix = "";
		String textureName = "";
		suffix = "";
		if (style == 0) {
			suffix = "";
		} else if (style == 1) {
			suffix = "-skin";
		}
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
			if (entity instanceof ToyFreddyEntity animatable)
				animatable.setTexture(("tfreddy_night" + suffix));
			if (entity instanceof ToyFreddyDayEntity animatable)
				animatable.setTexture(("tfreddy_day" + suffix));
			if (entity instanceof ToyBonnieEntity animatable)
				animatable.setTexture(("tbonnie_night" + suffix));
			if (entity instanceof ToyBonnieDayEntity animatable)
				animatable.setTexture(("tbonnie_day" + suffix));
			if (entity instanceof ToyChicaEntity animatable)
				animatable.setTexture(("tchica_night" + suffix));
			if (entity instanceof ToyChicaDayEntity animatable)
				animatable.setTexture(("tchica_day" + suffix));
			if (entity instanceof ToyCupcakeEntityEntity animatable)
				animatable.setTexture(("cupcake_toy" + suffix));
			if (entity instanceof ToyFoxyEntity animatable)
				animatable.setTexture(("tfoxy_night" + suffix));
			if (entity instanceof ToyFoxyDayEntity animatable)
				animatable.setTexture(("tfoxy_day" + suffix));
			if (entity instanceof MangleEntity animatable)
				animatable.setTexture(("mangle" + suffix));
			if (entity instanceof MangleDayEntity animatable)
				animatable.setTexture(("mangle" + suffix));
			if (entity instanceof WitheredFreddyEntity animatable)
				animatable.setTexture(("withered_freddy" + suffix));
			if (entity instanceof WitheredFreddyDayEntity animatable)
				animatable.setTexture(("withered_freddy" + suffix));
			if (entity instanceof WitheredBonnieEntity animatable)
				animatable.setTexture(("withered_bonnie" + suffix));
			if (entity instanceof WitheredBonnieDayEntity animatable)
				animatable.setTexture(("withered_bonnie_day" + suffix));
			if (entity instanceof WitheredChicaEntity animatable)
				animatable.setTexture(("withered_chica" + suffix));
			if (entity instanceof WitheredChicaDayEntity animatable)
				animatable.setTexture(("withered_chica" + suffix));
			if (entity instanceof WitheredFoxyEntity animatable)
				animatable.setTexture(("withered_foxy" + suffix));
			if (entity instanceof WitheredFoxyDayEntity animatable)
				animatable.setTexture(("withered_foxy" + suffix));
			if (entity instanceof RetroFreddyEntity animatable)
				animatable.setTexture(("retro_freddy" + suffix));
			if (entity instanceof RetroFreddyDayEntity animatable)
				animatable.setTexture(("retro_freddy" + suffix));
			if (entity instanceof RetroBonnieEntity animatable)
				animatable.setTexture(("retro_bonnie" + suffix));
			if (entity instanceof RetroBonnieDayEntity animatable)
				animatable.setTexture(("retro_bonnie" + suffix));
			if (entity instanceof RetroChicaDayEntity animatable)
				animatable.setTexture(("retro_freddy" + suffix));
			if (entity instanceof RetroCupcakeEntityEntity animatable)
				animatable.setTexture(("cupcake_retro" + suffix));
			if (entity instanceof RetroChicaEntity animatable)
				animatable.setTexture(("retro_freddy" + suffix));
			if (entity instanceof RetroFoxyDayEntity animatable)
				animatable.setTexture(("retro_freddy" + suffix));
			if (entity instanceof RetroFoxyEntity animatable)
				animatable.setTexture(("retro_freddy" + suffix));
			if (entity instanceof BalloonBoyEntity animatable)
				animatable.setTexture(("bb" + suffix));
			if (entity instanceof BalloonBoyDayEntity animatable)
				animatable.setTexture(("bb" + suffix));
			if (entity instanceof ShadowFreddyEntity animatable)
				animatable.setTexture(("sfreddy" + suffix));
			if (entity instanceof ShadowFreddyEntity animatable)
				animatable.setTexture(("wsfreddy" + suffix));
			if (entity instanceof ShadowBonnieEntity animatable)
				animatable.setTexture(("sbonnie" + suffix));
			if (entity instanceof Endo02Entity animatable)
				animatable.setTexture(("endo2" + suffix));
			if (entity instanceof Endo02DayEntity animatable)
				animatable.setTexture(("endo2" + suffix));
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
			if (entity instanceof FuntimeFreddyDayEntity animatable)
				animatable.setTexture(("ftfreddy" + suffix));
			if ((entity instanceof FuntimeFreddyEntity _datEntL69 && _datEntL69.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
				if (entity instanceof FuntimeFreddyEntity animatable)
					animatable.setTexture(("ftfreddy" + suffix));
			} else {
				if (entity instanceof FuntimeFreddyEntity animatable)
					animatable.setTexture(("ftfreddy_bonless" + suffix));
			}
			if (entity instanceof BonbonEntity animatable)
				animatable.setTexture(("bonbon" + suffix));
			if (entity instanceof FuntimeFoxyEntity animatable)
				animatable.setTexture(("ftfoxy" + suffix));
			if (entity instanceof FuntimeFoxyDayEntity animatable)
				animatable.setTexture(("ftfoxy" + suffix));
			if (entity instanceof LolbitEntity animatable)
				animatable.setTexture(("lolbit" + suffix));
			if (entity instanceof LeftyEntity animatable)
				animatable.setTexture(("lefty" + suffix));
			if (entity instanceof LeftyDayEntity animatable)
				animatable.setTexture(("lefty" + suffix));
			if (entity instanceof YellowRabbitEntity animatable)
				animatable.setTexture(("yellow_rabbit" + suffix));
			if (entity instanceof PitbonnieEntity animatable)
				animatable.setTexture(("pitbonnie" + suffix));
			if (entity instanceof PitbonnieDayEntity animatable)
				animatable.setTexture(("pitbonnie" + suffix));
			if (entity instanceof CandyCatEntity animatable)
				animatable.setTexture(("candythecat" + suffix));
			if (entity instanceof CandyCatDayEntity animatable)
				animatable.setTexture(("candythecat" + suffix));
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
			if (entity instanceof BalloonBoyEntity animatable)
				animatable.setTexture(("bb_enragementchild" + suffix));
			if (entity instanceof BalloonBoyDayEntity animatable)
				animatable.setTexture(("bb_enragementchild" + suffix));
			if (entity instanceof ShadowFreddyEntity animatable)
				animatable.setTexture(("sfreddy_movie" + suffix));
			if (entity instanceof ShadowFreddyEntity animatable)
				animatable.setTexture(("wsfreddy_redbear" + suffix));
			if (entity instanceof ShadowBonnieEntity animatable)
				animatable.setTexture(("sbonnie_whiterabbit" + suffix));
			if (entity instanceof RetroFreddyEntity animatable)
				animatable.setTexture(("retro_freddy_cutscene" + suffix));
			if (entity instanceof RetroFreddyDayEntity animatable)
				animatable.setTexture(("retro_freddy_cutscene" + suffix));
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
			if (entity instanceof FuntimeFreddyDayEntity animatable)
				animatable.setTexture(("ftfreddy_novel" + suffix));
			if ((entity instanceof FuntimeFreddyEntity _datEntL124 && _datEntL124.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
				if (entity instanceof FuntimeFreddyEntity animatable)
					animatable.setTexture(("ftfreddy_novel" + suffix));
			} else {
				if (entity instanceof FuntimeFreddyEntity animatable)
					animatable.setTexture(("ftfreddy_bonless_novel" + suffix));
			}
			if (entity instanceof BonbonEntity animatable)
				animatable.setTexture(("bonbon_novel" + suffix));
			if (entity instanceof FuntimeFoxyEntity animatable)
				animatable.setTexture(("ftfoxy_beta" + suffix));
			if (entity instanceof FuntimeFoxyDayEntity animatable)
				animatable.setTexture(("ftfoxy_beta" + suffix));
			if (entity instanceof LolbitEntity animatable)
				animatable.setTexture(("lolbit_racer" + suffix));
			if (entity instanceof LeftyEntity animatable)
				animatable.setTexture(("lefty_alt" + suffix));
			if (entity instanceof LeftyDayEntity animatable)
				animatable.setTexture(("lefty_alt" + suffix));
			if (entity instanceof YellowRabbitEntity animatable)
				animatable.setTexture(("yellow_rabbit_fixed" + suffix));
			if (entity instanceof PitbonnieEntity animatable)
				animatable.setTexture(("pitbonnie_novel" + suffix));
			if (entity instanceof PitbonnieDayEntity animatable)
				animatable.setTexture(("pitbonnie_novel" + suffix));
			if (entity instanceof CandyCatEntity animatable)
				animatable.setTexture(("candythecat_beta" + suffix));
			if (entity instanceof CandyCatDayEntity animatable)
				animatable.setTexture(("candythecat_beta" + suffix));
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
			if (entity instanceof RetroFreddyEntity animatable)
				animatable.setTexture(("retro_gfreddy" + suffix));
			if (entity instanceof RetroFreddyDayEntity animatable)
				animatable.setTexture(("retro_gfreddy" + suffix));
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
			if (entity instanceof NightmareFredbearEntity animatable)
				animatable.setTexture(("nightmare_fredbear_vrtrailer" + suffix));
			if (entity instanceof FuntimeFreddyDayEntity animatable)
				animatable.setTexture(("ftfreddy_ctw" + suffix));
			if ((entity instanceof FuntimeFreddyEntity _datEntL164 && _datEntL164.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
				if (entity instanceof FuntimeFreddyEntity animatable)
					animatable.setTexture(("ftfreddy_ctw" + suffix));
			} else {
				if (entity instanceof FuntimeFreddyEntity animatable)
					animatable.setTexture(("ftfreddy_bonless_ctw" + suffix));
			}
			if (entity instanceof ShadowFreddyEntity animatable)
				animatable.setTexture(("wsfreddy_corner" + suffix));
			if (entity instanceof BonbonEntity animatable)
				animatable.setTexture(("bonbon_ctw" + suffix));
			if (entity instanceof YellowRabbitEntity animatable)
				animatable.setTexture(("yellow_rabbit_game" + suffix));
		} else if (skin == 3) {
			if (entity instanceof SpringbonnieEntity animatable)
				animatable.setTexture(("springbonnie_fnaf4" + suffix));
			if (entity instanceof SpringbonnieDayEntity animatable)
				animatable.setTexture(("springbonnie_fnaf4" + suffix));
		}
	}
}
