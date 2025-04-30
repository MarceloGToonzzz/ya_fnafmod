package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.yafnafmod.init.YaFnafmodModGameRules;
import net.mcreator.yafnafmod.entity.Minireena2Entity;
import net.mcreator.yafnafmod.entity.LolbitEntity;
import net.mcreator.yafnafmod.entity.JJEntity;

import java.util.List;
import java.util.Comparator;

public class BlastSecurityDoorOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		BlockState generator = Blocks.AIR.defaultBlockState();
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "has_power")) == true) {
			generator = (world.getBlockState(BlockPos.containing(new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "power_x"), new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "power_y"), new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "power_z"))));
			if ((generator.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip5 ? generator.getValue(_getip5) : -1) == 5
					|| !world.getEntitiesOfClass(JJEntity.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).isEmpty() || !world.getEntitiesOfClass(Minireena2Entity.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(LolbitEntity.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).isEmpty()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip10 ? blockstate.getValue(_getip10) : -1) == 0) {
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:securitydoor_close")), SoundSource.BLOCKS, 1, 1);
					if ((new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"fill ~ ~-1 ~ ~ ~1 ~-1 air replace ya_fnafmod:thin_hitbox");
					} else if ((new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"fill ~ ~-1 ~ ~ ~1 ~1 air replace ya_fnafmod:thin_hitbox");
					} else if ((new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"fill ~ ~-1 ~ ~-1 ~1 ~ air replace ya_fnafmod:thin_hitbox");
					} else if ((new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"fill ~ ~-1 ~ ~1 ~1 ~ air replace ya_fnafmod:thin_hitbox");
					}
				}
			}
		} else {
			if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip30 ? blockstate.getValue(_getip30) : -1) == 0) {
				{
					int _value = 1;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:securitydoor_close")), SoundSource.BLOCKS, 1, 1);
				if ((new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection(blockstate)) == Direction.EAST) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill ~ ~-1 ~ ~ ~1 ~-1 air replace ya_fnafmod:thin_hitbox");
				} else if ((new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection(blockstate)) == Direction.WEST) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill ~ ~-1 ~ ~ ~1 ~1 air replace ya_fnafmod:thin_hitbox");
				} else if ((new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection(blockstate)) == Direction.NORTH) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill ~ ~-1 ~ ~-1 ~1 ~ air replace ya_fnafmod:thin_hitbox");
				} else if ((new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection(blockstate)) == Direction.SOUTH) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill ~ ~-1 ~ ~1 ~1 ~ air replace ya_fnafmod:thin_hitbox");
				}
			}
		}
		if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip50 ? blockstate.getValue(_getip50) : -1) == 0) {
			if ((world.getLevelData().getGameRules().getBoolean(YaFnafmodModGameRules.GENERATOR_NIGHT) == false || IsItNighttimeProcedure.execute(world) == true) && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "generator_type") == 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "power_x"), new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "power_y"), new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "power_z"));
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("energy", ((new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "power_x"), new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "power_y"), new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "power_z")), "energy")) - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
						if (new Object() {
							BlockPos getBlockBetweenEntities(Entity ent1, Entity ent2) {
								BlockPos pos = BlockPos.ZERO;
								if (ent1 instanceof LivingEntity _liveEnt && ent2 != null && !_liveEnt.hasLineOfSight(ent2)) {
									Vec3 v1 = new Vec3(ent1.getX(), ent1.getEyeY(), ent1.getZ());
									Vec3 v2 = new Vec3(ent2.getX(), ent2.getEyeY(), ent2.getZ());
									BlockHitResult hitres = ent1.level().clip(new ClipContext(v1, v2, ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, ent1));
									pos = hitres.getBlockPos();
								}
								return pos;
							}
						}.getBlockBetweenEntities((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null), entityiterator).getX() == x && new Object() {
							BlockPos getBlockBetweenEntities(Entity ent1, Entity ent2) {
								BlockPos pos = BlockPos.ZERO;
								if (ent1 instanceof LivingEntity _liveEnt && ent2 != null && !_liveEnt.hasLineOfSight(ent2)) {
									Vec3 v1 = new Vec3(ent1.getX(), ent1.getEyeY(), ent1.getZ());
									Vec3 v2 = new Vec3(ent2.getX(), ent2.getEyeY(), ent2.getZ());
									BlockHitResult hitres = ent1.level().clip(new ClipContext(v1, v2, ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, ent1));
									pos = hitres.getBlockPos();
								}
								return pos;
							}
						}.getBlockBetweenEntities((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null), entityiterator).getY() == y && new Object() {
							BlockPos getBlockBetweenEntities(Entity ent1, Entity ent2) {
								BlockPos pos = BlockPos.ZERO;
								if (ent1 instanceof LivingEntity _liveEnt && ent2 != null && !_liveEnt.hasLineOfSight(ent2)) {
									Vec3 v1 = new Vec3(ent1.getX(), ent1.getEyeY(), ent1.getZ());
									Vec3 v2 = new Vec3(ent2.getX(), ent2.getEyeY(), ent2.getZ());
									BlockHitResult hitres = ent1.level().clip(new ClipContext(v1, v2, ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, ent1));
									pos = hitres.getBlockPos();
								}
								return pos;
							}
						}.getBlockBetweenEntities((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null), entityiterator).getZ() == z) {
						}
					}
				}
			}
		}
	}
}
