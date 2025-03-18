package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.CarStationWagonEntity;
import net.mcreator.yafnafmod.entity.CarPurpleChevroletImpalaEntity;
import net.mcreator.yafnafmod.entity.CarPoliceCruiserChevroletImpala1983Entity;
import net.mcreator.yafnafmod.entity.CarHarleyMotorcycleEntity;
import net.mcreator.yafnafmod.entity.CarFazvanEntity;
import net.mcreator.yafnafmod.entity.CarDodgeRam1982Entity;

public class CarSpeedTextProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String result = "";
		if (entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof CarPurpleChevroletImpalaEntity || (entity.getVehicle()) instanceof CarDodgeRam1982Entity || (entity.getVehicle()) instanceof CarFazvanEntity || (entity.getVehicle()) instanceof CarStationWagonEntity
					|| (entity.getVehicle()) instanceof CarHarleyMotorcycleEntity || (entity.getVehicle()) instanceof CarPoliceCruiserChevroletImpala1983Entity) {
				result = "SPEED : " + Math.round(Math.pow(10, 0) * ((entity.getVehicle()).getPersistentData().getDouble("throttle") * 15 * 3600 * 0.000621371)) / Math.pow(10, 0) + " MILES PER HOUR";
			}
		}
		return result;
	}
}
