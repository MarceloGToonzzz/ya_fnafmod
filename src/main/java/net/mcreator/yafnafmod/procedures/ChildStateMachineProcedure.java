package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.fml.ModList;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.yafnafmod.entity.ChildEntity;

import java.util.function.BiFunction;
import java.util.UUID;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

public class ChildStateMachineProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		List<Object> performer_animatronics = new ArrayList<>();
		String chosen_uuid = "";
		double wa = 0;
		entity.getPersistentData().putDouble("aistate_tick", (entity.getPersistentData().getDouble("aistate_tick") + 1));
		if (entity.getPersistentData().getDouble("aistate") == 1) {
			wa = 3 * 20;
		} else if (entity.getPersistentData().getDouble("aistate") == 2) {
			wa = 9 * 20;
		}
		if (entity.getPersistentData().getDouble("aistate_tick") > wa) {
			entity.getPersistentData().putBoolean("chosen_animatronic", false);
			entity.getPersistentData().putDouble("aistate_tick", 0);
			entity.getPersistentData().putDouble("aistate", (Mth.nextInt(RandomSource.create(), 1, 2)));
		}
		if (entity.getPersistentData().getDouble("aistate") == 2) {
			if (entity.getPersistentData().getBoolean("chosen_animatronic") == false) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if ((entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:performer_robots")))
								|| entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:performer_robots_fnafmod"))) && ModList.get().isLoaded("fnaf_mod"))
								&& (entity instanceof LivingEntity _entity ? _entity.hasLineOfSight(entityiterator) : false)) {
							performer_animatronics.add((entityiterator.getStringUUID()));
						}
					}
				}
				if (performer_animatronics.size() == 0) {
					entity.getPersistentData().putDouble("aistate", 0);
					entity.getPersistentData().putDouble("aistate_tick", 0);
				} else {
					chosen_uuid = performer_animatronics.get(Mth.nextInt(RandomSource.create(), 0, (int) (performer_animatronics.size() - 1))) instanceof String _s ? _s : "";
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
					}).apply(world, chosen_uuid)) instanceof LivingEntity) {
						entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((((new BiFunction<LevelAccessor, String, Entity>() {
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
						}).apply(world, chosen_uuid)).getX()), ((((new BiFunction<LevelAccessor, String, Entity>() {
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
						}).apply(world, chosen_uuid)).getY() + entity.getEyeHeight()) - 1), (((new BiFunction<LevelAccessor, String, Entity>() {
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
						}).apply(world, chosen_uuid)).getZ())));
						entity.getPersistentData().putBoolean("chosen_animatronic", true);
						if (entity.getPersistentData().getBoolean("chosen_animation") == false) {
							if (entity instanceof ChildEntity) {
								((ChildEntity) entity).setAnimation(("animation.model.dance" + Mth.nextInt(RandomSource.create(), 1, 3)));
							}
							entity.getPersistentData().putBoolean("chosen_animation", true);
						}
					}
				}
			} else {
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
				}).apply(world, chosen_uuid)) instanceof LivingEntity) {
					entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((((new BiFunction<LevelAccessor, String, Entity>() {
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
					}).apply(world, chosen_uuid)).getX()), ((((new BiFunction<LevelAccessor, String, Entity>() {
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
					}).apply(world, chosen_uuid)).getY() + entity.getEyeHeight()) - 1), (((new BiFunction<LevelAccessor, String, Entity>() {
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
					}).apply(world, chosen_uuid)).getZ())));
				}
			}
		} else {
			entity.getPersistentData().putBoolean("chosen_animation", false);
			if (entity instanceof ChildEntity) {
				((ChildEntity) entity).setAnimation("empty");
			}
		}
	}
}
