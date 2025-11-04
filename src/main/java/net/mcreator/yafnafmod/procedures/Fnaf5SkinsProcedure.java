package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.ShadowFreddyEntity;
import net.mcreator.yafnafmod.entity.LolbitEntity;
import net.mcreator.yafnafmod.entity.FuntimeFreddyEntity;
import net.mcreator.yafnafmod.entity.FuntimeFreddyDayEntity;
import net.mcreator.yafnafmod.entity.FuntimeFoxyEntity;
import net.mcreator.yafnafmod.entity.FuntimeFoxyDayEntity;
import net.mcreator.yafnafmod.entity.BonbonEntity;

public class Fnaf5SkinsProcedure {
	public static void execute(Entity entity, double skin, String suffixa) {
		if (entity == null || suffixa == null)
			return;
		String suffix = "";
		suffix = suffixa;
		if (skin == 0) {
			if (entity instanceof FuntimeFreddyDayEntity animatable)
				animatable.setTexture(("ftfreddy" + suffix));
			if ((entity instanceof FuntimeFreddyEntity _datEntL1 && _datEntL1.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
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
		} else if (skin == 1) {
			if (entity instanceof FuntimeFreddyDayEntity animatable)
				animatable.setTexture(("ftfreddy_novel" + suffix));
			if ((entity instanceof FuntimeFreddyEntity _datEntL11 && _datEntL11.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
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
		} else if (skin == 2) {
			if (entity instanceof FuntimeFreddyDayEntity animatable)
				animatable.setTexture(("ftfreddy_ctw" + suffix));
			if ((entity instanceof FuntimeFreddyEntity _datEntL21 && _datEntL21.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
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
		}
	}
}
