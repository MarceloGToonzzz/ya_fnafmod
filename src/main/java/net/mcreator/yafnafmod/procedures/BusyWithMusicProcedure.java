package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.PuppetEntity;

public class BusyWithMusicProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean result = false;
		if ((entity instanceof PuppetEntity _datEntL0 && _datEntL0.getEntityData().get(PuppetEntity.DATA_busy)) == true) {
			result = false;
		} else {
			result = true;
		}
		return result;
	}
}
