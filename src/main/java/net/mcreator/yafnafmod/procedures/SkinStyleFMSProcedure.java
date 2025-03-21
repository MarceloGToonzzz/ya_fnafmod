package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.WitheredFreddyEntity;
import net.mcreator.yafnafmod.entity.WitheredFreddyDayEntity;
import net.mcreator.yafnafmod.entity.WitheredFoxyEntity;
import net.mcreator.yafnafmod.entity.WitheredFoxyDayEntity;
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
import net.mcreator.yafnafmod.entity.ShadowBonnieEntity;
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
import net.mcreator.yafnafmod.entity.HappyFrogEntity;
import net.mcreator.yafnafmod.entity.HappyFrogDayEntity;
import net.mcreator.yafnafmod.entity.GoldenFreddyEntity;
import net.mcreator.yafnafmod.entity.FreddyFazbearEntity;
import net.mcreator.yafnafmod.entity.FreddyFazbearDayEntity;
import net.mcreator.yafnafmod.entity.FredbearEntity;
import net.mcreator.yafnafmod.entity.FredbearDayEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateDayEntity;
import net.mcreator.yafnafmod.entity.ChicaChickenEntity;
import net.mcreator.yafnafmod.entity.ChicaChickenDayEntity;
import net.mcreator.yafnafmod.entity.BonnieBunnyEntity;
import net.mcreator.yafnafmod.entity.BonnieBunnyDayEntity;

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
	}
}
