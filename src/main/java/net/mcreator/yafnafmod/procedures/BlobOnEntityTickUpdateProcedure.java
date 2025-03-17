package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModEntities;
import net.mcreator.yafnafmod.entity.BlobFuntimeFreddyEntity;
import net.mcreator.yafnafmod.entity.BlobFuntimeFoxyEntity;
import net.mcreator.yafnafmod.entity.BlobCircusBabyEntity;
import net.mcreator.yafnafmod.entity.BlobBalloraEntity;

import java.util.List;
import java.util.Comparator;

public class BlobOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean ballora = false;
		boolean baby = false;
		boolean freddy = false;
		boolean foxy = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(24 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof BlobCircusBabyEntity && !(entity instanceof BlobCircusBabyEntity)) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1);
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof BlobBalloraEntity || entity instanceof BlobBalloraEntity) {
					ballora = true;
				}
				if (entityiterator instanceof BlobCircusBabyEntity || entity instanceof BlobCircusBabyEntity) {
					baby = true;
				}
				if (entityiterator instanceof BlobFuntimeFoxyEntity || entity instanceof BlobFuntimeFoxyEntity) {
					foxy = true;
				}
				if (entityiterator instanceof BlobFuntimeFreddyEntity || entity instanceof BlobFuntimeFreddyEntity) {
					freddy = true;
				}
			}
		}
		if (baby == true && ballora == true && freddy == true && foxy == true) {
			if (entity instanceof BlobCircusBabyEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = YaFnafmodModEntities.ENNARD.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof BlobBalloraEntity) {
							if (!entityiterator.level().isClientSide())
								entityiterator.discard();
						}
						if (entityiterator instanceof BlobFuntimeFoxyEntity) {
							if (!entityiterator.level().isClientSide())
								entityiterator.discard();
						}
						if (entityiterator instanceof BlobFuntimeFreddyEntity) {
							if (!entityiterator.level().isClientSide())
								entityiterator.discard();
						}
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
