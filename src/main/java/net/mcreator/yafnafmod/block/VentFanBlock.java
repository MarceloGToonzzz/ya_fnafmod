
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
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class VentFanBlock extends Block {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public VentFanBlock() {
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
			default -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(15, 1, 0, 16, 15, 16), box(0, 1, 0, 1, 15, 16), box(-1, -1, 15, 17, 17, 17));
			case NORTH -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 0, 1, 15, 16), box(15, 1, 0, 16, 15, 16), box(-1, -1, -1, 17, 17, 1));
			case EAST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 0, 16, 15, 1), box(0, 1, 15, 16, 15, 16), box(15, -1, -1, 17, 17, 17));
			case WEST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 15, 16, 15, 16), box(0, 1, 0, 16, 15, 1), box(-1, -1, -1, 1, 17, 17));
			case UP -> Shapes.or(box(0, 0, 0, 16, 16, 1), box(0, 0, 15, 16, 16, 16), box(0, 0, 1, 1, 16, 15), box(15, 0, 1, 16, 16, 15), box(-1, 15, -1, 17, 17, 17));
			case DOWN -> Shapes.or(box(0, 0, 15, 16, 16, 16), box(0, 0, 0, 16, 16, 1), box(0, 0, 1, 1, 16, 15), box(15, 0, 1, 16, 16, 15), box(-1, -1, -1, 17, 1, 17));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getClickedFace());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}
