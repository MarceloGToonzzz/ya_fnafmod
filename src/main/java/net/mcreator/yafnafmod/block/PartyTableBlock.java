
package net.mcreator.yafnafmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.procedures.PartyTableNeighbourBlockChangesProcedure;

public class PartyTableBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 3);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public PartyTableBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(1f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				if (s.getValue(BLOCKSTATE) == 3)
					return 0;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);
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
		if (state.getValue(BLOCKSTATE) == 1) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(13, 0, 13, 15, 14, 15), box(1, 0, 13, 3, 16, 15));
				case NORTH -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 0, 1, 3, 14, 3), box(13, 0, 1, 15, 16, 3));
				case EAST -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(13, 0, 1, 15, 14, 3), box(13, 0, 13, 15, 16, 15));
				case WEST -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 0, 13, 3, 14, 15), box(1, 0, 1, 3, 16, 3));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 14, 0, 16, 16, 16);
				case NORTH -> box(0, 14, 0, 16, 16, 16);
				case EAST -> box(0, 14, 0, 16, 16, 16);
				case WEST -> box(0, 14, 0, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 0, 13, 3, 14, 15));
				case NORTH -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(13, 0, 1, 15, 14, 3));
				case EAST -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(13, 0, 13, 15, 14, 15));
				case WEST -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 0, 1, 3, 14, 3));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(13, 0, 13, 15, 14, 15), box(1, 0, 1, 3, 14, 15), box(13, 0, 2, 15, 14, 3), box(1, 0, 1, 3, 14, 3));
			case NORTH -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 0, 1, 3, 14, 3), box(13, 0, 1, 15, 14, 15), box(1, 0, 13, 3, 14, 14), box(13, 0, 13, 15, 14, 15));
			case EAST -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(13, 0, 1, 15, 14, 3), box(1, 0, 13, 15, 14, 15), box(2, 0, 1, 3, 14, 3), box(1, 0, 13, 3, 14, 15));
			case WEST -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(1, 0, 13, 3, 14, 15), box(1, 0, 1, 15, 14, 3), box(13, 0, 13, 14, 14, 15), box(13, 0, 1, 15, 14, 3));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, BLOCKSTATE);
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

	@Override
	public BlockPathTypes getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return BlockPathTypes.BLOCKED;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		PartyTableNeighbourBlockChangesProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		PartyTableNeighbourBlockChangesProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
