package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.CarStationWagonEntity;
import net.mcreator.yafnafmod.entity.CarPurpleChevroletImpalaEntity;
import net.mcreator.yafnafmod.entity.CarHarleyMotorcycleEntity;
import net.mcreator.yafnafmod.entity.CarFazvanEntity;
import net.mcreator.yafnafmod.entity.CarDodgeRam1982Entity;

public class CarOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean result = false;
		result = false;
		if (entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof CarPurpleChevroletImpalaEntity || (entity.getVehicle()) instanceof CarDodgeRam1982Entity || (entity.getVehicle()) instanceof CarFazvanEntity || (entity.getVehicle()) instanceof CarStationWagonEntity
					|| (entity.getVehicle()) instanceof CarHarleyMotorcycleEntity) {
				result = true;
			}
		}
		return result;
	}
}
