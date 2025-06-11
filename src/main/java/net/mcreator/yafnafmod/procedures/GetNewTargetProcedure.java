package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;
import net.mcreator.yafnafmod.entity.PuppetEntity;

import java.util.List;
import java.util.Comparator;

public class GetNewTargetProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean stop = false;
		double rangetest = 0;
		rangetest = 0.55125;
		if (!(!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) && !entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:passive_animatronics")))) {
			if (entity.getPersistentData().getBoolean("visited_targetspot") == false && entity.getPersistentData().getBoolean("had_target") == true) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo((entity.getPersistentData().getDouble("target_x")), (entity.getPersistentData().getDouble("target_y")), (entity.getPersistentData().getDouble("target_z")), 1);
				if (2 > new Vec3(x, y, z).distanceTo(new Vec3((entity.getPersistentData().getDouble("target_x")), (entity.getPersistentData().getDouble("target_y")), (entity.getPersistentData().getDouble("target_z"))))
						|| 5 > new Vec3(x, y, z).distanceTo(new Vec3((entity.getPersistentData().getDouble("target_x")), (entity.getPersistentData().getDouble("target_y")), (entity.getPersistentData().getDouble("target_z"))))
								&& y != entity.getPersistentData().getDouble("target_y")) {
					entity.getPersistentData().putBoolean("visited_targetspot", true);
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					stop = false;
					if (entityiterator instanceof Player || entityiterator instanceof Villager) {
						if (!IsEntityBeingLookedAtProcedure.execute(world, entityiterator, entity, entityiterator.getEyeHeight(), rangetest)) {
							if (!(entityiterator.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6D)) {
								stop = true;
							} else if (entityiterator.isShiftKeyDown() || entityiterator.isSwimming()) {
								stop = true;
							}
						}
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
						}.checkGamemode(entity) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
								} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.ADVENTURE;
								}
								return false;
							}
						}.checkGamemode(entity)) {
							stop = true;
						}
						if (entity instanceof PuppetEntity) {
							if ((entity instanceof PuppetEntity _datEntL28 && _datEntL28.getEntityData().get(PuppetEntity.DATA_busy)) == true) {
								stop = true;
							}
						}
						if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:mask_foolers"))) && IsTargetWearingMaskProcedure.execute(entityiterator)
								|| (world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()))).getBlock() == YaFnafmodModBlocks.LOCKER_YELLOW_HIDING.get()
										&& ((world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip39
												? (world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()))).getValue(_getip39)
												: -1) == 0
								|| (world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY() - 1, entityiterator.getZ()))).getBlock() == YaFnafmodModBlocks.LOCKER_YELLOW_HIDING.get()
										&& ((world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY() - 1, entityiterator.getZ()))).getBlock().getStateDefinition().getProperty(
												"blockstate") instanceof IntegerProperty _getip49 ? (world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY() - 1, entityiterator.getZ()))).getValue(_getip49) : -1) == 0) {
							stop = true;
						}
						if (!(entity instanceof LivingEntity _entity ? _entity.hasLineOfSight(entityiterator) : false)) {
							stop = true;
						}
						if (stop == false) {
							if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
						}
					}
				}
			}
		} else if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			entity.getPersistentData().putBoolean("had_target", true);
			entity.getPersistentData().putBoolean("visited_targetspot", false);
			entity.getPersistentData().putDouble("target_x", (entity.getX()));
			entity.getPersistentData().putDouble("target_y", (entity.getY()));
			entity.getPersistentData().putDouble("target_z", (entity.getZ()));
			if (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player _plr ? _plr.getAbilities().instabuild : false)
					|| !(entity instanceof LivingEntity _entity ? _entity.hasLineOfSight((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) : false)
					|| ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null ? entity.distanceTo((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) : -1) > 16
					|| !(entity instanceof LivingEntity _liveEnt && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null
							? _liveEnt.hasLineOfSight((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null))
							: false)) {
				if (entity instanceof Mob) {
					try {
						((Mob) entity).setTarget(null);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
