package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.YaFnafmodMod;

public class HeadlightBlockBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		YaFnafmodMod.queueServerWork(6, () -> {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		});
	}
}
