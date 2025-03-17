package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.YenndoEntity;

import java.util.List;
import java.util.Comparator;

public class WeepingAngelMechanicProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entity instanceof Player || entity instanceof YenndoEntity) {
					if (IsEntityBeingLookedAtProcedure.execute(world, entity, entityiterator, entity.getEyeHeight()) == true) {
						if (entity instanceof Mob _entity)
							_entity.getNavigation().stop();
						entity.setDeltaMovement(new Vec3(0, 0, 0));
						if (entity instanceof YenndoEntity) {
							((YenndoEntity) entity).setAnimation("animation.model.pose2");
						}
					}
				}
			}
		}
		if (entity.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6D) {
			if (entity instanceof YenndoEntity) {
				((YenndoEntity) entity).setAnimation("empty");
			}
		}
	}
}
