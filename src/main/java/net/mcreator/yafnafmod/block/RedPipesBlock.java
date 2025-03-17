
package net.mcreator.yafnafmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.procedures.MetalPipesNeighbourBlockChangesProcedure;

public class RedPipesBlock extends Block implements SimpleWaterloggedBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 20);
	public static final DirectionProperty FACING = DirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public RedPipesBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				if (s.getValue(BLOCKSTATE) == 3)
					return 0;
				if (s.getValue(BLOCKSTATE) == 4)
					return 0;
				if (s.getValue(BLOCKSTATE) == 5)
					return 0;
				if (s.getValue(BLOCKSTATE) == 6)
					return 0;
				if (s.getValue(BLOCKSTATE) == 7)
					return 0;
				if (s.getValue(BLOCKSTATE) == 8)
					return 0;
				if (s.getValue(BLOCKSTATE) == 9)
					return 0;
				if (s.getValue(BLOCKSTATE) == 10)
					return 0;
				if (s.getValue(BLOCKSTATE) == 11)
					return 0;
				if (s.getValue(BLOCKSTATE) == 12)
					return 0;
				if (s.getValue(BLOCKSTATE) == 13)
					return 0;
				if (s.getValue(BLOCKSTATE) == 14)
					return 0;
				if (s.getValue(BLOCKSTATE) == 15)
					return 0;
				if (s.getValue(BLOCKSTATE) == 16)
					return 0;
				if (s.getValue(BLOCKSTATE) == 17)
					return 0;
				if (s.getValue(BLOCKSTATE) == 18)
					return 0;
				if (s.getValue(BLOCKSTATE) == 19)
					return 0;
				if (s.getValue(BLOCKSTATE) == 20)
					return 0;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
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
				default -> box(2, 2, 2, 16, 14, 16);
				case NORTH -> box(0, 2, 0, 14, 14, 14);
				case EAST -> box(2, 2, 0, 16, 14, 14);
				case WEST -> box(0, 2, 2, 14, 14, 16);
				case UP -> box(0, 2, 2, 14, 16, 14);
				case DOWN -> box(0, 0, 2, 14, 14, 14);
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> box(2, 2, 2, 14, 16, 16);
				case NORTH -> box(2, 2, 0, 14, 16, 14);
				case EAST -> box(2, 2, 2, 16, 16, 14);
				case WEST -> box(0, 2, 2, 14, 16, 14);
				case UP -> box(2, 2, 2, 14, 16, 16);
				case DOWN -> box(2, 0, 0, 14, 14, 14);
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> box(2, 0, 2, 14, 14, 16);
				case NORTH -> box(2, 0, 0, 14, 14, 14);
				case EAST -> box(2, 0, 2, 16, 14, 14);
				case WEST -> box(0, 0, 2, 14, 14, 14);
				case UP -> box(2, 2, 0, 14, 16, 14);
				case DOWN -> box(2, 0, 2, 14, 14, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 2, 2, 16, 14, 16);
				case NORTH -> box(0, 2, 0, 16, 14, 14);
				case EAST -> box(2, 2, 0, 16, 14, 16);
				case WEST -> box(0, 2, 0, 14, 14, 16);
				case UP -> box(0, 2, 2, 16, 16, 14);
				case DOWN -> box(0, 0, 2, 16, 14, 14);
			};
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return switch (state.getValue(FACING)) {
				default -> box(2, 0, 2, 14, 14, 16);
				case NORTH -> box(2, 0, 0, 14, 14, 14);
				case EAST -> box(2, 0, 2, 16, 14, 14);
				case WEST -> box(0, 0, 2, 14, 14, 14);
				case UP -> box(2, 2, 0, 14, 16, 14);
				case DOWN -> box(2, 0, 2, 14, 14, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 6) {
			return switch (state.getValue(FACING)) {
				default -> box(2, 0, 2, 14, 16, 16);
				case NORTH -> box(2, 0, 0, 14, 16, 14);
				case EAST -> box(2, 0, 2, 16, 16, 14);
				case WEST -> box(0, 0, 2, 14, 16, 14);
				case UP -> box(2, 2, 0, 14, 16, 16);
				case DOWN -> box(2, 0, 0, 14, 14, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 7) {
			return switch (state.getValue(FACING)) {
				default -> box(2, 0, 0, 14, 16, 16);
				case NORTH -> box(2, 0, 0, 14, 16, 16);
				case EAST -> box(0, 0, 2, 16, 16, 14);
				case WEST -> box(0, 0, 2, 16, 16, 14);
				case UP -> box(2, 0, 0, 14, 16, 16);
				case DOWN -> box(2, 0, 0, 14, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 8) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 2, 0, 16, 14, 16);
				case NORTH -> box(0, 2, 0, 16, 14, 16);
				case EAST -> box(0, 2, 0, 16, 14, 16);
				case WEST -> box(0, 2, 0, 16, 14, 16);
				case UP -> box(0, 0, 2, 16, 16, 14);
				case DOWN -> box(0, 0, 2, 16, 16, 14);
			};
		}
		if (state.getValue(BLOCKSTATE) == 9) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 2, 0, 16, 16, 16);
				case NORTH -> box(0, 2, 0, 16, 16, 16);
				case EAST -> box(0, 2, 0, 16, 16, 16);
				case WEST -> box(0, 2, 0, 16, 16, 16);
				case UP -> box(0, 0, 2, 16, 16, 16);
				case DOWN -> box(0, 0, 0, 16, 16, 14);
			};
		}
		if (state.getValue(BLOCKSTATE) == 10) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 14, 16);
				case NORTH -> box(0, 0, 0, 16, 14, 16);
				case EAST -> box(0, 0, 0, 16, 14, 16);
				case WEST -> box(0, 0, 0, 16, 14, 16);
				case UP -> box(0, 0, 0, 16, 16, 14);
				case DOWN -> box(0, 0, 2, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 11) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 16, 16);
				case NORTH -> box(0, 0, 0, 16, 16, 16);
				case EAST -> box(0, 0, 0, 16, 16, 16);
				case WEST -> box(0, 0, 0, 16, 16, 16);
				case UP -> box(0, 0, 0, 16, 16, 16);
				case DOWN -> box(0, 0, 0, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 12) {
			return switch (state.getValue(FACING)) {
				default -> box(3, 3, 0, 13, 13, 16);
				case NORTH -> box(3, 3, 0, 13, 13, 16);
				case EAST -> box(0, 3, 3, 16, 13, 13);
				case WEST -> box(0, 3, 3, 16, 13, 13);
				case UP -> box(3, 0, 3, 13, 16, 13);
				case DOWN -> box(3, 0, 3, 13, 16, 13);
			};
		}
		if (state.getValue(BLOCKSTATE) == 13) {
			return switch (state.getValue(FACING)) {
				default -> box(3, 3, 0, 13, 13, 16);
				case NORTH -> box(3, 3, 0, 13, 13, 16);
				case EAST -> box(0, 3, 3, 16, 13, 13);
				case WEST -> box(0, 3, 3, 16, 13, 13);
				case UP -> box(3, 0, 3, 13, 16, 13);
				case DOWN -> box(3, 0, 3, 13, 16, 13);
			};
		}
		if (state.getValue(BLOCKSTATE) == 14) {
			return switch (state.getValue(FACING)) {
				default -> box(3, 0, 3, 13, 16, 13);
				case NORTH -> box(3, 0, 3, 13, 16, 13);
				case EAST -> box(3, 0, 3, 13, 16, 13);
				case WEST -> box(3, 0, 3, 13, 16, 13);
				case UP -> box(3, 3, 0, 13, 13, 16);
				case DOWN -> box(3, 3, 0, 13, 13, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 15) {
			return switch (state.getValue(FACING)) {
				default -> box(2, 2, 2, 16, 16, 16);
				case NORTH -> box(0, 2, 0, 14, 16, 14);
				case EAST -> box(2, 2, 0, 16, 16, 14);
				case WEST -> box(0, 2, 2, 14, 16, 16);
				case UP -> box(0, 2, 2, 14, 16, 16);
				case DOWN -> box(0, 0, 0, 14, 14, 14);
			};
		}
		if (state.getValue(BLOCKSTATE) == 16) {
			return switch (state.getValue(FACING)) {
				default -> box(2, 0, 2, 16, 14, 16);
				case NORTH -> box(0, 0, 0, 14, 14, 14);
				case EAST -> box(2, 0, 0, 16, 14, 14);
				case WEST -> box(0, 0, 2, 14, 14, 16);
				case UP -> box(0, 2, 0, 14, 16, 14);
				case DOWN -> box(0, 0, 2, 14, 14, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 17) {
			return switch (state.getValue(FACING)) {
				default -> box(2, 0, 2, 16, 16, 16);
				case NORTH -> box(0, 0, 0, 14, 16, 14);
				case EAST -> box(2, 0, 0, 16, 16, 14);
				case WEST -> box(0, 0, 2, 14, 16, 16);
				case UP -> box(0, 2, 0, 14, 16, 16);
				case DOWN -> box(0, 0, 0, 14, 14, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 18) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 2, 16, 16, 16);
				case NORTH -> box(0, 0, 0, 16, 16, 14);
				case EAST -> box(2, 0, 0, 16, 16, 16);
				case WEST -> box(0, 0, 0, 14, 16, 16);
				case UP -> box(0, 2, 0, 16, 16, 16);
				case DOWN -> box(0, 0, 0, 16, 14, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 19) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 2, 2, 16, 16, 16);
				case NORTH -> box(0, 2, 0, 16, 16, 14);
				case EAST -> box(2, 2, 0, 16, 16, 16);
				case WEST -> box(0, 2, 0, 14, 16, 16);
				case UP -> box(0, 2, 2, 16, 16, 16);
				case DOWN -> box(0, 0, 0, 16, 14, 14);
			};
		}
		if (state.getValue(BLOCKSTATE) == 20) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 2, 16, 14, 16);
				case NORTH -> box(0, 0, 0, 16, 14, 14);
				case EAST -> box(2, 0, 0, 16, 14, 16);
				case WEST -> box(0, 0, 0, 14, 14, 16);
				case UP -> box(0, 2, 0, 16, 16, 14);
				case DOWN -> box(0, 0, 2, 16, 14, 16);
			};
		}
		return switch (state.getValue(FACING)) {
			default -> box(2, 2, 0, 14, 14, 16);
			case NORTH -> box(2, 2, 0, 14, 14, 16);
			case EAST -> box(0, 2, 2, 16, 14, 14);
			case WEST -> box(0, 2, 2, 16, 14, 14);
			case UP -> box(2, 0, 2, 14, 16, 14);
			case DOWN -> box(2, 0, 2, 14, 16, 14);
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, WATERLOGGED, BLOCKSTATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return super.getStateForPlacement(context).setValue(FACING, context.getClickedFace()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		MetalPipesNeighbourBlockChangesProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
		super.setPlacedBy(world, pos, blockstate, entity, itemstack);
		MetalPipesNeighbourBlockChangesProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
