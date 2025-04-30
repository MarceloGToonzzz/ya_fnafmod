
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

public class OfficeDeskFnaf1EmptyBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public OfficeDeskFnaf1EmptyBlock() {
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
			default -> Shapes.or(box(-16, 14, 1, 32, 16, 16), box(-13, 6, 3, 2, 14, 15), box(-14, 3, 2, 30, 14, 3), box(-14.5, 0, 1, -13.5, 14, 16), box(29.5, 0, 1, 30.5, 14, 16));
			case NORTH -> Shapes.or(box(-16, 14, 0, 32, 16, 15), box(14, 6, 1, 29, 14, 13), box(-14, 3, 13, 30, 14, 14), box(29.5, 0, 0, 30.5, 14, 15), box(-14.5, 0, 0, -13.5, 14, 15));
			case EAST -> Shapes.or(box(1, 14, -16, 16, 16, 32), box(3, 6, 14, 15, 14, 29), box(2, 3, -14, 3, 14, 30), box(1, 0, 29.5, 16, 14, 30.5), box(1, 0, -14.5, 16, 14, -13.5));
			case WEST -> Shapes.or(box(0, 14, -16, 15, 16, 32), box(1, 6, -13, 13, 14, 2), box(13, 3, -14, 14, 14, 30), box(0, 0, -14.5, 15, 14, -13.5), box(0, 0, 29.5, 15, 14, 30.5));
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
