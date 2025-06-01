package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.yafnafmod.init.YaFnafmodModEntities;
import net.mcreator.yafnafmod.entity.FuntimeFreddyEntity;
import net.mcreator.yafnafmod.entity.BonbonEntity;

import java.util.UUID;
import java.util.List;
import java.util.Comparator;

public class FuntimeFreddyFunctionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double chance = 0;
		boolean can_laugh = false;
		boolean is_guy_near = false;
		if (entity instanceof FuntimeFreddyEntity) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				entity.getPersistentData().putDouble("attack_tick", (entity.getPersistentData().getDouble("attack_tick") + 1));
				if (entity.getPersistentData().getDouble("attack_tick") > 20) {
					chance = Mth.nextInt(RandomSource.create(), 1, 3);
					if (chance == 3) {
						if ((entity instanceof FuntimeFreddyEntity _datEntL7 && _datEntL7.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = YaFnafmodModEntities.BONBON.get().spawn(_level, BlockPos.containing(x, entity.getY() - 1 + entity.getEyeHeight(), z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement((((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX()) * 0.1875),
											((((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - 1 + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyeHeight())
													- (entity.getY() - 1 + entity.getEyeHeight())) * 0.1875),
											(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ()) * 0.1875));
								}
							}
							if (entity instanceof FuntimeFreddyEntity _datEntSetL)
								_datEntSetL.getEntityData().set(FuntimeFreddyEntity.DATA_has_bonbon, false);
							entity.getPersistentData().putBoolean("refresh_skin", false);
							if (entity.getPersistentData().getBoolean("bonbon_line") == false) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_ftfreddy_bonbonshooter")), SoundSource.HOSTILE, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_ftfreddy_bonbonshooter")), SoundSource.HOSTILE, 1, 1, false);
									}
								}
								entity.getPersistentData().putBoolean("bonbon_line", true);
							}
						} else {
							entity.getPersistentData().putBoolean("bonbon_line", false);
						}
					}
					entity.getPersistentData().putDouble("attack_tick", 0);
				}
			} else {
				entity.getPersistentData().putBoolean("bonbon_line", false);
				entity.getPersistentData().putDouble("attack_tick", 0);
			}
			if (entity.getPersistentData().getBoolean("refresh_skin") == false) {
				if (!(entity.getPersistentData().getString("style")).equals("fms")) {
					if (!(entity.getPersistentData().getString("skin")).equals("frights") && !(entity.getPersistentData().getString("skin")).equals("novel")) {
						if ((entity instanceof FuntimeFreddyEntity _datEntL36 && _datEntL36.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
							if (entity instanceof FuntimeFreddyEntity animatable)
								animatable.setTexture("ftfreddy");
						} else {
							if (entity instanceof FuntimeFreddyEntity animatable)
								animatable.setTexture("ftfreddy_bonless");
						}
					} else if ((entity.getPersistentData().getString("skin")).equals("frights")) {
						if ((entity instanceof FuntimeFreddyEntity _datEntL40 && _datEntL40.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
							if (entity instanceof FuntimeFreddyEntity animatable)
								animatable.setTexture("ftfreddy_ctw");
						} else {
							if (entity instanceof FuntimeFreddyEntity animatable)
								animatable.setTexture("ftfreddy_bonless_ctw");
						}
					} else if ((entity.getPersistentData().getString("skin")).equals("novel")) {
						if ((entity instanceof FuntimeFreddyEntity _datEntL44 && _datEntL44.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
							if (entity instanceof FuntimeFreddyEntity animatable)
								animatable.setTexture("ftfreddy_novel");
						} else {
							if (entity instanceof FuntimeFreddyEntity animatable)
								animatable.setTexture("ftfreddy_bonless_novel");
						}
					} else if ((entity.getPersistentData().getString("skin")).equals("alt")) {
						if ((entity instanceof FuntimeFreddyEntity _datEntL48 && _datEntL48.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
							if (entity instanceof FuntimeFreddyEntity animatable)
								animatable.setTexture("ftfreddy_beta");
						} else {
							if (entity instanceof FuntimeFreddyEntity animatable)
								animatable.setTexture("ftfreddy_bonless_beta");
						}
					}
				} else {
					if ((entity instanceof FuntimeFreddyEntity _datEntL51 && _datEntL51.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == true) {
						if (entity instanceof FuntimeFreddyEntity animatable)
							animatable.setTexture("ftfreddy_fms");
					} else {
						if (entity instanceof FuntimeFreddyEntity animatable)
							animatable.setTexture("ftfreddy_fms_bonless");
					}
				}
				entity.getPersistentData().putBoolean("refresh_skin", true);
			}
		} else if (entity instanceof BonbonEntity) {
			if (entity.getPersistentData().getBoolean("set_funtime") == false) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof FuntimeFreddyEntity || (((Entity) world.getEntitiesOfClass(FuntimeFreddyEntity.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof FuntimeFreddyEntity _datEntL59 && _datEntL59.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == false) {
							entity.getPersistentData().putString("original", (entityiterator.getStringUUID()));
							entity.getPersistentData().putString("original_skin", (entityiterator.getPersistentData().getString("skin")));
							entity.getPersistentData().putString("skin", (entityiterator.getPersistentData().getString("skin")));
						}
					}
				}
				entity.getPersistentData().putBoolean("set_funtime", true);
			}
			is_guy_near = false;
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player && (new Object() {
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
					}.checkGamemode(entityiterator))) {
						is_guy_near = true;
					}
				}
			}
			if (is_guy_near == false) {
				entity.getPersistentData().putDouble("wait_tick", (entity.getPersistentData().getDouble("wait_tick") + 1));
				if (!world.getEntitiesOfClass(FuntimeFreddyEntity.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).isEmpty()) {
					if (new Object() {
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
					}.entityFromStringUUID((entity.getPersistentData().getString("original")), (Level) world) instanceof FuntimeFreddyEntity) {
						if (entity instanceof Mob _entity)
							_entity.getNavigation().moveTo((new Object() {
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
							}.entityFromStringUUID((entity.getPersistentData().getString("original")), (Level) world).getX()), (new Object() {
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
							}.entityFromStringUUID((entity.getPersistentData().getString("original")), (Level) world).getY()), (new Object() {
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
							}.entityFromStringUUID((entity.getPersistentData().getString("original")), (Level) world).getZ()), 1);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entity.getPersistentData().getDouble("wait_tick") > 20) {
							if (entityiterator == new Object() {
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
							}.entityFromStringUUID((entity.getPersistentData().getString("original")), (Level) world) || !(new Object() {
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
							}.entityFromStringUUID((entity.getPersistentData().getString("original")), (Level) world) instanceof FuntimeFreddyEntity) && entityiterator instanceof FuntimeFreddyEntity
									&& (((Entity) world.getEntitiesOfClass(FuntimeFreddyEntity.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof FuntimeFreddyEntity _datEntL97 && _datEntL97.getEntityData().get(FuntimeFreddyEntity.DATA_has_bonbon)) == false) {
								if (entityiterator instanceof FuntimeFreddyEntity _datEntSetL)
									_datEntSetL.getEntityData().set(FuntimeFreddyEntity.DATA_has_bonbon, true);
								entityiterator.getPersistentData().putString("style", (entity.getPersistentData().getString("style")));
								entityiterator.getPersistentData().putString("skin", (entity.getPersistentData().getString("original_skin")));
								entityiterator.getPersistentData().putBoolean("refresh_skin", false);
								if (!entity.level().isClientSide())
									entity.discard();
							}
						}
					}
				}
			} else {
				entity.getPersistentData().putDouble("wait_tick", 0);
			}
		}
	}
}
