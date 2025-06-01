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
	public static void execute(Entity entity, String skin, String style) {
		if (entity == null || skin == null || style == null)
			return;
		boolean can_laugh = false;
		if (!(style).equals("fms")) {
			if ((skin).equals("stage01")) {
				if (entity instanceof FredbearEntity animatable)
					animatable.setTexture("fredbear_stage01");
				if (entity instanceof FredbearDayEntity animatable)
					animatable.setTexture("fredbear_stage01");
				if (entity instanceof SpringbonnieEntity animatable)
					animatable.setTexture("springbonnie_stage01");
				if (entity instanceof SpringbonnieDayEntity animatable)
					animatable.setTexture("springbonnie_stage01");
			} else if ((skin).equals("alt")) {
				if (entity instanceof FreddyFazbearEntity animatable)
					animatable.setTexture("freddyfazbear_sign");
				if (entity instanceof FreddyFazbearDayEntity animatable)
					animatable.setTexture("freddyfazbear_sign");
				if (entity instanceof RetroFreddyEntity animatable)
					animatable.setTexture("retro_freddy_cutscene");
				if (entity instanceof RetroFreddyDayEntity animatable)
					animatable.setTexture("retro_freddy_cutscene");
				if (entity instanceof ShadowFreddyEntity animatable)
					animatable.setTexture("wsfreddy_redbear");
				if (entity instanceof ShadowBonnieEntity animatable)
					animatable.setTexture("sbonnie_whiterabbit");
				if (entity instanceof SpringtrapEntity animatable)
					animatable.setTexture("springtrap_dark");
				if (entity instanceof SpringtrapDayEntity animatable)
					animatable.setTexture("springtrap_dark");
				if (entity instanceof SpringbonnieEntity animatable)
					animatable.setTexture("springbonnie_fnaf4");
				if (entity instanceof SpringbonnieDayEntity animatable)
					animatable.setTexture("springbonnie_fnaf4");
				if (entity instanceof NightmareBbEntity animatable)
					animatable.setTexture("nightmare_bb_jjskin");
				if (entity instanceof NightmareBbDayEntity animatable)
					animatable.setTexture("nightmare_bb_jjskin");
				if (entity instanceof PlushtrapEntity animatable)
					animatable.setTexture("plushtrap_fingertrap");
				if (entity instanceof PlushtrapDayEntity animatable)
					animatable.setTexture("plushtrap_fingertrap");
				if (entity instanceof FuntimeFreddyEntity animatable)
					animatable.setTexture("ftfreddy_beta");
				if (entity instanceof FuntimeFreddyDayEntity animatable)
					animatable.setTexture("ftfreddy_beta");
				if (entity instanceof FuntimeFoxyEntity animatable)
					animatable.setTexture("ftfoxy_beta");
				if (entity instanceof FuntimeFoxyDayEntity animatable)
					animatable.setTexture("ftfoxy_beta");
				if (entity instanceof NightmareFredbearEntity animatable)
					animatable.setTexture("nightmare_fredbear_teaser");
				if (entity instanceof LeftyEntity animatable)
					animatable.setTexture("lefty_alt");
				if (entity instanceof LeftyDayEntity animatable)
					animatable.setTexture("lefty_alt");
				if (entity instanceof SparkyDogEntity animatable)
					animatable.setTexture("sparky_hoax");
				if (entity instanceof SparkyDogDayEntity animatable)
					animatable.setTexture("sparky_hoax");
				if (entity instanceof PitbonnieEntity animatable)
					animatable.setTexture("pitbonnie_novel");
				if (entity instanceof PitbonnieDayEntity animatable)
					animatable.setTexture("pitbonnie_novel");
				if (entity instanceof LolbitEntity animatable)
					animatable.setTexture("lolbit_racer");
				if (entity instanceof CandyCatEntity animatable)
					animatable.setTexture("candythecat_beta");
				if (entity instanceof CandyCatDayEntity animatable)
					animatable.setTexture("candythecat_beta");
				if (entity instanceof YellowRabbitEntity animatable)
					animatable.setTexture("yellow_rabbit_game");
			} else if ((skin).equals("fixed")) {
				if (entity instanceof FoxyPirateEntity animatable)
					animatable.setTexture("foxy_pirate_fixed");
				if (entity instanceof FoxyPirateDayEntity animatable)
					animatable.setTexture("foxy_pirate_fixed");
				if (entity instanceof YellowRabbitEntity animatable)
					animatable.setTexture("yellow_rabbit_fixed");
			} else if ((skin).equals("vr_trailer")) {
				if (entity instanceof NightmareFredbearEntity animatable)
					animatable.setTexture("nightmare_fredbear_vrtrailer");
			} else if ((skin).equals("solid")) {
				if (entity instanceof NightmareEntity animatable)
					animatable.setTexture("nightmare_solid");
			} else if ((skin).equals("poster")) {
				if (entity instanceof FredbearEntity animatable)
					animatable.setTexture("fredbear_poster");
				if (entity instanceof FredbearDayEntity animatable)
					animatable.setTexture("fredbear_poster");
				if (entity instanceof SpringbonnieEntity animatable)
					animatable.setTexture("springbonnie_poster");
				if (entity instanceof SpringbonnieDayEntity animatable)
					animatable.setTexture("springbonnie_poster");
			} else if ((skin).equals("novel")) {
				if ((entity instanceof FuntimeFreddyEntity _datEntL42 && _datEntL42.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
					if (entity instanceof FuntimeFreddyEntity animatable)
						animatable.setTexture("ftfreddy_novel");
				} else {
					if (entity instanceof FuntimeFreddyEntity animatable)
						animatable.setTexture("ftfreddy_bonless_novel");
				}
				if (entity instanceof FuntimeFreddyDayEntity animatable)
					animatable.setTexture("ftfreddy_novel");
				if (entity instanceof BonbonEntity animatable)
					animatable.setTexture("bonbon_novel");
			} else if ((skin).equals("frights")) {
				if ((entity instanceof FuntimeFreddyEntity _datEntL47 && _datEntL47.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
					if (entity instanceof FuntimeFreddyEntity animatable)
						animatable.setTexture("ftfreddy_ctw");
				} else {
					if (entity instanceof FuntimeFreddyEntity animatable)
						animatable.setTexture("ftfreddy_bonless_ctw");
				}
				if (entity instanceof FuntimeFreddyDayEntity animatable)
					animatable.setTexture("ftfreddy_ctw");
				if (entity instanceof BonbonEntity animatable)
					animatable.setTexture("bonbon_ctw");
			} else if ((skin).equals("meme")) {
				if (entity instanceof BalloonBoyEntity animatable)
					animatable.setTexture("bb_enragementchild");
				if (entity instanceof BalloonBoyDayEntity animatable)
					animatable.setTexture("bb_enragementchild");
			} else if ((skin).equals("movie")) {
				if (entity instanceof FreddyFazbearEntity animatable)
					animatable.setTexture("freddyfazbear_movie");
				if (entity instanceof FreddyFazbearDayEntity animatable)
					animatable.setTexture("freddyfazbear_movie");
				if (entity instanceof BonnieBunnyEntity animatable)
					animatable.setTexture("bonniebunny_movie");
				if (entity instanceof BonnieBunnyDayEntity animatable)
					animatable.setTexture("bonniebunny_movie");
				if (entity instanceof ChicaChickenEntity animatable)
					animatable.setTexture("chicachicken_movie");
				if (entity instanceof ChicaChickenDayEntity animatable)
					animatable.setTexture("chicachicken_movie");
				if (entity instanceof FoxyPirateEntity animatable)
					animatable.setTexture("foxy_pirate_movie");
				if (entity instanceof FoxyPirateDayEntity animatable)
					animatable.setTexture("foxy_pirate_movie");
				if (entity instanceof GoldenFreddyEntity animatable)
					animatable.setTexture("gfreddy_movie");
				if (entity instanceof ShadowFreddyEntity animatable)
					animatable.setTexture("sfreddy_movie");
			} else if ((skin).equals("dbd")) {
				if (entity instanceof SpringtrapEntity animatable)
					animatable.setTexture("springtrap_dbd");
				if (entity instanceof SpringtrapDayEntity animatable)
					animatable.setTexture("springtrap_dbd");
			}
			entity.getPersistentData().putString("skin", skin);
		} else {
			SkinStyleFMSProcedure.execute(entity);
		}
		entity.getPersistentData().putString("style", style);
	}
}
