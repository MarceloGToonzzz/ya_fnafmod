package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;

public class CanAttackProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean result = false;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity
				&& (entity instanceof LivingEntity _entity ? _entity.hasLineOfSight((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) : false)) {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:mask_foolers")))) {
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getPersistentData().getBoolean("hiding_mask") == true) {
					result = false;
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((entity.getPersistentData().getDouble("x")), (entity.getPersistentData().getDouble("y")), (entity.getPersistentData().getDouble("z")), 2);
				} else {
					result = true;
				}
			}
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:flashlight_weak")))) {
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity
						&& (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FLASHLIGHT.get()
								&& ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("powered") == 1
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FLASHLIGHT.get()
										&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("powered") == 1)) {
					result = false;
				} else {
					result = true;
				}
			}
		} else {
			result = false;
		}
		return result;
	}
}
