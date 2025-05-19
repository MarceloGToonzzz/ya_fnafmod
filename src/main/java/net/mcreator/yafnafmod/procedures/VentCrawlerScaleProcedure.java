package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

public class VentCrawlerScaleProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double scale = 0;
		sx = -2;
		found = false;
		for (int index0 = 0; index0 < 6; index0++) {
			sy = -2;
			for (int index1 = 0; index1 < 6; index1++) {
				sz = -2;
				for (int index2 = 0; index2 < 6; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == YaFnafmodModBlocks.VENT_SHAFT.get() || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.AIR) && !((world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.AIR)) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			scale = 0.45;
		} else {
			scale = 1;
		}
		return scale;
	}
}
