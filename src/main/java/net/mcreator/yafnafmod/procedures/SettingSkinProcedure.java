package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.YellowRabbitEntity;
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
import net.mcreator.yafnafmod.entity.PlushtrapEntity;
import net.mcreator.yafnafmod.entity.PlushtrapDayEntity;
import net.mcreator.yafnafmod.entity.PitbonnieEntity;
import net.mcreator.yafnafmod.entity.PitbonnieDayEntity;
import net.mcreator.yafnafmod.entity.NightmareFredbearEntity;
import net.mcreator.yafnafmod.entity.NightmareEntity;
import net.mcreator.yafnafmod.entity.NightmareBbEntity;
import net.mcreator.yafnafmod.entity.NightmareBbDayEntity;
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
	public static void execute(Entity entity, double skin) {
		if (entity == null)
			return;
		boolean can_laugh = false;
		String suffix = "";
		String textureName = "";
		suffix = "";
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
			if (entity instanceof BalloonBoyEntity animatable)
				animatable.setTexture(("bb" + suffix));
			if (entity instanceof RetroFreddyEntity animatable)
				animatable.setTexture(("retro_freddy" + suffix));
			if (entity instanceof RetroFreddyDayEntity animatable)
				animatable.setTexture(("retro_freddy" + suffix));
			if (entity instanceof BalloonBoyDayEntity animatable)
				animatable.setTexture(("bb" + suffix));
			if (entity instanceof ShadowFreddyEntity animatable)
				animatable.setTexture(("sfreddy" + suffix));
			if (entity instanceof ShadowFreddyEntity animatable)
				animatable.setTexture(("wsfreddy" + suffix));
			if (entity instanceof ShadowBonnieEntity animatable)
				animatable.setTexture(("sbonnie" + suffix));
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
			if ((entity instanceof FuntimeFreddyEntity _datEntL35 && _datEntL35.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
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
				animatable.setTexture(("sparky_hoax" + suffix));
			if (entity instanceof SparkyDogDayEntity animatable)
				animatable.setTexture(("sparky_hoax" + suffix));
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
			if ((entity instanceof FuntimeFreddyEntity _datEntL90 && _datEntL90.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
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
			if ((entity instanceof FuntimeFreddyEntity _datEntL125 && _datEntL125.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
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
