package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;

public class FatRightclickedProcedure {
	public static InteractionResult execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return InteractionResult.PASS;
		if (entity.isShiftKeyDown()) {
			if (itemstack.getOrCreateTag().getDouble("state") == 0) {
				itemstack.getOrCreateTag().putDouble("state", 1);
			} else if (itemstack.getOrCreateTag().getDouble("state") == 1) {
				itemstack.getOrCreateTag().putDouble("state", 2);
			} else if (itemstack.getOrCreateTag().getDouble("state") == 2) {
				itemstack.getOrCreateTag().putDouble("state", 0);
			}
		}
		return InteractionResult.CONSUME;
	}
}
