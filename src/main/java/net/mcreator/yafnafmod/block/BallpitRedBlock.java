
package net.mcreator.yafnafmod.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;

public class BallpitRedBlock extends Block {
	public BallpitRedBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.BONE_BLOCK).strength(1f, 10f).noCollission());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean isLadder(BlockState state, LevelReader world, BlockPos pos, LivingEntity entity) {
		return true;
	}
}
