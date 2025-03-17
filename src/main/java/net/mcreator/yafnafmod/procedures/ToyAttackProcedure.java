package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.ToyFreddyDayEntity;
import net.mcreator.yafnafmod.entity.ToyFoxyDayEntity;
import net.mcreator.yafnafmod.entity.ToyChicaDayEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieDayEntity;
import net.mcreator.yafnafmod.entity.Minireena2Entity;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class ToyAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!(ForgeRegistries.ENTITY_TYPES.getKey(sourceentity.getType()).toString()).contains("toy_")) {
			if (!world.getEntitiesOfClass(ToyFreddyDayEntity.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(ToyBonnieDayEntity.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(ToyChicaDayEntity.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(ToyFoxyDayEntity.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).contains("toy_")) {
							if (entityiterator instanceof Mob _entity && sourceentity instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
						}
					}
				}
			}
		} else if (entity instanceof Minireena2Entity) {
			if (entity instanceof Minireena2Entity _datEntSetL)
				_datEntSetL.getEntityData().set(Minireena2Entity.DATA_has_player, false);
		}
	}
}
