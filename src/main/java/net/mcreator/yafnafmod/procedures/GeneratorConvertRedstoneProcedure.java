package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModGameRules;
import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

public class GeneratorConvertRedstoneProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double result = 0;
		if (blockstate.getBlock() == YaFnafmodModBlocks.GENERATOR_BLOCK.get()) {
			result = (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "energy")) * 15;
			result = result / (world.getLevelData().getGameRules().getInt(YaFnafmodModGameRules.GENERATOR_MAX_CAPACITY));
			result = Math.ceil(result);
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.CREATIVE_GENERATOR_BLOCK.get()) {
			result = 15;
		}
		return result;
	}
}
