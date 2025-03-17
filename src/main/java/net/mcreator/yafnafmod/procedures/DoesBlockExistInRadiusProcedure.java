package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DoesBlockExistInRadiusProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, BlockState block, double radius) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = radius * (-0.5);
		found = false;
		for (int index0 = 0; index0 < (int) radius; index0++) {
			sy = radius * (-0.5);
			if (found == false) {
				for (int index1 = 0; index1 < (int) radius; index1++) {
					if (found == false) {
						sz = radius * (-0.5);
						for (int index2 = 0; index2 < (int) radius; index2++) {
							if (found == false) {
								if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == block.getBlock()) {
									found = true;
								}
								sz = sz + 1;
							}
						}
						sy = sy + 1;
					}
				}
				sx = sx + 1;
			}
		}
		return found;
	}
}
