package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class UpdateBlocksAroundProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double fdagd = 0;
		fdagd = -1;
		for (int index0 = 0; index0 < 3; index0++) {
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x + 1, y + fdagd, z), _level.getBlockState(BlockPos.containing(x + 1, y + fdagd, z)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x - 1, y + fdagd, z), _level.getBlockState(BlockPos.containing(x - 1, y + fdagd, z)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y + fdagd, z + 1), _level.getBlockState(BlockPos.containing(x, y + fdagd, z + 1)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y + fdagd, z - 1), _level.getBlockState(BlockPos.containing(x, y + fdagd, z - 1)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x + 1, y + fdagd, z + 1), _level.getBlockState(BlockPos.containing(x + 1, y + fdagd, z + 1)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x - 1, y + fdagd, z - 1), _level.getBlockState(BlockPos.containing(x - 1, y + fdagd, z - 1)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x + 1, y + fdagd, z - 1), _level.getBlockState(BlockPos.containing(x + 1, y + fdagd, z - 1)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x - 1, y + fdagd, z + 1), _level.getBlockState(BlockPos.containing(x - 1, y + fdagd, z + 1)).getBlock());
			fdagd = fdagd + 1;
		}
	}
}
