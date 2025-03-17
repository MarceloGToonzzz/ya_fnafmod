package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

import net.mcreator.yafnafmod.entity.MinireenaEntity;
import net.mcreator.yafnafmod.entity.Minireena2Entity;
import net.mcreator.yafnafmod.entity.BalloraEntity;

import java.util.function.BiFunction;
import java.util.UUID;
import java.util.List;
import java.util.Comparator;

public class BalloraMinireenaFunctionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean can_laugh = false;
		if (entity instanceof Minireena2Entity) {
			if ((entity instanceof Minireena2Entity _datEntL1 && _datEntL1.getEntityData().get(Minireena2Entity.DATA_has_player)) == true) {
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
				}).apply(world, (entity instanceof Minireena2Entity _datEntS ? _datEntS.getEntityData().get(Minireena2Entity.DATA_desired_player) : ""))) instanceof LivingEntity) {
					if ((((new BiFunction<LevelAccessor, String, Entity>() {
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
					}).apply(world, (entity instanceof Minireena2Entity _datEntS ? _datEntS.getEntityData().get(Minireena2Entity.DATA_desired_player) : ""))) != null ? entity.distanceTo(((new BiFunction<LevelAccessor, String, Entity>() {
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
					}).apply(world, (entity instanceof Minireena2Entity _datEntS ? _datEntS.getEntityData().get(Minireena2Entity.DATA_desired_player) : "")))) : -1) < 9) {
						if (entity.getPersistentData().getDouble("giggle_tick") > 50) {
							if (world instanceof Level)
								((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_minireena_giggle")), SoundSource.NEUTRAL, 1, 1);
							entity.getPersistentData().putDouble("giggle_tick", 0);
						}
					}
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((((new BiFunction<LevelAccessor, String, Entity>() {
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
						}).apply(world, (entity instanceof Minireena2Entity _datEntS ? _datEntS.getEntityData().get(Minireena2Entity.DATA_desired_player) : ""))).getX()), (((new BiFunction<LevelAccessor, String, Entity>() {
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
						}).apply(world, (entity instanceof Minireena2Entity _datEntS ? _datEntS.getEntityData().get(Minireena2Entity.DATA_desired_player) : ""))).getY()), (((new BiFunction<LevelAccessor, String, Entity>() {
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
						}).apply(world, (entity instanceof Minireena2Entity _datEntS ? _datEntS.getEntityData().get(Minireena2Entity.DATA_desired_player) : ""))).getZ()), 1);
				}
			} else {
				entity.getPersistentData().putDouble("player_cooldown_tick", (entity.getPersistentData().getDouble("player_cooldown_tick") + 1));
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entity instanceof MinireenaEntity) {
					if (entityiterator instanceof Player && !world.getEntitiesOfClass(BalloraEntity.class, AABB.ofSize(new Vec3(x, y, z), 24, 24, 24), e -> true).isEmpty()) {
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
								} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entityiterator) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
								} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
								}
								return false;
							}
						}.checkGamemode(entityiterator)) {
							if (((Entity) world.getEntitiesOfClass(BalloraEntity.class, AABB.ofSize(new Vec3(x, y, z), 48, 48, 48), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
							if (entity.getPersistentData().getDouble("giggle_tick") > 50) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_minireena_giggle")), SoundSource.HOSTILE, 1, 1);
								entity.getPersistentData().putDouble("giggle_tick", 0);
							}
						}
					}
				} else if (entity instanceof Minireena2Entity) {
					if (entityiterator instanceof Player || entityiterator instanceof Villager) {
						if ((entity instanceof Minireena2Entity _datEntL36 && _datEntL36.getEntityData().get(Minireena2Entity.DATA_has_player)) == false) {
							if (40 <= entity.getPersistentData().getDouble("player_cooldown_tick")) {
								if (new Object() {
									public boolean checkGamemode(Entity _ent) {
										if (_ent instanceof ServerPlayer _serverPlayer) {
											return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
										} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
											return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
													&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
										}
										return false;
									}
								}.checkGamemode(entityiterator) || new Object() {
									public boolean checkGamemode(Entity _ent) {
										if (_ent instanceof ServerPlayer _serverPlayer) {
											return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
										} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
											return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
													&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
										}
										return false;
									}
								}.checkGamemode(entityiterator)) {
									if (entity instanceof Minireena2Entity _datEntSetS)
										_datEntSetS.getEntityData().set(Minireena2Entity.DATA_desired_player, (entityiterator.getStringUUID()));
									if (entity instanceof Minireena2Entity _datEntSetL)
										_datEntSetL.getEntityData().set(Minireena2Entity.DATA_has_player, true);
								}
							}
						}
					}
				}
			}
		}
		if (entity instanceof MinireenaEntity || entity instanceof Minireena2Entity) {
			entity.getPersistentData().putDouble("giggle_tick", (entity.getPersistentData().getDouble("giggle_tick") + 1));
		} else if (entity instanceof BalloraEntity) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				if (entity.getPersistentData().getBoolean("played_song") == false) {
					{
						Entity _ent = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null);
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "playsound ya_fnafmod:anim_ballora_crumblingdreams ambient @s");
						}
					}
					entity.getPersistentData().putString("last_target", ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getStringUUID()));
					entity.getPersistentData().putBoolean("played_song", true);
				}
			} else {
				if (entity.getPersistentData().getBoolean("played_song") == true) {
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
					}).apply(world, (entity.getPersistentData().getString("last_target")))) instanceof LivingEntity) {
						{
							Entity _ent = ((new BiFunction<LevelAccessor, String, Entity>() {
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
							}).apply(world, (entity.getPersistentData().getString("last_target"))));
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a * ya_fnafmod:anim_ballora_crumblingdreams");
							}
						}
						entity.getPersistentData().putString("last_target", "");
						entity.getPersistentData().putBoolean("played_song", false);
					}
				}
			}
		}
	}
}
