package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;

public class IsEntityWearingHidingSuitProcedure {
	public static boolean execute(Entity enteteh) {
		if (enteteh == null)
			return false;
		boolean yuh = false;
		if ((enteteh instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FREDBEAR_SUIT_ARMOR_HELMET.get()
				&& (enteteh instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FREDBEAR_SUIT_ARMOR_CHESTPLATE.get()
				&& (enteteh instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FREDBEAR_SUIT_ARMOR_LEGGINGS.get()
				|| (enteteh instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == YaFnafmodModItems.SPRINGBONNIE_SUIT_ARMOR_HELMET.get()
						&& (enteteh instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == YaFnafmodModItems.SPRINGBONNIE_SUIT_ARMOR_CHESTPLATE.get()
						&& (enteteh instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == YaFnafmodModItems.SPRINGBONNIE_SUIT_ARMOR_LEGGINGS.get()
				|| (enteteh instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FREDDY_SUIT_ARMOR_HELMET.get()
						&& (enteteh instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FREDDY_SUIT_ARMOR_CHESTPLATE.get()
						&& (enteteh instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FREDDY_SUIT_ARMOR_LEGGINGS.get()
				|| (enteteh instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == YaFnafmodModItems.YELLOW_RABBIT_SUIT_ARMOR_HELMET.get()
						&& (enteteh instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == YaFnafmodModItems.YELLOW_RABBIT_SUIT_ARMOR_CHESTPLATE.get()
						&& (enteteh instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == YaFnafmodModItems.YELLOW_RABBIT_SUIT_ARMOR_LEGGINGS.get()
				|| (enteteh instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == YaFnafmodModItems.YELLOW_RABBIT_FIXED_SUIT_ARMOR_HELMET.get()
						&& (enteteh instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == YaFnafmodModItems.YELLOW_RABBIT_FIXED_SUIT_ARMOR_CHESTPLATE.get()
						&& (enteteh instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == YaFnafmodModItems.YELLOW_RABBIT_FIXED_SUIT_ARMOR_LEGGINGS.get()) {
			yuh = true;
		} else {
			yuh = false;
		}
		return yuh;
	}
}
