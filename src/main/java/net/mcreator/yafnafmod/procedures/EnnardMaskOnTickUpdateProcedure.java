package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.entity.EnnardEntity;

import java.util.List;
import java.util.Comparator;

public class EnnardMaskOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(EnnardEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof EnnardEntity && (entityiterator instanceof EnnardEntity _datEntL2 && _datEntL2.getEntityData().get(EnnardEntity.DATA_has_mask)) == false) {
						if (entityiterator instanceof EnnardEntity _datEntSetL)
							_datEntSetL.getEntityData().set(EnnardEntity.DATA_has_mask, true);
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					}
				}
			}
		} else if (!world.getEntitiesOfClass(EnnardEntity.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof EnnardEntity && (entityiterator instanceof EnnardEntity _datEntL8 && _datEntL8.getEntityData().get(EnnardEntity.DATA_has_mask)) == false) {
						if (entityiterator instanceof Mob _entity)
							_entity.getNavigation().moveTo(x, y, z, 1);
					}
				}
			}
		}
	}
}
