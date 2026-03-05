package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.PitbonnieEntity;
import net.mcreator.yafnafmod.entity.PitbonnieDayEntity;
import net.mcreator.yafnafmod.entity.MemoryFreddyEntity;
import net.mcreator.yafnafmod.entity.MemoryFreddyDayEntity;
import net.mcreator.yafnafmod.entity.MemoryChicaEntity;
import net.mcreator.yafnafmod.entity.MemoryChicaDayEntity;
import net.mcreator.yafnafmod.entity.MemoryBonnieEntity;
import net.mcreator.yafnafmod.entity.MemoryBonnieDayEntity;

public class FnafItpSkinsProcedure {
	public static void execute(Entity entiti, double skin, String suffixa) {
		if (entiti == null || suffixa == null)
			return;
		String suffix = "";
		suffix = suffixa;
		if (skin == 0) {
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
		} else if (skin == 1) {
			if (entiti instanceof PitbonnieEntity animatable)
				animatable.setTexture(("pitbonnie_novel" + suffix));
			if (entiti instanceof PitbonnieDayEntity animatable)
				animatable.setTexture(("pitbonnie_novel" + suffix));
		}
	}
}
