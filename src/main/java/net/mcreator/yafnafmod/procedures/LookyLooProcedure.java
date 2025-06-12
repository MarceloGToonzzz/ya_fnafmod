package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LookyLooProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double Radius = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		Radius = 20;
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
								if (((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock().getStateDefinition().getProperty("powered") instanceof BooleanProperty _getbp1
										&& (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getValue(_getbp1)) == true && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.LEVER) {
									found = true;
									return "X" + Math.floor(x + sx) + "X" + "Y" + Math.floor(y + sy) + "Y" + "Z" + Math.floor(z + sz) + "Z";
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
		return "X" + 0 + "X" + "Y" + 0 + "Y" + "Z" + 0 + "Z";
	}
}
