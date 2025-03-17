package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.yafnafmod.entity.CarStationWagonEntity;
import net.mcreator.yafnafmod.entity.CarSeatEntity;
import net.mcreator.yafnafmod.entity.CarPurpleChevroletImpalaEntity;
import net.mcreator.yafnafmod.entity.CarHarleyMotorcycleEntity;
import net.mcreator.yafnafmod.entity.CarFazvanEntity;
import net.mcreator.yafnafmod.entity.CarDodgeRam1982Entity;

import java.util.List;
import java.util.Comparator;

public class CarOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity player = null;
		boolean got_runover = false;
		double multiplier = 0;
		double yvel = 0;
		double acceleration = 0;
		multiplier = 1.25;
		if (!((world.getBlockState(BlockPos.containing(x + entity.getLookAngle().x, y, z + entity.getLookAngle().z))).getBlock() == Blocks.AIR)) {
			{
				Entity _ent = entity;
				_ent.setYRot(entity.getYRot());
				_ent.setXRot((float) (entity.getDeltaMovement().y() * (-40)));
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
		}
		if (entity instanceof CarPurpleChevroletImpalaEntity) {
			entity.getPersistentData().putDouble("max_speed", 16);
			acceleration = 0.002962962965;
		} else if (entity instanceof CarDodgeRam1982Entity) {
			entity.getPersistentData().putDouble("max_speed", 10);
			acceleration = 0.002962962965;
		} else if (entity instanceof CarFazvanEntity) {
			entity.getPersistentData().putDouble("max_speed", 12);
			acceleration = 0.001975308643;
		} else if (entity instanceof CarStationWagonEntity) {
			entity.getPersistentData().putDouble("max_speed", 14);
			acceleration = 0.003703703706;
		} else if (entity instanceof CarHarleyMotorcycleEntity) {
			entity.getPersistentData().putDouble("max_speed", 24);
			acceleration = 0.004938271607;
		}
		if (entity.isVehicle()) {
			player = entity.getFirstPassenger();
			if (player.getPersistentData().getDouble("WPress") == 1) {
				if (BlockFrontHigherProcedure.execute(world, x, y, z, entity, 1) == false) {
					entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * entity.getPersistentData().getDouble("throttle") * multiplier), (entity.getDeltaMovement().y()),
							(entity.getLookAngle().z * entity.getPersistentData().getDouble("throttle") * multiplier)));
				} else {
					if (BlockFrontHigherProcedure.execute(world, x, y, z, entity, 1) == true) {
						if ((world.getBlockState(BlockPos.containing(x + entity.getLookAngle().x, y + 1, z + entity.getLookAngle().z))).getBlock() == Blocks.AIR) {
							entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * entity.getPersistentData().getDouble("throttle") * multiplier), 0.3, (entity.getLookAngle().z * entity.getPersistentData().getDouble("throttle") * multiplier)));
						}
					}
				}
				if (entity.getPersistentData().getDouble("throttle") < entity.getPersistentData().getDouble("max_speed") / 15) {
					if (player.getPersistentData().getDouble("YAFNAF_CtrlAccelerate") == 1 || entity.getPersistentData().getDouble("throttle") < (entity.getPersistentData().getDouble("max_speed") / 15) / 3) {
						entity.getPersistentData().putDouble("throttle", (entity.getPersistentData().getDouble("throttle") + acceleration));
					}
				}
			} else if (player.getPersistentData().getDouble("SPress") == 1) {
				if (BlockFrontHigherProcedure.execute(world, x, y, z, entity, -1) == false) {
					entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * entity.getPersistentData().getDouble("back_throttle") * multiplier * (-1)), (entity.getDeltaMovement().y()),
							(entity.getLookAngle().z * entity.getPersistentData().getDouble("back_throttle") * multiplier * (-1))));
				} else {
					if ((world.getBlockState(BlockPos.containing(x - entity.getLookAngle().x, y + 1, z - entity.getLookAngle().z))).getBlock() == Blocks.AIR) {
						entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * entity.getPersistentData().getDouble("back_throttle") * multiplier * (-1)), 0.3,
								(entity.getLookAngle().z * entity.getPersistentData().getDouble("back_throttle") * multiplier * (-1))));
					}
				}
				if (entity.getPersistentData().getDouble("back_throttle") < (entity.getPersistentData().getDouble("max_speed") / 20) / 3) {
					if (player.getPersistentData().getDouble("YAFNAF_CtrlAccelerate") == 1 || entity.getPersistentData().getDouble("back_throttle") < ((entity.getPersistentData().getDouble("max_speed") / 20) / 3) / 3) {
						entity.getPersistentData().putDouble("back_throttle", (entity.getPersistentData().getDouble("back_throttle") + acceleration));
					}
				}
			}
			if (player.getPersistentData().getDouble("WPress") == 0) {
				if (entity.getPersistentData().getDouble("throttle") > 0.5) {
					entity.getPersistentData().putDouble("throttle", 0.55);
				} else if (entity.getPersistentData().getDouble("throttle") > 0.4) {
					entity.getPersistentData().putDouble("throttle", 0.45);
				} else if (entity.getPersistentData().getDouble("throttle") > 0.3) {
					entity.getPersistentData().putDouble("throttle", 0.35);
				} else if (entity.getPersistentData().getDouble("throttle") > 0.2) {
					entity.getPersistentData().putDouble("throttle", 0.25);
				} else if (entity.getPersistentData().getDouble("throttle") > 0.1) {
					entity.getPersistentData().putDouble("throttle", 0.15);
				} else if (entity.getPersistentData().getDouble("throttle") > 0.05) {
					entity.getPersistentData().putDouble("throttle", 0);
				}
			} else if (player.getPersistentData().getDouble("SPress") == 0) {
				entity.getPersistentData().putDouble("back_throttle", 0);
			}
			if (!((world.getBlockState(BlockPos.containing(x, Math.round(Math.pow(10, 0) * y) / Math.pow(10, 0) - 1, z))).getBlock() == Blocks.AIR)) {
				if (entity.getPersistentData().getDouble("throttle") != 0 && ((entity.getFirstPassenger()).getPersistentData().getDouble("WPress") == 1 || (entity.getFirstPassenger()).getPersistentData().getDouble("SPress") == 1)
						&& (entity.getFirstPassenger()).getPersistentData().getDouble("APress") == 1) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "execute as @s run execute at @s run tp @s ^ ^ ^ facing ^1 ^ ^16");
						}
					}
					if (entity instanceof CarHarleyMotorcycleEntity) {
						((CarHarleyMotorcycleEntity) entity).setAnimation("animation.model.turnleft");
					}
				}
				if (entity.getPersistentData().getDouble("throttle") != 0 && ((entity.getFirstPassenger()).getPersistentData().getDouble("WPress") == 1 || (entity.getFirstPassenger()).getPersistentData().getDouble("SPress") == 1)
						&& (entity.getFirstPassenger()).getPersistentData().getDouble("DPress") == 1) {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "execute as @s run execute at @s run tp @s ^ ^ ^ facing ^-1 ^ ^16");
						}
					}
					if (entity instanceof CarHarleyMotorcycleEntity) {
						((CarHarleyMotorcycleEntity) entity).setAnimation("animation.model.turnright");
					}
				}
				if (!((entity.getFirstPassenger()).getPersistentData().getDouble("DPress") == 1) && !((entity.getFirstPassenger()).getPersistentData().getDouble("APress") == 1)) {
					if (entity instanceof CarHarleyMotorcycleEntity) {
						((CarHarleyMotorcycleEntity) entity).setAnimation("empty");
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == (entity.getFirstPassenger()))) {
						got_runover = false;
						if (entity.getPersistentData().getDouble("back_throttle") != 0) {
							if (entity.getDeltaMovement().x() < 0) {
								if (entityiterator.getX() < entity.getX()) {
									got_runover = true;
								}
							} else {
								if (entityiterator.getX() > entity.getX()) {
									got_runover = true;
								}
							}
							if (entity.getDeltaMovement().z() < 0) {
								if (entityiterator.getZ() < entity.getZ()) {
									got_runover = true;
								}
							} else {
								if (entityiterator.getZ() > entity.getZ()) {
									got_runover = true;
								}
							}
						} else {
							if (entity.getDeltaMovement().x() > 0) {
								if (entityiterator.getX() > entity.getX()) {
									got_runover = true;
								}
							} else {
								if (entityiterator.getX() < entity.getX()) {
									got_runover = true;
								}
							}
							if (entity.getDeltaMovement().z() > 0) {
								if (entityiterator.getZ() > entity.getZ()) {
									got_runover = true;
								}
							} else {
								if (entityiterator.getZ() < entity.getZ()) {
									got_runover = true;
								}
							}
						}
						if (got_runover == true) {
							if (entity.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6D) {
								if (!(entityiterator instanceof CarSeatEntity) && !(entityiterator.isPassenger() && (entityiterator.getVehicle()) instanceof CarSeatEntity)) {
									if (entity.getPersistentData().getDouble("back_throttle") != 0) {
										entityiterator.setDeltaMovement(new Vec3(((entity.getLookAngle().x + entity.getPersistentData().getDouble("back_throttle") * 2) * (-1.5)), 1,
												((entity.getLookAngle().z + entity.getPersistentData().getDouble("back_throttle") * 2) * (-1.5))));
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), (float) (2 + entity.getPersistentData().getDouble("back_throttle")));
									} else {
										entityiterator.setDeltaMovement(
												new Vec3(((entity.getLookAngle().x + entity.getPersistentData().getDouble("throttle") * 2) * 1.5), 1, ((entity.getLookAngle().z + entity.getPersistentData().getDouble("throttle") * 2) * 1.5)));
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), (float) (2 + entity.getPersistentData().getDouble("throttle")));
									}
								}
							}
						}
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("throttle", 0);
			entity.getPersistentData().putDouble("back_throttle", 0);
		}
	}
}
