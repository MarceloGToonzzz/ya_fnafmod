package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LeverTriggerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double Radius = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		Radius = 4;
		sx = Radius * (-0.5);
		found = false;
		for (int index0 = 0; index0 < (int) Radius; index0++) {
			sy = Radius * (-0.5);
			if (found == false) {
				for (int index1 = 0; index1 < (int) Radius; index1++) {
					if (found == false) {
						sz = Radius * (-0.5);
						for (int index2 = 0; index2 < (int) Radius; index2++) {
							if (found == false) {
								if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.LEVER
										&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock().getStateDefinition().getProperty("powered") instanceof BooleanProperty _getbp3
												&& (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getValue(_getbp3)) == true) {
									found = true;
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.LEVER.defaultBlockState(), 3);
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
	}
}
