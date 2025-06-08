
package net.mcreator.yafnafmod.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class DarkWoodenStepsBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public DarkWoodenStepsBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(13, 0, 9, 15, 4, 11), box(1, 0, 9, 3, 4, 11), box(0, 4, 7, 16, 6, 13), box(0, 9, -1, 16, 11, 5), box(13, 0, 1, 15, 9, 3), box(1, 0, 1, 3, 9, 3));
			case NORTH -> Shapes.or(box(1, 0, 5, 3, 4, 7), box(13, 0, 5, 15, 4, 7), box(0, 4, 3, 16, 6, 9), box(0, 9, 11, 16, 11, 17), box(1, 0, 13, 3, 9, 15), box(13, 0, 13, 15, 9, 15));
			case EAST -> Shapes.or(box(9, 0, 1, 11, 4, 3), box(9, 0, 13, 11, 4, 15), box(7, 4, 0, 13, 6, 16), box(-1, 9, 0, 5, 11, 16), box(1, 0, 1, 3, 9, 3), box(1, 0, 13, 3, 9, 15));
			case WEST -> Shapes.or(box(5, 0, 13, 7, 4, 15), box(5, 0, 1, 7, 4, 3), box(3, 4, 0, 9, 6, 16), box(11, 9, 0, 17, 11, 16), box(13, 0, 13, 15, 9, 15), box(13, 0, 1, 15, 9, 3));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}
