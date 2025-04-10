package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SpawnInWaterProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean wawa = false;
		wawa = false;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER) {
			wawa = true;
		}
		return wawa;
	}
}
