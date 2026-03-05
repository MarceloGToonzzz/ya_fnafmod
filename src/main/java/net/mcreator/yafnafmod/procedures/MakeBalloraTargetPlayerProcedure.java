package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.BalloraEntity;

import java.util.List;
import java.util.Comparator;

public class MakeBalloraTargetPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity player) {
		if (player == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof BalloraEntity) {
					entityiterator.getPersistentData().putBoolean("hasTarget", true);
					entityiterator.getPersistentData().putString("target", (player.getStringUUID()));
					if (entityiterator instanceof Mob _entity && player instanceof LivingEntity _ent)
						_entity.setTarget(_ent);
				}
			}
		}
	}
}
