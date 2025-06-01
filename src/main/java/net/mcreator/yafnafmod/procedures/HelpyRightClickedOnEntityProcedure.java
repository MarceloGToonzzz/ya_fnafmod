package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;

public class HelpyRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity.isShiftKeyDown()) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
				entity.getPersistentData().putString("outfit", "");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.HELPY_OUTFIT_2.get()) {
				entity.getPersistentData().putString("outfit", "2");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.HELPY_OUTFIT_3.get()) {
				entity.getPersistentData().putString("outfit", "3");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.HELPY_OUTFIT_4.get()) {
				entity.getPersistentData().putString("outfit", "4");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.HELPY_OUTFIT_5.get()) {
				entity.getPersistentData().putString("outfit", "5");
			}
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.HELPY_OUTFIT_6.get()) {
				entity.getPersistentData().putString("outfit", "6");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.HELPY_OUTFIT_7.get()) {
				entity.getPersistentData().putString("outfit", "7");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.HELPY_OUTFIT_8.get()) {
				entity.getPersistentData().putString("outfit", "8");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.HELPY_OUTFIT_9.get()) {
				entity.getPersistentData().putString("outfit", "9");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.HELPY_OUTFIT_10.get()) {
				entity.getPersistentData().putString("outfit", "10");
			}
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.HELPY_OUTFIT_11.get()) {
				entity.getPersistentData().putString("outfit", "11");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.HELPY_OUTFIT_12.get()) {
				entity.getPersistentData().putString("outfit", "12");
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.HELPY_OUTFIT_15.get()) {
				entity.getPersistentData().putString("outfit", "15");
			}
		}
	}
}
