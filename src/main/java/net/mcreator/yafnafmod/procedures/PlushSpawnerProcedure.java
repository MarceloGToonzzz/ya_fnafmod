package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.network.YaFnafmodModVariables;
import net.mcreator.yafnafmod.init.YaFnafmodModEntities;
import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

public class PlushSpawnerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double chance1 = 0;
		double chance2 = 0;
		if (IsItNighttimeProcedure.execute(world) == true) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("has_spawned") instanceof BooleanProperty _getbp1 && blockstate.getValue(_getbp1)) == false) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.PLUSH_FREDDY_RETRO_SPAWNER.get()) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = YaFnafmodModEntities.NIGHTMARE_FREDDY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.PLUSH_BONNIE_RETRO_SPAWNER.get()) {
					if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == false) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = YaFnafmodModEntities.NIGHTMARE_BONNIE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = YaFnafmodModEntities.JACK_O_BONNIE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.PLUSH_CHICA_RETRO_SPAWNER.get()) {
					if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == false) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = YaFnafmodModEntities.NIGHTMARE_CHICA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = YaFnafmodModEntities.NIGHTMARE_CUPCAKE_ENTITY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = YaFnafmodModEntities.JACK_O_CHICA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = YaFnafmodModEntities.NIGHTMARE_PUMPKIN_ENTITY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.PLUSH_FOXY_RETRO_SPAWNER.get()) {
					if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == false) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = YaFnafmodModEntities.NIGHTMARE_FOXY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = YaFnafmodModEntities.NIGHTMARE_MANGLE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.PLUSH_FREDBEAR_SPAWNER.get()) {
					chance1 = Mth.nextInt(RandomSource.create(), 1, 2);
					if (chance1 == 1) {
						chance2 = Mth.nextInt(RandomSource.create(), 1, 3);
						if (chance2 == 1) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = YaFnafmodModEntities.NIGHTMARE_FREDBEAR.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
								}
							}
						} else if (chance2 == 2) {
							if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == false) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = YaFnafmodModEntities.NIGHTMARE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = YaFnafmodModEntities.NIGHTMARIONNE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							}
						} else if (chance2 == 3) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = YaFnafmodModEntities.NIGHTMARE_FREDBEAR.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
								}
							}
							if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == false) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = YaFnafmodModEntities.NIGHTMARE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = YaFnafmodModEntities.NIGHTMARIONNE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							}
						}
					}
				}
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("has_spawned") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
			}
		} else {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("has_spawned") instanceof BooleanProperty _booleanProp)
					world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
			}
		}
	}
}
