package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.yafnafmod.entity.NightmareFreddyEntity;

import java.util.Comparator;

public class FreddleCodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("tick_cooldown") == 0) {
			entity.getPersistentData().putDouble("tick_cooldown", (Mth.nextInt(RandomSource.create(), 140, 200)));
		}
		entity.getPersistentData().putDouble("tick", (entity.getPersistentData().getDouble("tick") + 1));
		if (entity.getPersistentData().getDouble("tick") == entity.getPersistentData().getDouble("tick_cooldown")) {
			if ((entity instanceof NightmareFreddyEntity _datEntI ? _datEntI.getEntityData().get(NightmareFreddyEntity.DATA_freddles) : 0) != 4) {
				if (entity instanceof NightmareFreddyEntity _datEntSetI)
					_datEntSetI.getEntityData().set(NightmareFreddyEntity.DATA_freddles, (int) ((entity instanceof NightmareFreddyEntity _datEntI ? _datEntI.getEntityData().get(NightmareFreddyEntity.DATA_freddles) : 0) + 1));
				if (!world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()) {
					entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((((Entity) world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX()), (((Entity) world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY()), (((Entity) world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ())));
				}
				if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()) {
					entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX()), (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY()), (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ())));
				}
			}
			entity.getPersistentData().putDouble("tick_cooldown", (Mth.nextInt(RandomSource.create(), 140, 200)));
			entity.getPersistentData().putDouble("tick", 0);
		}
		if ((entity instanceof NightmareFreddyEntity _datEntI ? _datEntI.getEntityData().get(NightmareFreddyEntity.DATA_freddles) : 0) == 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 5, 1, false, false));
			if (entity instanceof Mob _mob) {
				_mob.setNoAi(true);
			}
		} else if ((entity instanceof NightmareFreddyEntity _datEntI ? _datEntI.getEntityData().get(NightmareFreddyEntity.DATA_freddles) : 0) == 1) {
			if (entity instanceof NightmareFreddyEntity) {
				((NightmareFreddyEntity) entity).setAnimation("animation.nfreddy.freddle1");
			}
			if (entity instanceof Mob _mob) {
				_mob.setNoAi(true);
			}
		} else if ((entity instanceof NightmareFreddyEntity _datEntI ? _datEntI.getEntityData().get(NightmareFreddyEntity.DATA_freddles) : 0) == 2) {
			if (entity instanceof NightmareFreddyEntity) {
				((NightmareFreddyEntity) entity).setAnimation("animation.nfreddy.freddle2");
			}
			if (entity instanceof Mob _mob) {
				_mob.setNoAi(true);
			}
		} else if ((entity instanceof NightmareFreddyEntity _datEntI ? _datEntI.getEntityData().get(NightmareFreddyEntity.DATA_freddles) : 0) == 3) {
			if (entity instanceof NightmareFreddyEntity) {
				((NightmareFreddyEntity) entity).setAnimation("animation.nfreddy.freddle3");
			}
			if (entity instanceof Mob _mob) {
				_mob.setNoAi(true);
			}
		} else if ((entity instanceof NightmareFreddyEntity _datEntI ? _datEntI.getEntityData().get(NightmareFreddyEntity.DATA_freddles) : 0) == 4) {
			if (entity.getPersistentData().getBoolean("walking_around") == false) {
				if (entity instanceof NightmareFreddyEntity) {
					((NightmareFreddyEntity) entity).setAnimation("empty");
				}
				if (entity instanceof Mob _mob) {
					_mob.setNoAi(false);
				}
				entity.getPersistentData().putBoolean("walking_around", true);
			}
		}
	}
}
