package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.yafnafmod.network.YaFnafmodModVariables;
import net.mcreator.yafnafmod.entity.YenndoEntity;
import net.mcreator.yafnafmod.entity.WitheredGoldenFreddyEntity;
import net.mcreator.yafnafmod.entity.WitheredFoxyEntity;
import net.mcreator.yafnafmod.entity.ToyFoxyEntity;
import net.mcreator.yafnafmod.entity.ShadowFreddyEntity;
import net.mcreator.yafnafmod.entity.ScraptrapEntity;
import net.mcreator.yafnafmod.entity.ScrapBabyEntity;
import net.mcreator.yafnafmod.entity.PuppetEntity;
import net.mcreator.yafnafmod.entity.PlushtrapEntity;
import net.mcreator.yafnafmod.entity.PitbonnieEntity;
import net.mcreator.yafnafmod.entity.NightmareFreddyEntity;
import net.mcreator.yafnafmod.entity.NightmareFoxyEntity;
import net.mcreator.yafnafmod.entity.NightmareBbEntity;
import net.mcreator.yafnafmod.entity.MoltenFreddyEntity;
import net.mcreator.yafnafmod.entity.GoldenFreddyEntity;
import net.mcreator.yafnafmod.entity.FuntimeFoxyEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateEntity;
import net.mcreator.yafnafmod.entity.EnnardEntity;

public class NightAnimatronicOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean can_laugh = false;
		boolean found = false;
		double chance = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		String RX = "";
		String RY = "";
		String RZ = "";
		GetNewTargetProcedure.execute(world, x, y, z, entity);
		SettingSkinProcedure.execute(entity, entity.getPersistentData().getString("skin"));
		RandomMovementFunctionProcedure.execute(world, x, y, z, entity);
		if (YaFnafmodModVariables.MapVariables.get(world).STRUCTUREBUILD_BUILD == false) {
			SetNbtPositionsProcedure.execute(world, x, y, z, entity);
		} else {
			if (entity instanceof Mob _entity)
				_entity.getNavigation().stop();
			entity.setDeltaMovement(new Vec3(0, 0, 0));
		}
		if (!(entity instanceof EnnardEntity) && !(entity instanceof MoltenFreddyEntity) && !(entity instanceof ScraptrapEntity) && !(entity instanceof ScrapBabyEntity)) {
			DayActionProcedure.execute(world, x, y, z, entity);
		}
		PlayVoiceProcedure.execute(world, x, y, z, entity);
		FuntimeFreddyFunctionProcedure.execute(world, x, y, z, entity);
		FuntimeChicaFunctionProcedure.execute(world, x, y, z, entity);
		BalloraMinireenaFunctionProcedure.execute(world, x, y, z, entity);
		RockstarFreddyCodeProcedure.execute(world, x, y, z, entity);
		if (entity instanceof YenndoEntity) {
			WeepingAngelMechanicProcedure.execute(world, x, y, z, entity);
		}
		DontLookAtFunctionProcedure.execute(world, x, y, z, entity);
		DuckingProcedure.execute(world, x, y, z, entity);
		CrawlingProcedure.execute(world, x, y, z, entity);
		if (entity instanceof FoxyPirateEntity || entity instanceof WitheredFoxyEntity || entity instanceof ToyFoxyEntity || entity instanceof NightmareFoxyEntity || entity instanceof FuntimeFoxyEntity || entity instanceof PitbonnieEntity) {
			if (entity.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6D && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				entity.setSprinting(true);
			} else {
				entity.setSprinting(false);
			}
		}
		if (entity instanceof EnnardEntity) {
			if ((entity instanceof EnnardEntity _datEntL22 && _datEntL22.getEntityData().get(EnnardEntity.DATA_has_mask)) == false) {
				if (entity instanceof EnnardEntity animatable)
					animatable.setTexture("ennard_maskless");
				WalkyTooProcedure.execute(world, x, y, z, entity);
			} else {
				if (entity instanceof EnnardEntity animatable)
					animatable.setTexture("ennard");
			}
		} else if (entity instanceof WitheredGoldenFreddyEntity) {
			if (IsItNighttimeProcedure.execute(world) == true) {
				WitheredGoldenFreddyFunctionProcedure.execute(world, entity);
				if (entity.getPersistentData().getBoolean("is_head") == true) {
					if (entity instanceof WitheredGoldenFreddyEntity) {
						((WitheredGoldenFreddyEntity) entity).setAnimation("animation.freddy.gold_head");
					}
					entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 0.5), (entity.getLookAngle().y * 0.5), (entity.getLookAngle().z * 0.5)));
					entity.setNoGravity(false);
					if (entity instanceof Player _player) {
						_player.getAbilities().flying = true;
						_player.onUpdateAbilities();
					}
				} else {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().stop();
					if (entity instanceof WitheredGoldenFreddyEntity) {
						((WitheredGoldenFreddyEntity) entity).setAnimation("empty");
					}
					entity.setNoGravity(true);
				}
			}
		} else if (entity instanceof GoldenFreddyEntity || entity instanceof ShadowFreddyEntity || entity instanceof PuppetEntity && (entity instanceof PuppetEntity _datEntL40 && _datEntL40.getEntityData().get(PuppetEntity.DATA_busy)) == false) {
			if (!(entity instanceof PuppetEntity)) {
				if (IsItNighttimeProcedure.execute(world) == true) {
					if (Mth.nextInt(RandomSource.create(), 1, 18) == Mth.nextInt(RandomSource.create(), 1, 36)) {
						if (entity.getPersistentData().getBoolean("can_tp") == true) {
							TeleportProcedure.execute(world, x, y, z, entity);
						}
					}
				}
			} else {
				if (!(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 24, 24, 24), e -> true).isEmpty()) && !(!world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(x, y, z), 24, 24, 24), e -> true).isEmpty())) {
					if (Mth.nextInt(RandomSource.create(), 1, 18) == Mth.nextInt(RandomSource.create(), 1, 36)) {
						if (entity.getPersistentData().getBoolean("can_tp") == true) {
							TeleportProcedure.execute(world, x, y, z, entity);
						}
					}
				}
			}
		}
		if (entity instanceof NightmareFreddyEntity) {
			FreddleCodeProcedure.execute(world, x, y, z, entity);
		} else if (entity instanceof PlushtrapEntity || entity instanceof NightmareBbEntity) {
			if ((entity instanceof PlushtrapEntity _datEntL53 && _datEntL53.getEntityData().get(PlushtrapEntity.DATA_sitting)) == true
					|| (entity instanceof NightmareBbEntity _datEntL54 && _datEntL54.getEntityData().get(NightmareBbEntity.DATA_sitting)) == true) {
				if (entity instanceof PlushtrapEntity) {
					((PlushtrapEntity) entity).setAnimation("animation.plush.sit");
				}
				if (entity instanceof NightmareBbEntity) {
					((NightmareBbEntity) entity).setAnimation("animation.bb.sit");
				}
				if (entity instanceof Mob _mobSetNoAi) {
					_mobSetNoAi.setNoAi(true);
				}
			} else {
				if (entity instanceof PlushtrapEntity) {
					((PlushtrapEntity) entity).setAnimation("empty");
				}
				if (entity instanceof NightmareBbEntity) {
					((NightmareBbEntity) entity).setAnimation("empty");
				}
				if (entity instanceof Mob _mobSetNoAi) {
					_mobSetNoAi.setNoAi(false);
				}
			}
		}
		if (entity.getPersistentData().getBoolean("controlshock_linked") == true) {
			ControlShockReturnProcedure.execute(world, x, y, z, entity);
		}
	}
}
