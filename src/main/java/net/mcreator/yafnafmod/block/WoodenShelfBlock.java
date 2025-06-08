
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

public class WoodenShelfBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public WoodenShelfBlock() {
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
			default -> Shapes.or(box(14, 0, 0, 16, 27, 11), box(-16, 0, 0, -14, 27, 11), box(-14, 0, 1.5, 14, 2, 10.5), box(-14, 24, 1.5, 14, 26, 10.5), box(-14, 18, 1.5, 14, 20, 10.5), box(-14, 11.5, 1.5, 14, 13.5, 10.5),
					box(-14, 5, 1.5, 14, 7, 10.5), box(-14, 0, 0, 14, 27, 2));
			case NORTH -> Shapes.or(box(0, 0, 5, 2, 27, 16), box(30, 0, 5, 32, 27, 16), box(2, 0, 5.5, 30, 2, 14.5), box(2, 24, 5.5, 30, 26, 14.5), box(2, 18, 5.5, 30, 20, 14.5), box(2, 11.5, 5.5, 30, 13.5, 14.5), box(2, 5, 5.5, 30, 7, 14.5),
					box(2, 0, 14, 30, 27, 16));
			case EAST -> Shapes.or(box(0, 0, 0, 11, 27, 2), box(0, 0, 30, 11, 27, 32), box(1.5, 0, 2, 10.5, 2, 30), box(1.5, 24, 2, 10.5, 26, 30), box(1.5, 18, 2, 10.5, 20, 30), box(1.5, 11.5, 2, 10.5, 13.5, 30), box(1.5, 5, 2, 10.5, 7, 30),
					box(0, 0, 2, 2, 27, 30));
			case WEST -> Shapes.or(box(5, 0, 14, 16, 27, 16), box(5, 0, -16, 16, 27, -14), box(5.5, 0, -14, 14.5, 2, 14), box(5.5, 24, -14, 14.5, 26, 14), box(5.5, 18, -14, 14.5, 20, 14), box(5.5, 11.5, -14, 14.5, 13.5, 14),
					box(5.5, 5, -14, 14.5, 7, 14), box(14, 0, -14, 16, 27, 14));
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
