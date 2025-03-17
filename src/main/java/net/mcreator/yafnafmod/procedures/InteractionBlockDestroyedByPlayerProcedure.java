package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class InteractionBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BigDoorBlockDestroyedByPlayerProcedure.execute(world, x, y - 1, z, world.getBlockState(BlockPos.containing(x, y - 1, z)));
		world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
	}
}
