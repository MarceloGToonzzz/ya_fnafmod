package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.CarStationWagonEntity;
import net.mcreator.yafnafmod.entity.CarPurpleChevroletImpalaEntity;
import net.mcreator.yafnafmod.entity.CarPoliceCruiserChevroletImpala1983Entity;
import net.mcreator.yafnafmod.entity.CarHarleyMotorcycleEntity;
import net.mcreator.yafnafmod.entity.CarFazvanEntity;
import net.mcreator.yafnafmod.entity.CarDodgeRam1982Entity;
import net.mcreator.yafnafmod.entity.CarDesotoEntity;

public class CarOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean result = false;
		result = false;
		if (entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof CarPurpleChevroletImpalaEntity || (entity.getVehicle()) instanceof CarDodgeRam1982Entity || (entity.getVehicle()) instanceof CarFazvanEntity || (entity.getVehicle()) instanceof CarStationWagonEntity
					|| (entity.getVehicle()) instanceof CarHarleyMotorcycleEntity || (entity.getVehicle()) instanceof CarPoliceCruiserChevroletImpala1983Entity || (entity.getVehicle()) instanceof CarDesotoEntity) {
				result = true;
			}
		}
		return result;
	}
}
