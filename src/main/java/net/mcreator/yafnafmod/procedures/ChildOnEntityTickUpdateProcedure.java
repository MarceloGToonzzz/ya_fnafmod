package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.yafnafmod.init.YaFnafmodModGameRules;
import net.mcreator.yafnafmod.entity.SpringbonnieDayEntity;
import net.mcreator.yafnafmod.entity.RockstarFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RockstarFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RockstarChicaDayEntity;
import net.mcreator.yafnafmod.entity.RockstarBonnieDayEntity;
import net.mcreator.yafnafmod.entity.RetroFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RetroFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RetroChicaDayEntity;
import net.mcreator.yafnafmod.entity.RetroBonnieDayEntity;
import net.mcreator.yafnafmod.entity.PigpatchDayEntity;
import net.mcreator.yafnafmod.entity.PanStanDayEntity;
import net.mcreator.yafnafmod.entity.OrvilleElephantDayEntity;
import net.mcreator.yafnafmod.entity.NumberOneCrateDayEntity;
import net.mcreator.yafnafmod.entity.NeddBearDayEntity;
import net.mcreator.yafnafmod.entity.MrHugsDayEntity;
import net.mcreator.yafnafmod.entity.MrHippoDayEntity;
import net.mcreator.yafnafmod.entity.MrCanDoDayEntity;
import net.mcreator.yafnafmod.entity.HappyFrogDayEntity;
import net.mcreator.yafnafmod.entity.GhostChildEntity;
import net.mcreator.yafnafmod.entity.FredbearDayEntity;
import net.mcreator.yafnafmod.entity.ChildEntity;
import net.mcreator.yafnafmod.entity.BucketBobDayEntity;

import java.util.UUID;
import java.util.List;
import java.util.Comparator;

public class ChildOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double thing = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double bed_range = 0;
		BlockState block = Blocks.AIR.defaultBlockState();
		Entity killer = null;
		if (entity instanceof ChildEntity) {
			ChildStateMachineProcedure.execute(world, x, y, z, entity);
			if ((entity instanceof ChildEntity _datEntS ? _datEntS.getEntityData().get(ChildEntity.DATA_emotion) : "").equals("happy")) {
				if (entity instanceof ChildEntity animatable)
					animatable.setTexture("child_happy");
			} else if ((entity instanceof ChildEntity _datEntS ? _datEntS.getEntityData().get(ChildEntity.DATA_emotion) : "").equals("sad")) {
				if (entity instanceof ChildEntity animatable)
					animatable.setTexture("child_sad");
				if (Mth.nextInt(RandomSource.create(), 1, 7) == 2) {
					world.addParticle((ParticleTypes.FALLING_WATER), x, (y + 1), z, 0, (-0.5), 0);
				}
			} else if ((entity instanceof ChildEntity _datEntS ? _datEntS.getEntityData().get(ChildEntity.DATA_emotion) : "").equals("angry")) {
				if (Mth.nextInt(RandomSource.create(), 1, 10) == 2) {
					world.addParticle((ParticleTypes.ANGRY_VILLAGER), x, (y + 1), z, 0, 1, 0);
				}
				if (entity instanceof ChildEntity animatable)
					animatable.setTexture("child_angry");
			} else if ((entity instanceof ChildEntity _datEntS ? _datEntS.getEntityData().get(ChildEntity.DATA_emotion) : "").equals("super_angry")) {
				if (Mth.nextInt(RandomSource.create(), 1, 7) == 2) {
					world.addParticle((ParticleTypes.ANGRY_VILLAGER), x, (y + 1), z, 0, 1, 0);
				}
				if (entity instanceof ChildEntity animatable)
					animatable.setTexture("child_superangry");
			}
			if ((entity instanceof ChildEntity _datEntS ? _datEntS.getEntityData().get(ChildEntity.DATA_emotion) : "").equals("happy")) {
				if (entity.getPersistentData().getDouble("aistate") == 0) {
					entity.getPersistentData().putDouble("emotion_tick", (entity.getPersistentData().getDouble("emotion_tick") + 1));
				} else {
					entity.getPersistentData().putDouble("emotion_tick", 0);
				}
			}
			if (entity.getPersistentData().getDouble("emotion_tick") > (world.getLevelData().getGameRules().getInt(YaFnafmodModGameRules.CHILD_EMOTION_METER)) * 20) {
				thing = Mth.nextInt(RandomSource.create(), 1, 2);
				if (thing == 2) {
					thing = Mth.nextInt(RandomSource.create(), 1, 2);
					if (!((entity instanceof ChildEntity _datEntS ? _datEntS.getEntityData().get(ChildEntity.DATA_emotion) : "").equals("angry"))) {
						if (thing == 1) {
							if (entity instanceof ChildEntity _datEntSetS)
								_datEntSetS.getEntityData().set(ChildEntity.DATA_emotion, "sad");
						} else {
							if (entity instanceof ChildEntity _datEntSetS)
								_datEntSetS.getEntityData().set(ChildEntity.DATA_emotion, "angry");
						}
					} else {
						if (thing == 1) {
							if (entity instanceof ChildEntity _datEntSetS)
								_datEntSetS.getEntityData().set(ChildEntity.DATA_emotion, "super_angry");
						}
					}
					entity.getPersistentData().putDouble("emotion_tick", 0);
				}
			}
		}
		if (entity instanceof GhostChildEntity) {
			if ((entity.getPersistentData().getString("type")).equals("normal")) {
				if (entity instanceof GhostChildEntity animatable)
					animatable.setTexture("child_ghost");
			} else if ((entity.getPersistentData().getString("type")).equals("vengeful")) {
				if (entity instanceof GhostChildEntity animatable)
					animatable.setTexture("child_ghostvengeful");
			}
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
			}.entityFromStringUUID((entity.getPersistentData().getString("killer")), (Level) world) instanceof LivingEntity) {
				killer = new Object() {
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
				}.entityFromStringUUID((entity.getPersistentData().getString("killer")), (Level) world);
				if (!(killer instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof GhostChildEntity) {
						((GhostChildEntity) entity).setAnimation("animation.model.ghost_attack");
					}
					if (entity instanceof Mob _entity && killer instanceof LivingEntity _ent)
						_entity.setTarget(_ent);
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((killer.getX()), (killer.getY()), (killer.getZ()), 1);
					if ((killer != null ? entity.distanceTo(killer) : -1) < 3) {
						killer.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK), entity), 2);
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (DoesAnimatronicWalkAtNightProcedure.execute(entityiterator) == false) {
						if (entity instanceof Mob _entity)
							_entity.getNavigation().moveTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1);
						if ((entityiterator != null ? entity.distanceTo(entityiterator) : -1) < 2) {
							if (entityiterator instanceof RetroFreddyDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(RetroFreddyDayEntity.DATA_walker, true);
							if (entityiterator instanceof RetroBonnieDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(RetroBonnieDayEntity.DATA_walker, true);
							if (entityiterator instanceof RetroChicaDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(RetroChicaDayEntity.DATA_walker, true);
							if (entityiterator instanceof RetroFoxyDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(RetroFoxyDayEntity.DATA_walker, true);
							if (entityiterator instanceof FredbearDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(FredbearDayEntity.DATA_walker, true);
							if (entityiterator instanceof SpringbonnieDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(SpringbonnieDayEntity.DATA_walker, true);
							if (entityiterator instanceof PanStanDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(PanStanDayEntity.DATA_walker, true);
							if (entityiterator instanceof BucketBobDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(BucketBobDayEntity.DATA_walker, true);
							if (entityiterator instanceof MrHugsDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(MrHugsDayEntity.DATA_walker, true);
							if (entityiterator instanceof MrCanDoDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(MrCanDoDayEntity.DATA_walker, true);
							if (entityiterator instanceof NumberOneCrateDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(NumberOneCrateDayEntity.DATA_walker, true);
							if (entityiterator instanceof NeddBearDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(NeddBearDayEntity.DATA_walker, true);
							if (entityiterator instanceof HappyFrogDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(HappyFrogDayEntity.DATA_walker, true);
							if (entityiterator instanceof MrHippoDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(MrHippoDayEntity.DATA_walker, true);
							if (entityiterator instanceof PigpatchDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(PigpatchDayEntity.DATA_walker, true);
							if (entityiterator instanceof OrvilleElephantDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(OrvilleElephantDayEntity.DATA_walker, true);
							if (entityiterator instanceof RockstarFreddyDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(RockstarFreddyDayEntity.DATA_walker, true);
							if (entityiterator instanceof RockstarBonnieDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(RockstarBonnieDayEntity.DATA_walker, true);
							if (entityiterator instanceof RockstarChicaDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(RockstarChicaDayEntity.DATA_walker, true);
							if (entityiterator instanceof RockstarFoxyDayEntity _datEntSetL)
								_datEntSetL.getEntityData().set(RockstarFoxyDayEntity.DATA_walker, true);
							if (!entity.level().isClientSide())
								entity.discard();
						}
					}
				}
			}
		}
	}
}
