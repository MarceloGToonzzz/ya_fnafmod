package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

public class ColorfulPlatesBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double max = 0;
		if (blockstate.getBlock() == YaFnafmodModBlocks.COLORFUL_PLATES.get()) {
			max = 4;
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.FOIL_PLATES.get()) {
			max = 8;
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.NEON_PLATES.get()) {
			max = 5;
		}
		{
			int _value = Mth.nextInt(RandomSource.create(), 0, (int) max);
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
				world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
		}
	}
}
