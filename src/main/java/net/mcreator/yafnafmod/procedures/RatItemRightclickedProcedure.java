package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResult;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.yafnafmod.item.RatItemItem;

public class RatItemRightclickedProcedure {
	public static InteractionResult execute(ItemStack itemstack) {
		if (!(Mth.nextInt(RandomSource.create(), 1, 9) == 3)) {
			if (itemstack.getItem() instanceof RatItemItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.model.pet");
		} else {
			if (itemstack.getItem() instanceof RatItemItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.model.flip");
		}
		return InteractionResult.SUCCESS;
	}
}
