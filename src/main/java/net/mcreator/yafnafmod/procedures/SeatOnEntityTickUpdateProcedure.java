package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.yafnafmod.entity.SeatEntity;
import net.mcreator.yafnafmod.entity.CarStationWagonEntity;
import net.mcreator.yafnafmod.entity.CarSeatEntity;
import net.mcreator.yafnafmod.entity.CarFazvanEntity;
import net.mcreator.yafnafmod.entity.CarDodgeRam1982Entity;
import net.mcreator.yafnafmod.entity.CarDesotoEntity;

import java.util.function.BiFunction;
import java.util.UUID;

public class SeatOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String pos = "";
		String thing = "";
		double yaw = 0;
		Entity car = null;
		if (entity instanceof SeatEntity) {
			if (!entity.isVehicle()) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		} else if (entity instanceof CarSeatEntity) {
			if (((new BiFunction<LevelAccessor, String, Entity>() {
				@Override
				public Entity apply(LevelAccessor levelAccessor, String uuid) {
					if (levelAccessor instanceof ServerLevel serverLevel) {
						try {
							return serverLevel.getEntity(UUID.fromString(uuid));
						} catch (Exception e) {
						}
					}
					return null;
				}
			}).apply(world, (entity.getPersistentData().getString("og_car")))) instanceof LivingEntity) {
				car = (new BiFunction<LevelAccessor, String, Entity>() {
					@Override
					public Entity apply(LevelAccessor levelAccessor, String uuid) {
						if (levelAccessor instanceof ServerLevel serverLevel) {
							try {
								return serverLevel.getEntity(UUID.fromString(uuid));
							} catch (Exception e) {
							}
						}
						return null;
					}
				}).apply(world, (entity.getPersistentData().getString("og_car")));
				if (!(car instanceof CarFazvanEntity)) {
					if (car instanceof CarStationWagonEntity || car instanceof CarDesotoEntity) {
						if (entity.getPersistentData().getDouble("car_seat") == 1) {
							pos = "^-1 ^-0.25 ^";
						} else if (entity.getPersistentData().getDouble("car_seat") == 2) {
							pos = "^-1 ^-0.25 ^-1.125";
						} else if (entity.getPersistentData().getDouble("car_seat") == 3) {
							pos = "^ ^-0.25 ^-1.125";
						} else if (entity.getPersistentData().getDouble("car_seat") == 4) {
							pos = "^-0.5 ^-0.25 ^-3";
						}
					} else {
						if (entity.getPersistentData().getDouble("car_seat") == 1) {
							if (car instanceof CarDodgeRam1982Entity) {
								pos = "^-1.0 ^0.25 ^";
							} else {
								pos = "^-1.0 ^ ^";
							}
						}
					}
				} else {
					if (entity.getPersistentData().getDouble("car_seat") == 1) {
						pos = "^-1.46875 ^ ^";
					} else if (entity.getPersistentData().getDouble("car_seat") == 2) {
						pos = "^-1.6875 ^ ^-1.6875";
					} else if (entity.getPersistentData().getDouble("car_seat") == 3) {
						pos = "^-1.6875 ^ ^-2.6875";
					} else if (entity.getPersistentData().getDouble("car_seat") == 4) {
						pos = "^-1.6875 ^ ^-3.6875";
					} else if (entity.getPersistentData().getDouble("car_seat") == 5) {
						pos = "^0.1775 ^ ^-1.6875";
					} else if (entity.getPersistentData().getDouble("car_seat") == 6) {
						pos = "^0.1775 ^ ^-2.6875";
					} else if (entity.getPersistentData().getDouble("car_seat") == 7) {
						pos = "^0.1775 ^ ^-3.6875";
					}
				}
				{
					Entity _ent = car;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), (("tp " + entity.getStringUUID()) + "" + (" " + pos)));
					}
				}
			} else {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
