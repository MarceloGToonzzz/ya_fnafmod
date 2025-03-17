package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.SpringbonnieDayEntity;
import net.mcreator.yafnafmod.entity.FredbearDayEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateDayEntity;
import net.mcreator.yafnafmod.entity.BonnieBunnyEntity;
import net.mcreator.yafnafmod.entity.BonnieBunnyDayEntity;

public class BephSkinCodeTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BonnieBunnyEntity animatable)
			animatable.setTexture((entity.getPersistentData().getString("skin")));
		if (entity instanceof BonnieBunnyDayEntity animatable)
			animatable.setTexture((entity.getPersistentData().getString("skin")));
		if (entity instanceof FoxyPirateEntity animatable)
			animatable.setTexture((entity.getPersistentData().getString("skin")));
		if (entity instanceof FoxyPirateDayEntity animatable)
			animatable.setTexture((entity.getPersistentData().getString("skin")));
		if (entity instanceof FredbearDayEntity animatable)
			animatable.setTexture((entity.getPersistentData().getString("skin")));
		if (entity instanceof SpringbonnieDayEntity animatable)
			animatable.setTexture((entity.getPersistentData().getString("skin")));
	}
}
