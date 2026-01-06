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
import net.mcreator.yafnafmod.entity.ToyFreddyEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyDayEntity;
import net.mcreator.yafnafmod.entity.ToyFoxyEntity;
import net.mcreator.yafnafmod.entity.ToyFoxyDayEntity;
import net.mcreator.yafnafmod.entity.ToyCupcakeEntityEntity;
import net.mcreator.yafnafmod.entity.ToyChicaEntity;
import net.mcreator.yafnafmod.entity.ToyChicaDayEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieDayEntity;
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
import net.mcreator.yafnafmod.entity.PuppetEntity;
import net.mcreator.yafnafmod.entity.PuppetDayEntity;
import net.mcreator.yafnafmod.entity.MangleEntity;
import net.mcreator.yafnafmod.entity.MangleDayEntity;
import net.mcreator.yafnafmod.entity.Endo02Entity;
import net.mcreator.yafnafmod.entity.Endo02DayEntity;
import net.mcreator.yafnafmod.entity.BalloonBoyEntity;
import net.mcreator.yafnafmod.entity.BalloonBoyDayEntity;

public class Fnaf2SkinsProcedure {
	public static void execute(Entity entity, double skin, String suffixa) {
		if (entity == null || suffixa == null)
			return;
		String suffix = "";
		suffix = suffixa;
		if (skin == 0) {
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
				animatable.setTexture(("retro_chica" + suffix));
			if (entity instanceof RetroCupcakeEntityEntity animatable)
				animatable.setTexture(("cupcake_retro" + suffix));
			if (entity instanceof RetroChicaEntity animatable)
				animatable.setTexture(("retro_chica" + suffix));
			if (entity instanceof RetroFoxyDayEntity animatable)
				animatable.setTexture(("retro_foxy" + suffix));
			if (entity instanceof RetroFoxyEntity animatable)
				animatable.setTexture(("retro_foxy" + suffix));
			if (entity instanceof PuppetEntity animatable)
				animatable.setTexture(("puppet_night" + suffix));
			if (entity instanceof PuppetDayEntity animatable)
				animatable.setTexture(("puppet_day" + suffix));
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
		} else if (skin == 1) {
			if (entity instanceof ToyFreddyEntity animatable)
				animatable.setTexture(("tfreddy_night_movie" + suffix));
			if (entity instanceof ToyFreddyDayEntity animatable)
				animatable.setTexture(("tfreddy_day_movie" + suffix));
			if (entity instanceof ToyBonnieEntity animatable)
				animatable.setTexture(("tbonnie_night_movie" + suffix));
			if (entity instanceof ToyBonnieDayEntity animatable)
				animatable.setTexture(("tbonnie_day_movie" + suffix));
			if (entity instanceof ToyChicaEntity animatable)
				animatable.setTexture(("tchica_night_movie" + suffix));
			if (entity instanceof ToyChicaDayEntity animatable)
				animatable.setTexture(("tchica_day_movie" + suffix));
			if (entity instanceof ToyCupcakeEntityEntity animatable)
				animatable.setTexture(("cupcake_toy_movie" + suffix));
			if (entity instanceof ToyFoxyEntity animatable)
				animatable.setTexture(("tfoxy_night_movie" + suffix));
			if (entity instanceof ToyFoxyDayEntity animatable)
				animatable.setTexture(("tfoxy_day_movie" + suffix));
			if (entity instanceof MangleEntity animatable)
				animatable.setTexture(("mangle_movie" + suffix));
			if (entity instanceof MangleDayEntity animatable)
				animatable.setTexture(("mangle_movie" + suffix));
			if (entity instanceof BalloonBoyEntity animatable)
				animatable.setTexture(("bb_movie" + suffix));
			if (entity instanceof BalloonBoyDayEntity animatable)
				animatable.setTexture(("bb_movie" + suffix));
			if (entity instanceof WitheredFreddyEntity animatable)
				animatable.setTexture(("withered_freddy_movie" + suffix));
			if (entity instanceof WitheredFreddyDayEntity animatable)
				animatable.setTexture(("withered_freddy_movie" + suffix));
			if (entity instanceof WitheredBonnieEntity animatable)
				animatable.setTexture(("withered_bonnie_movie" + suffix));
			if (entity instanceof WitheredBonnieDayEntity animatable)
				animatable.setTexture(("withered_bonnie_day_movie" + suffix));
			if (entity instanceof WitheredChicaEntity animatable)
				animatable.setTexture(("withered_chica_movie" + suffix));
			if (entity instanceof WitheredChicaDayEntity animatable)
				animatable.setTexture(("withered_chica_movie" + suffix));
			if (entity instanceof WitheredFoxyEntity animatable)
				animatable.setTexture(("withered_foxy_movie" + suffix));
			if (entity instanceof WitheredFoxyDayEntity animatable)
				animatable.setTexture(("withered_foxy_movie" + suffix));
			if (entity instanceof RetroFreddyEntity animatable)
				animatable.setTexture(("retro_freddy_movie" + suffix));
			if (entity instanceof RetroFreddyDayEntity animatable)
				animatable.setTexture(("retro_freddy_movie" + suffix));
			if (entity instanceof RetroBonnieEntity animatable)
				animatable.setTexture(("retro_bonnie_movie" + suffix));
			if (entity instanceof RetroBonnieDayEntity animatable)
				animatable.setTexture(("retro_bonnie_movie" + suffix));
			if (entity instanceof RetroChicaEntity animatable)
				animatable.setTexture(("retro_chica_movie" + suffix));
			if (entity instanceof RetroChicaDayEntity animatable)
				animatable.setTexture(("retro_chica_movie" + suffix));
			if (entity instanceof RetroCupcakeEntityEntity animatable)
				animatable.setTexture(("cupcake_retro_movie" + suffix));
			if (entity instanceof RetroFoxyDayEntity animatable)
				animatable.setTexture(("retro_foxy_movie" + suffix));
			if (entity instanceof RetroFoxyEntity animatable)
				animatable.setTexture(("retro_foxy_movie" + suffix));
			if (entity instanceof PuppetEntity animatable)
				animatable.setTexture(("puppet_night_movie" + suffix));
			if (entity instanceof PuppetDayEntity animatable)
				animatable.setTexture(("puppet_day_movie" + suffix));
			if (entity instanceof ShadowFreddyEntity animatable)
				animatable.setTexture(("wsfreddy_movie" + suffix));
			if (entity instanceof ShadowBonnieEntity animatable)
				animatable.setTexture(("sbonnie_whiterabbit" + suffix));
		} else if (skin == 2) {
			if (entity instanceof BalloonBoyEntity animatable)
				animatable.setTexture(("bb_enragementchild" + suffix));
			if (entity instanceof BalloonBoyDayEntity animatable)
				animatable.setTexture(("bb_enragementchild" + suffix));
			if (entity instanceof ShadowFreddyEntity animatable)
				animatable.setTexture(("wsfreddy_redbear" + suffix));
			if (entity instanceof RetroFreddyEntity animatable)
				animatable.setTexture(("retro_freddy_cutscene" + suffix));
			if (entity instanceof RetroFreddyDayEntity animatable)
				animatable.setTexture(("retro_freddy_cutscene" + suffix));
		} else if (skin == 3) {
			if (entity instanceof RetroFreddyEntity animatable)
				animatable.setTexture(("retro_gfreddy" + suffix));
			if (entity instanceof RetroFreddyDayEntity animatable)
				animatable.setTexture(("retro_gfreddy" + suffix));
		}
	}
}
