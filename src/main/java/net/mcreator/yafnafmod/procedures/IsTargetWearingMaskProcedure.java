package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;

public class IsTargetWearingMaskProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean can_attack = false;
		boolean is_wearing = false;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity
				&& ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FREDDY_MASK_HELMET
						.get()) {
			is_wearing = true;
		} else {
			is_wearing = false;
		}
		return is_wearing;
	}
}
