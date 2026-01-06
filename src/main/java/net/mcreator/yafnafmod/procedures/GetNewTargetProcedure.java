package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;
import net.mcreator.yafnafmod.entity.PuppetEntity;

import java.util.UUID;
import java.util.List;
import java.util.Comparator;

public class GetNewTargetProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rangetest = 0;
		boolean stop = false;
		boolean getLogs = false;
		rangetest = 0.75;
		getLogs = false;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			entity.getPersistentData().putString("target", ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getStringUUID()));
		}
		if (!(!(new Object() {
			Entity entityFromStringUUID(String uuid, Level world) {
				Entity _uuidentity = null;
				if (world instanceof ServerLevel _server) {
					try {
						_uuidentity = _server.getEntity(UUID.fromString(uuid));
					} catch (Exception e) {
					}
				}
				return _uuidentity;
			}
		}.entityFromStringUUID((entity.getPersistentData().getString("target")), (Level) world) == null))) {
			if (entity instanceof Mob) {
				try {
					((Mob) entity).setTarget(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			entity.getPersistentData().putBoolean("hasTarget", false);
		}
		if (entity.getPersistentData().getBoolean("hasTarget") == true) {
			if (getLogs == true) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("has target nbt"), false);
			}
		} else {
			if (entity instanceof Mob) {
				try {
					((Mob) entity).setTarget(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		if (entity.getPersistentData().getBoolean("hasTarget") == false && !entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:passive_animatronics")))) {
			if (getLogs == true) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("doesnt have target"), false);
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entity.getPersistentData().getBoolean("hasTarget") == false && !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
						stop = false;
						if (entityiterator instanceof Player || entityiterator instanceof Villager) {
							if (!IsEntityBeingLookedAtProcedure.execute(world, entityiterator, entity, entityiterator.getEyeHeight(), rangetest)) {
								if (!(entity instanceof PuppetEntity)) {
									if (!(entityiterator.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6D)) {
										stop = true;
										if (getLogs == true) {
											if (!world.isClientSide() && world.getServer() != null)
												world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("potential target is still behind me"), false);
										}
									} else if (entityiterator.isShiftKeyDown() || entityiterator.isSwimming()) {
										stop = true;
										if (getLogs == true) {
											if (!world.isClientSide() && world.getServer() != null)
												world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("potential target is sneaking or crawling behind me"), false);
										}
									}
								}
							}
							if (entity instanceof PuppetEntity) {
								if ((entity instanceof PuppetEntity _datEntL30 && _datEntL30.getEntityData().get(PuppetEntity.DATA_busy)) == true) {
									stop = true;
								}
							}
							if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:mask_foolers"))) && IsTargetWearingMaskProcedure.execute(entityiterator)
									|| (world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()))).getBlock() == YaFnafmodModBlocks.LOCKER_YELLOW_HIDING.get()
											&& ((world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()))).getBlock().getStateDefinition().getProperty(
													"blockstate") instanceof IntegerProperty _getip41 ? (world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()))).getValue(_getip41) : -1) == 0
									|| (world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY() - 1, entityiterator.getZ()))).getBlock() == YaFnafmodModBlocks.LOCKER_YELLOW_HIDING.get()
											&& ((world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY() - 1, entityiterator.getZ()))).getBlock().getStateDefinition()
													.getProperty("blockstate") instanceof IntegerProperty _getip51
															? (world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY() - 1, entityiterator.getZ()))).getValue(_getip51)
															: -1) == 0) {
								stop = true;
								if (getLogs == true) {
									if (!world.isClientSide() && world.getServer() != null)
										world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("potential target is hiding"), false);
								}
							}
							if (IsEntityWearingHidingSuitProcedure.execute(entityiterator) == true && !entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:springlock_exceptions")))) {
								stop = true;
								if (getLogs == true) {
									if (!world.isClientSide() && world.getServer() != null)
										world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("potential target is hiding"), false);
								}
							}
							if (!(entity instanceof LivingEntity _entity ? _entity.hasLineOfSight(entityiterator) : false)) {
								if (!(entity instanceof PuppetEntity)) {
									stop = true;
									if (getLogs == true) {
										if (!world.isClientSide() && world.getServer() != null)
											world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("cant see target"), false);
									}
								}
							}
							if (stop == false) {
								if (!(new Object() {
									public boolean checkGamemode(Entity _ent) {
										if (_ent instanceof ServerPlayer _serverPlayer) {
											return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
										} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
											return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
													&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
										}
										return false;
									}
								}.checkGamemode(entityiterator)) && !(new Object() {
									public boolean checkGamemode(Entity _ent) {
										if (_ent instanceof ServerPlayer _serverPlayer) {
											return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
										} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
											return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
													&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
										}
										return false;
									}
								}.checkGamemode(entityiterator))) {
									if (entityiterator instanceof LivingEntity) {
										entity.getPersistentData().putBoolean("hasTarget", true);
										if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
											_entity.setTarget(_ent);
										if (getLogs == true) {
											if (!world.isClientSide() && world.getServer() != null)
												world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("got target"), false);
										}
									}
								}
							}
						}
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("hasTarget") == true) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				if (new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) || new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
						}
						return false;
					}
				}.checkGamemode((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null))
						|| !(entity instanceof LivingEntity _entity ? _entity.hasLineOfSight((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) : false) && !(entity instanceof PuppetEntity)
						|| ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null ? entity.distanceTo((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) : -1) > 24
						|| !(entity instanceof LivingEntity _liveEnt && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null
								? _liveEnt.hasLineOfSight((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null))
								: false)
						|| IsEntityWearingHidingSuitProcedure.execute(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == true
						|| (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:mask_foolers"))) && IsTargetWearingMaskProcedure.execute(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)
								|| (world.getBlockState(BlockPos.containing((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(),
										(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()))).getBlock() == YaFnafmodModBlocks.LOCKER_YELLOW_HIDING.get()
										&& ((world.getBlockState(BlockPos.containing((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(),
												(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip97
														? (world.getBlockState(BlockPos.containing((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(),
																(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(), (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()))).getValue(_getip97)
														: -1) == 0
								|| (world.getBlockState(BlockPos.containing((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - 1,
										(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()))).getBlock() == YaFnafmodModBlocks.LOCKER_YELLOW_HIDING.get()
										&& ((world.getBlockState(BlockPos.containing((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - 1,
												(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip113
														? (world.getBlockState(BlockPos.containing((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(),
																(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - 1, (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()))).getValue(_getip113)
														: -1) == 0
								|| IsEntityWearingHidingSuitProcedure.execute(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == true
										&& !entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:springlock_exceptions"))))
								&& ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null ? entity.distanceTo((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) : -1) > 24) {
					entity.getPersistentData().putBoolean("hasTarget", false);
					if (entity instanceof Mob) {
						try {
							((Mob) entity).setTarget(null);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					if (getLogs == true) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("remove target"), false);
					}
				}
			} else {
				entity.getPersistentData().putBoolean("hasTarget", false);
				if (entity instanceof Mob) {
					try {
						((Mob) entity).setTarget(null);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				if (getLogs == true) {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("remove target"), false);
				}
			}
		}
	}
}
