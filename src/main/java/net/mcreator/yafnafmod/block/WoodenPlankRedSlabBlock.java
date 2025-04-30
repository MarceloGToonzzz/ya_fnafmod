
package net.mcreator.yafnafmod.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class WoodenPlankRedSlabBlock extends SlabBlock {
	public WoodenPlankRedSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(3f, 2f).dynamicShape());
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 5;
	}
}
