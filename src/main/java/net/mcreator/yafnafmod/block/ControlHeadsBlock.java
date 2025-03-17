
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

public class ControlHeadsBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public ControlHeadsBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(1, 2, 8.5, 7, 8, 14.5), box(9, 2.5, 8, 15, 8.5, 14), box(5, 4, 1.5, 11, 10, 7.5), box(3, 0, 10.5, 5, 4, 12.5), box(11, 0, 10, 13, 4, 12), box(7, 0, 3.5, 9, 4, 5.5));
			case NORTH -> Shapes.or(box(9, 2, 1.5, 15, 8, 7.5), box(1, 2.5, 2, 7, 8.5, 8), box(5, 4, 8.5, 11, 10, 14.5), box(11, 0, 3.5, 13, 4, 5.5), box(3, 0, 4, 5, 4, 6), box(7, 0, 10.5, 9, 4, 12.5));
			case EAST -> Shapes.or(box(8.5, 2, 9, 14.5, 8, 15), box(8, 2.5, 1, 14, 8.5, 7), box(1.5, 4, 5, 7.5, 10, 11), box(10.5, 0, 11, 12.5, 4, 13), box(10, 0, 3, 12, 4, 5), box(3.5, 0, 7, 5.5, 4, 9));
			case WEST -> Shapes.or(box(1.5, 2, 1, 7.5, 8, 7), box(2, 2.5, 9, 8, 8.5, 15), box(8.5, 4, 5, 14.5, 10, 11), box(3.5, 0, 3, 5.5, 4, 5), box(4, 0, 11, 6, 4, 13), box(10.5, 0, 7, 12.5, 4, 9));
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
