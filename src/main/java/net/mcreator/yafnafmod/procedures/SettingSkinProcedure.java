package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.yafnafmod.entity.YellowRabbitEntity;
import net.mcreator.yafnafmod.entity.PitbonnieEntity;
import net.mcreator.yafnafmod.entity.PitbonnieDayEntity;
import net.mcreator.yafnafmod.entity.CandyCatEntity;
import net.mcreator.yafnafmod.entity.CandyCatDayEntity;

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
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:fnaf1"))) || entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:fnaf2")))
					|| entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:fnaf3"))) || entity instanceof YellowRabbitEntity) {
				suffix = "-skin";
			}
		}
		Fnaf1SkinsProcedure.execute(entity, skin, suffix);
		Fnaf2SkinsProcedure.execute(entity, skin, suffix);
		Fnaf3SkinsProcedure.execute(entity, skin, suffix);
		Fnaf4SkinsProcedure.execute(entity, skin, style, suffix);
		Fnaf5SkinsProcedure.execute(entity, skin, suffix);
		Fnaf6SkinsProcedure.execute(entity, skin, suffix);
		if (skin == 0) {
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
			if (entity instanceof YellowRabbitEntity animatable)
				animatable.setTexture(("yellow_rabbit_game" + suffix));
		}
	}
}
