package net.mcreator.yafnafmod.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.yafnafmod.init.YaFnafmodModMobEffects;

public class LightFunctionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String RX = "";
		String RY = "";
		String RZ = "";
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) >= 6) {
			if ((entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(YaFnafmodModMobEffects.QUANTUM_LOCK.get())) == true) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().stop();
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "data merge entity @s {NoAI:1}");
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "data merge entity @s {NoAI:0}");
					}
				}
				RX = LookyLooProcedure.execute(world, x, y, z).substring((int) LookyLooProcedure.execute(world, x, y, z).indexOf("X") + "X".length(), (int) LookyLooProcedure.execute(world, x, y, z).lastIndexOf("X"));
				RY = LookyLooProcedure.execute(world, x, y, z).substring((int) LookyLooProcedure.execute(world, x, y, z).indexOf("Y") + "Y".length(), (int) LookyLooProcedure.execute(world, x, y, z).lastIndexOf("Y"));
				RZ = LookyLooProcedure.execute(world, x, y, z).substring((int) LookyLooProcedure.execute(world, x, y, z).indexOf("Z") + "Z".length(), (int) LookyLooProcedure.execute(world, x, y, z).lastIndexOf("Z"));
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo(new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(RX), new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(RY), new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(RZ), 1);
				if (Math.floor(Math.abs(new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(RX))) - Math.abs(x) < 1 && Math.floor(Math.abs(new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(RY))) - Math.abs(y) < 1 && Math.floor(Math.abs(new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(RZ))) - Math.abs(z) < 1) {
					LeverChangeProcedure.execute(world, x, y, z);
				}
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "data merge entity @s {NoAI:0}");
				}
			}
		}
	}
}
