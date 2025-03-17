package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.SpringbonnieDayEntity;
import net.mcreator.yafnafmod.entity.RockstarFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RockstarFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RockstarChicaDayEntity;
import net.mcreator.yafnafmod.entity.RockstarBonnieDayEntity;
import net.mcreator.yafnafmod.entity.RetroFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RetroFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RetroChicaDayEntity;
import net.mcreator.yafnafmod.entity.RetroBonnieDayEntity;
import net.mcreator.yafnafmod.entity.PigpatchDayEntity;
import net.mcreator.yafnafmod.entity.PanStanDayEntity;
import net.mcreator.yafnafmod.entity.OrvilleElephantDayEntity;
import net.mcreator.yafnafmod.entity.NumberOneCrateDayEntity;
import net.mcreator.yafnafmod.entity.NeddBearDayEntity;
import net.mcreator.yafnafmod.entity.MrHugsDayEntity;
import net.mcreator.yafnafmod.entity.MrHippoDayEntity;
import net.mcreator.yafnafmod.entity.MrCanDoDayEntity;
import net.mcreator.yafnafmod.entity.HappyFrogDayEntity;
import net.mcreator.yafnafmod.entity.FredbearDayEntity;
import net.mcreator.yafnafmod.entity.BucketBobDayEntity;

public class DoesAnimatronicWalkAtNightProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		double yaw = 0;
		boolean result = false;
		if (!(entity instanceof FredbearDayEntity) && !(entity instanceof SpringbonnieDayEntity) && !(entity instanceof RetroFreddyDayEntity) && !(entity instanceof RetroBonnieDayEntity) && !(entity instanceof RetroChicaDayEntity)
				&& !(entity instanceof RetroFoxyDayEntity) && !(entity instanceof BucketBobDayEntity) && !(entity instanceof MrCanDoDayEntity) && !(entity instanceof MrHugsDayEntity) && !(entity instanceof NumberOneCrateDayEntity)
				&& !(entity instanceof PanStanDayEntity) && !(entity instanceof NeddBearDayEntity) && !(entity instanceof HappyFrogDayEntity) && !(entity instanceof PigpatchDayEntity) && !(entity instanceof MrHippoDayEntity)
				&& !(entity instanceof OrvilleElephantDayEntity) && !(entity instanceof RockstarFreddyDayEntity) && !(entity instanceof RockstarBonnieDayEntity) && !(entity instanceof RockstarChicaDayEntity)
				&& !(entity instanceof RockstarFoxyDayEntity) || (entity instanceof FredbearDayEntity _datEntL20 && _datEntL20.getEntityData().get(FredbearDayEntity.DATA_walker)) == true
				|| (entity instanceof SpringbonnieDayEntity _datEntL21 && _datEntL21.getEntityData().get(SpringbonnieDayEntity.DATA_walker)) == true
				|| (entity instanceof RetroFreddyDayEntity _datEntL22 && _datEntL22.getEntityData().get(RetroFreddyDayEntity.DATA_walker)) == true
				|| (entity instanceof RetroBonnieDayEntity _datEntL23 && _datEntL23.getEntityData().get(RetroBonnieDayEntity.DATA_walker)) == true
				|| (entity instanceof RetroChicaDayEntity _datEntL24 && _datEntL24.getEntityData().get(RetroChicaDayEntity.DATA_walker)) == true
				|| (entity instanceof RetroFoxyDayEntity _datEntL25 && _datEntL25.getEntityData().get(RetroFoxyDayEntity.DATA_walker)) == true
				|| (entity instanceof BucketBobDayEntity _datEntL26 && _datEntL26.getEntityData().get(BucketBobDayEntity.DATA_walker)) == true
				|| (entity instanceof PanStanDayEntity _datEntL27 && _datEntL27.getEntityData().get(PanStanDayEntity.DATA_walker)) == true
				|| (entity instanceof MrCanDoDayEntity _datEntL28 && _datEntL28.getEntityData().get(MrCanDoDayEntity.DATA_walker)) == true
				|| (entity instanceof MrHugsDayEntity _datEntL29 && _datEntL29.getEntityData().get(MrHugsDayEntity.DATA_walker)) == true
				|| (entity instanceof NumberOneCrateDayEntity _datEntL30 && _datEntL30.getEntityData().get(NumberOneCrateDayEntity.DATA_walker)) == true
				|| (entity instanceof NeddBearDayEntity _datEntL31 && _datEntL31.getEntityData().get(NeddBearDayEntity.DATA_walker)) == true
				|| (entity instanceof MrHippoDayEntity _datEntL32 && _datEntL32.getEntityData().get(MrHippoDayEntity.DATA_walker)) == true
				|| (entity instanceof PigpatchDayEntity _datEntL33 && _datEntL33.getEntityData().get(PigpatchDayEntity.DATA_walker)) == true
				|| (entity instanceof HappyFrogDayEntity _datEntL34 && _datEntL34.getEntityData().get(HappyFrogDayEntity.DATA_walker)) == true
				|| (entity instanceof OrvilleElephantDayEntity _datEntL35 && _datEntL35.getEntityData().get(OrvilleElephantDayEntity.DATA_walker)) == true
				|| (entity instanceof RockstarFreddyDayEntity _datEntL36 && _datEntL36.getEntityData().get(RockstarFreddyDayEntity.DATA_walker)) == true
				|| (entity instanceof RockstarBonnieDayEntity _datEntL37 && _datEntL37.getEntityData().get(RockstarBonnieDayEntity.DATA_walker)) == true
				|| (entity instanceof RockstarChicaDayEntity _datEntL38 && _datEntL38.getEntityData().get(RockstarChicaDayEntity.DATA_walker)) == true
				|| (entity instanceof RockstarFoxyDayEntity _datEntL39 && _datEntL39.getEntityData().get(RockstarFoxyDayEntity.DATA_walker)) == true) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
