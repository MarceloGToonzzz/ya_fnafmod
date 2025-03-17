package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

public class CheckIfHasAnimationProcedure {
	public static boolean execute(BlockState blockstate) {
		boolean do_sound = false;
		boolean result = false;
		if (!(blockstate.getBlock() == YaFnafmodModBlocks.MANGLE_BLOCK.get()) && !(ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString()).contains("withered")
				&& !(ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString()).contains("broken_")) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
