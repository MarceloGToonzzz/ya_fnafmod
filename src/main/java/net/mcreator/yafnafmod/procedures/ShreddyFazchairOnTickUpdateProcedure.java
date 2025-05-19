package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import java.util.List;
import java.util.Comparator;

public class ShreddyFazchairOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("shredding") == true) {
			entity.getPersistentData().putDouble("shred_tick", (entity.getPersistentData().getDouble("shred_tick") + 1));
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("" + entity.getPersistentData().getDouble("shred_tick"))), false);
			if (((entity.getPersistentData().getDouble("shred_tick"))) > (160) && ((entity.getPersistentData().getDouble("shred_tick"))) < (231)) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("SHRED!!"), false);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entity == entityiterator)) {
							if (entity.getZ() == entityiterator.getZ()) {
								if (entity.getYRot() == -90 || entity.getYRot() == 270) {
									if (entityiterator.getX() < entity.getX()) {
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 1);
									}
								} else if (entity.getYRot() == 90 || entity.getYRot() == -270) {
									if (entityiterator.getX() > entity.getX()) {
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 1);
									}
								}
							}
							if (entity.getX() == entityiterator.getX()) {
								if (entity.getYRot() == 0 || entity.getYRot() == 360 || entity.getYRot() == -360) {
									if (entityiterator.getZ() < entity.getZ()) {
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 1);
									}
								} else if (entity.getYRot() == 180 || entity.getYRot() == -180) {
									if (entityiterator.getZ() > entity.getZ()) {
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 1);
									}
								}
							}
						}
					}
				}
			}
			if (entity.getPersistentData().getDouble("shred_tick") == 360) {
				entity.getPersistentData().putBoolean("shredding", true);
			}
		}
	}
}
