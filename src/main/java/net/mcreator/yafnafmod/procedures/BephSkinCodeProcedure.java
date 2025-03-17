package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.SpringbonnieDayEntity;
import net.mcreator.yafnafmod.entity.FredbearDayEntity;

public class BephSkinCodeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		String skin_name = "";
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.STICK) {
			if (entity instanceof FredbearDayEntity) {
				if ((entity.getPersistentData().getString("skin")).equals("accurate_fredbear") || (entity.getPersistentData().getString("skin")).isEmpty()) {
					skin_name = "accurate_fredbear_blue";
				} else if ((entity.getPersistentData().getString("skin")).equals("accurate_fredbear_blue")) {
					skin_name = "accurate_fredbear_purple";
				} else if ((entity.getPersistentData().getString("skin")).equals("accurate_fredbear_purple")) {
					skin_name = "accurate_nightbear";
				} else if ((entity.getPersistentData().getString("skin")).equals("accurate_nightbear")) {
					skin_name = "accurate_fredbear";
				}
			} else if (entity instanceof SpringbonnieDayEntity) {
				if ((entity.getPersistentData().getString("skin")).equals("accurate_spring-bonnie") || (entity.getPersistentData().getString("skin")).isEmpty()) {
					skin_name = "accurate_spring-bonnie_01";
				} else if ((entity.getPersistentData().getString("skin")).equals("accurate_spring-bonnie_01")) {
					skin_name = "accurate_spring-bonnie";
				}
			}
		}
	}
}
