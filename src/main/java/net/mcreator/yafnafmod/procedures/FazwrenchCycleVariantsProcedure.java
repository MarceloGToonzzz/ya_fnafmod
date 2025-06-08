package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

public class FazwrenchCycleVariantsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FAZWRENCH.get()) {
			if (blockstate.getBlock() == YaFnafmodModBlocks.COAT_HANGER.get()) {
				variant = 2;
			} else if (blockstate.getBlock() == YaFnafmodModBlocks.HANGING_SHIRT.get() || blockstate.getBlock() == YaFnafmodModBlocks.SHIRT_DISPLAY.get() || blockstate.getBlock() == YaFnafmodModBlocks.SHIRT_PILE.get()) {
				variant = 3;
			} else if (blockstate.getBlock() == YaFnafmodModBlocks.DOORFRAME_DARK.get() || blockstate.getBlock() == YaFnafmodModBlocks.DOORFRAME_LIGHT.get()) {
				variant = 4;
			} else if (blockstate.getBlock() == YaFnafmodModBlocks.WALL_PIPES.get() || blockstate.getBlock() == YaFnafmodModBlocks.WALL_PIPES_RED.get() || blockstate.getBlock() == YaFnafmodModBlocks.WALL_PIPES_YELLOW.get()) {
				variant = 5;
			}
			if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip21 ? blockstate.getValue(_getip21) : -1) != variant) {
				{
					int _value = (int) ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip23 ? blockstate.getValue(_getip23) : -1) + 1);
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		}
	}
}
