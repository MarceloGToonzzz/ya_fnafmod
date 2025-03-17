package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;

public class LetterSelectProcedure {
	public static void execute(Entity entity, String letter) {
		if (entity == null || letter == null)
			return;
		ItemStack fat = ItemStack.EMPTY;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FAT.get()) {
			fat = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FAT.get()) {
			fat = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
		}
		fat.getOrCreateTag().putDouble("sel_letter", ("abcdefghijklmnopqrstuvwxyz".indexOf(letter)));
	}
}
