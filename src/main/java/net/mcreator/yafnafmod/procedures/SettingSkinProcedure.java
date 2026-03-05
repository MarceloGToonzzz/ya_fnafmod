package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.yafnafmod.network.YaFnafmodModVariables;
import net.mcreator.yafnafmod.entity.YellowRabbitEntity;
import net.mcreator.yafnafmod.entity.SpringbonnieSuitEntity;
import net.mcreator.yafnafmod.entity.ShadowFreddySuitEntity;
import net.mcreator.yafnafmod.entity.PlushbabyMobEntity;
import net.mcreator.yafnafmod.entity.PlushbabyMobDayEntity;
import net.mcreator.yafnafmod.entity.PitbonnieEntity;
import net.mcreator.yafnafmod.entity.PitbonnieDayEntity;
import net.mcreator.yafnafmod.entity.MemoryFreddyEntity;
import net.mcreator.yafnafmod.entity.MemoryFreddyDayEntity;
import net.mcreator.yafnafmod.entity.MemoryChicaEntity;
import net.mcreator.yafnafmod.entity.MemoryChicaDayEntity;
import net.mcreator.yafnafmod.entity.MemoryBonnieEntity;
import net.mcreator.yafnafmod.entity.MemoryBonnieDayEntity;
import net.mcreator.yafnafmod.entity.GlitchtrapEntity;
import net.mcreator.yafnafmod.entity.FredbearSuitHeadlessEntity;
import net.mcreator.yafnafmod.entity.FredbearSuitEntity;
import net.mcreator.yafnafmod.entity.CandyCatEntity;
import net.mcreator.yafnafmod.entity.CandyCatDayEntity;

public class SettingSkinProcedure {
	public static void execute(LevelAccessor world, Entity entiti, double skin, double style) {
		if (entiti == null)
			return;
		boolean can_laugh = false;
		String suffix = "";
		String textureName = "";
		suffix = "";
		if (style == 0) {
			suffix = "";
		} else if (style == 1) {
			if (entiti.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:fnaf1"))) || entiti.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:fnaf2")))
					|| entiti.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:fnaf3"))) || entiti.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:fnafitp")))
					|| entiti instanceof YellowRabbitEntity || entiti instanceof SpringbonnieSuitEntity || entiti instanceof FredbearSuitEntity || entiti instanceof FredbearSuitHeadlessEntity || entiti instanceof ShadowFreddySuitEntity
					|| entiti instanceof GlitchtrapEntity) {
				suffix = "-skin";
			}
		}
		Fnaf1SkinsProcedure.execute(entiti, skin, suffix);
		Fnaf2SkinsProcedure.execute(entiti, skin, suffix);
		Fnaf3SkinsProcedure.execute(entiti, skin, suffix);
		Fnaf4SkinsProcedure.execute(entiti, skin, "");
		Fnaf5SkinsProcedure.execute(entiti, skin, "");
		Fnaf6SkinsProcedure.execute(entiti, skin, "");
		if (skin == 0) {
			if (entiti instanceof YellowRabbitEntity animatable)
				animatable.setTexture(("yellow_rabbit" + suffix));
			if (entiti instanceof ShadowFreddySuitEntity animatable)
				animatable.setTexture(("sfreddy_suit" + suffix));
			if (entiti instanceof GlitchtrapEntity animatable)
				animatable.setTexture(("glitchtrap_suit" + suffix));
			if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == false) {
				if (entiti instanceof PlushbabyMobEntity animatable)
					animatable.setTexture(("plushbaby1" + suffix));
				if (entiti instanceof PlushbabyMobDayEntity animatable)
					animatable.setTexture(("plushbaby1" + suffix));
			} else {
				if (entiti instanceof PlushbabyMobEntity animatable)
					animatable.setTexture(("plushbaby1_plushkin" + suffix));
				if (entiti instanceof PlushbabyMobDayEntity animatable)
					animatable.setTexture(("plushbaby1_plushkin" + suffix));
			}
			if (entiti instanceof PitbonnieEntity animatable)
				animatable.setTexture(("pitbonnie" + suffix));
			if (entiti instanceof PitbonnieDayEntity animatable)
				animatable.setTexture(("pitbonnie" + suffix));
			if (entiti instanceof MemoryFreddyEntity animatable)
				animatable.setTexture(("memory_freddy_night" + suffix));
			if (entiti instanceof MemoryFreddyDayEntity animatable)
				animatable.setTexture(("memory_freddy" + suffix));
			if (entiti instanceof MemoryBonnieEntity animatable)
				animatable.setTexture(("memory_bonnie_night" + suffix));
			if (entiti instanceof MemoryBonnieDayEntity animatable)
				animatable.setTexture(("memory_bonnie" + suffix));
			if (entiti instanceof MemoryChicaEntity animatable)
				animatable.setTexture(("memory_chica_night" + suffix));
			if (entiti instanceof MemoryChicaDayEntity animatable)
				animatable.setTexture(("memory_chica" + suffix));
			if (entiti instanceof CandyCatEntity animatable)
				animatable.setTexture(("candythecat" + suffix));
			if (entiti instanceof CandyCatDayEntity animatable)
				animatable.setTexture(("candythecat" + suffix));
		} else if (skin == 1) {
			if (entiti instanceof YellowRabbitEntity animatable)
				animatable.setTexture(("yellow_rabbit_fixed" + suffix));
			if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == false) {
				if (entiti instanceof PlushbabyMobEntity animatable)
					animatable.setTexture(("plushbaby2" + suffix));
				if (entiti instanceof PlushbabyMobDayEntity animatable)
					animatable.setTexture(("plushbaby2" + suffix));
			} else {
				if (entiti instanceof PlushbabyMobEntity animatable)
					animatable.setTexture(("plushbaby2_plushkin" + suffix));
				if (entiti instanceof PlushbabyMobDayEntity animatable)
					animatable.setTexture(("plushbaby2_plushkin" + suffix));
			}
			if (entiti instanceof PitbonnieEntity animatable)
				animatable.setTexture(("pitbonnie_novel" + suffix));
			if (entiti instanceof PitbonnieDayEntity animatable)
				animatable.setTexture(("pitbonnie_novel" + suffix));
			if (entiti instanceof CandyCatEntity animatable)
				animatable.setTexture(("candythecat_beta" + suffix));
			if (entiti instanceof CandyCatDayEntity animatable)
				animatable.setTexture(("candythecat_beta" + suffix));
		} else if (skin == 2) {
			if (entiti instanceof YellowRabbitEntity animatable)
				animatable.setTexture(("yellow_rabbit_game" + suffix));
			if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == false) {
				if (entiti instanceof PlushbabyMobEntity animatable)
					animatable.setTexture(("plushbaby3" + suffix));
				if (entiti instanceof PlushbabyMobDayEntity animatable)
					animatable.setTexture(("plushbaby3" + suffix));
			} else {
				if (entiti instanceof PlushbabyMobEntity animatable)
					animatable.setTexture(("plushbaby3_plushkin" + suffix));
				if (entiti instanceof PlushbabyMobDayEntity animatable)
					animatable.setTexture(("plushbaby3_plushkin" + suffix));
			}
		} else if (skin == 3) {
			if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == false) {
				if (entiti instanceof PlushbabyMobEntity animatable)
					animatable.setTexture(("plushbaby4" + suffix));
				if (entiti instanceof PlushbabyMobDayEntity animatable)
					animatable.setTexture(("plushbaby4" + suffix));
			} else {
				if (entiti instanceof PlushbabyMobEntity animatable)
					animatable.setTexture(("plushbaby4_plushkin" + suffix));
				if (entiti instanceof PlushbabyMobDayEntity animatable)
					animatable.setTexture(("plushbaby4_plushkin" + suffix));
			}
		} else if (skin == 4) {
			if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == false) {
				if (entiti instanceof PlushbabyMobEntity animatable)
					animatable.setTexture(("plushbaby5" + suffix));
				if (entiti instanceof PlushbabyMobDayEntity animatable)
					animatable.setTexture(("plushbaby5" + suffix));
			} else {
				if (entiti instanceof PlushbabyMobEntity animatable)
					animatable.setTexture(("plushbaby5_plushkin" + suffix));
				if (entiti instanceof PlushbabyMobDayEntity animatable)
					animatable.setTexture(("plushbaby5_plushkin" + suffix));
			}
		} else if (skin == 5) {
			if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == false) {
				if (entiti instanceof PlushbabyMobEntity animatable)
					animatable.setTexture(("plushbaby6" + suffix));
				if (entiti instanceof PlushbabyMobDayEntity animatable)
					animatable.setTexture(("plushbaby6" + suffix));
			} else {
				if (entiti instanceof PlushbabyMobEntity animatable)
					animatable.setTexture(("plushbaby6_plushkin" + suffix));
				if (entiti instanceof PlushbabyMobDayEntity animatable)
					animatable.setTexture(("plushbaby6_plushkin" + suffix));
			}
		}
	}
}
