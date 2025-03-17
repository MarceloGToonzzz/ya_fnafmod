
package net.mcreator.yafnafmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
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
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Mob;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;

public class VentShaftBlock extends Block implements SimpleWaterloggedBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 7);
	public static final DirectionProperty FACING = DirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public VentShaftBlock() {
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
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Use the Faz-Wrench to change shape!"));
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
				default -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 0, 1, 15, 16), box(15, 1, 15, 16, 15, 16), box(1, 1, 0, 16, 15, 1));
				case NORTH -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(15, 1, 0, 16, 15, 16), box(0, 1, 0, 1, 15, 1), box(0, 1, 15, 15, 15, 16));
				case EAST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 15, 16, 15, 16), box(15, 1, 0, 16, 15, 1), box(0, 1, 0, 1, 15, 15));
				case WEST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 0, 16, 15, 1), box(0, 1, 15, 1, 15, 16), box(15, 1, 1, 16, 15, 16));
				case UP -> Shapes.or(box(0, 0, 0, 16, 16, 1), box(0, 0, 15, 16, 16, 16), box(15, 0, 1, 16, 16, 15), box(0, 15, 1, 1, 16, 15), box(0, 0, 1, 15, 1, 15));
				case DOWN -> Shapes.or(box(0, 0, 15, 16, 16, 16), box(0, 0, 0, 16, 16, 1), box(15, 0, 1, 16, 16, 15), box(0, 0, 1, 1, 1, 15), box(0, 15, 1, 15, 16, 15));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(15, 1, 0, 16, 15, 16), box(0, 1, 15, 1, 15, 16), box(0, 1, 0, 15, 15, 1));
				case NORTH -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 0, 1, 15, 16), box(15, 1, 0, 16, 15, 1), box(1, 1, 15, 16, 15, 16));
				case EAST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 0, 16, 15, 1), box(15, 1, 15, 16, 15, 16), box(0, 1, 1, 1, 15, 16));
				case WEST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 15, 16, 15, 16), box(0, 1, 0, 1, 15, 1), box(15, 1, 0, 16, 15, 15));
				case UP -> Shapes.or(box(0, 0, 0, 16, 16, 1), box(0, 0, 15, 16, 16, 16), box(0, 0, 1, 1, 16, 15), box(15, 15, 1, 16, 16, 15), box(1, 0, 1, 16, 1, 15));
				case DOWN -> Shapes.or(box(0, 0, 15, 16, 16, 16), box(0, 0, 0, 16, 16, 1), box(0, 0, 1, 1, 16, 15), box(15, 0, 1, 16, 1, 15), box(1, 15, 1, 16, 16, 15));
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 1, 0, 1, 16, 16), box(1, 1, 0, 15, 16, 1), box(15, 1, 0, 16, 16, 16), box(1, 15, 15, 15, 16, 16));
				case NORTH -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(15, 1, 0, 16, 16, 16), box(1, 1, 15, 15, 16, 16), box(0, 1, 0, 1, 16, 16), box(1, 15, 0, 15, 16, 1));
				case EAST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 1, 15, 16, 16, 16), box(0, 1, 1, 1, 16, 15), box(0, 1, 0, 16, 16, 1), box(15, 15, 1, 16, 16, 15));
				case WEST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 1, 0, 16, 16, 1), box(15, 1, 1, 16, 16, 15), box(0, 1, 15, 16, 16, 16), box(0, 15, 1, 1, 16, 15));
				case UP -> Shapes.or(box(0, 0, 0, 16, 16, 1), box(15, 0, 1, 16, 16, 16), box(1, 0, 1, 15, 1, 16), box(0, 0, 1, 1, 16, 16), box(1, 15, 15, 15, 16, 16));
				case DOWN -> Shapes.or(box(0, 0, 15, 16, 16, 16), box(15, 0, 0, 16, 16, 15), box(1, 15, 0, 15, 16, 15), box(0, 0, 0, 1, 16, 15), box(1, 0, 0, 15, 1, 1));
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 15, 1, 15, 16), box(0, 1, 0, 16, 15, 1), box(15, 1, 15, 16, 15, 16));
				case NORTH -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(15, 1, 0, 16, 15, 1), box(0, 1, 15, 16, 15, 16), box(0, 1, 0, 1, 15, 1));
				case EAST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(15, 1, 15, 16, 15, 16), box(0, 1, 0, 1, 15, 16), box(15, 1, 0, 16, 15, 1));
				case WEST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 0, 1, 15, 1), box(15, 1, 0, 16, 15, 16), box(0, 1, 15, 1, 15, 16));
				case UP -> Shapes.or(box(0, 0, 0, 16, 16, 1), box(0, 0, 15, 16, 16, 16), box(15, 15, 1, 16, 16, 15), box(0, 0, 1, 16, 1, 15), box(0, 15, 1, 1, 16, 15));
				case DOWN -> Shapes.or(box(0, 0, 15, 16, 16, 16), box(0, 0, 0, 16, 16, 1), box(15, 0, 1, 16, 1, 15), box(0, 15, 1, 16, 16, 15), box(0, 0, 1, 1, 1, 15));
			};
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(15, 1, 0, 16, 15, 16), box(0, 1, 15, 1, 15, 16), box(0, 1, 0, 1, 15, 1));
				case NORTH -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 0, 1, 15, 16), box(15, 1, 0, 16, 15, 1), box(15, 1, 15, 16, 15, 16));
				case EAST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 0, 16, 15, 1), box(15, 1, 15, 16, 15, 16), box(0, 1, 15, 1, 15, 16));
				case WEST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 15, 16, 15, 16), box(0, 1, 0, 1, 15, 1), box(15, 1, 0, 16, 15, 1));
				case UP -> Shapes.or(box(0, 0, 0, 16, 16, 1), box(0, 0, 15, 16, 16, 16), box(0, 0, 1, 1, 16, 15), box(15, 15, 1, 16, 16, 15), box(15, 0, 1, 16, 1, 15));
				case DOWN -> Shapes.or(box(0, 0, 15, 16, 16, 16), box(0, 0, 0, 16, 16, 1), box(0, 0, 1, 1, 16, 15), box(15, 0, 1, 16, 1, 15), box(15, 15, 1, 16, 16, 15));
			};
		}
		if (state.getValue(BLOCKSTATE) == 6) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 0, 1, 15, 16), box(15, 1, 15, 16, 15, 16), box(15, 1, 0, 16, 15, 1));
				case NORTH -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(15, 1, 0, 16, 15, 16), box(0, 1, 0, 1, 15, 1), box(0, 1, 15, 1, 15, 16));
				case EAST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 15, 16, 15, 16), box(15, 1, 0, 16, 15, 1), box(0, 1, 0, 1, 15, 1));
				case WEST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 0, 16, 15, 1), box(0, 1, 15, 1, 15, 16), box(15, 1, 15, 16, 15, 16));
				case UP -> Shapes.or(box(0, 0, 0, 16, 16, 1), box(0, 0, 15, 16, 16, 16), box(15, 0, 1, 16, 16, 15), box(0, 15, 1, 1, 16, 15), box(0, 0, 1, 1, 1, 15));
				case DOWN -> Shapes.or(box(0, 0, 15, 16, 16, 16), box(0, 0, 0, 16, 16, 1), box(15, 0, 1, 16, 16, 15), box(0, 0, 1, 1, 1, 15), box(0, 15, 1, 1, 16, 15));
			};
		}
		if (state.getValue(BLOCKSTATE) == 7) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 15, 1, 15, 16), box(15, 1, 15, 16, 15, 16), box(0, 1, 0, 1, 15, 1), box(15, 1, 0, 16, 15, 1));
				case NORTH -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(15, 1, 0, 16, 15, 1), box(0, 1, 0, 1, 15, 1), box(15, 1, 15, 16, 15, 16), box(0, 1, 15, 1, 15, 16));
				case EAST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(15, 1, 15, 16, 15, 16), box(15, 1, 0, 16, 15, 1), box(0, 1, 15, 1, 15, 16), box(0, 1, 0, 1, 15, 1));
				case WEST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 0, 1, 15, 1), box(0, 1, 15, 1, 15, 16), box(15, 1, 0, 16, 15, 1), box(15, 1, 15, 16, 15, 16));
				case UP -> Shapes.or(box(0, 0, 0, 16, 16, 1), box(0, 0, 15, 16, 16, 16), box(15, 15, 1, 16, 16, 15), box(0, 15, 1, 1, 16, 15), box(15, 0, 1, 16, 1, 15), box(0, 0, 1, 1, 1, 15));
				case DOWN -> Shapes.or(box(0, 0, 15, 16, 16, 16), box(0, 0, 0, 16, 16, 1), box(15, 0, 1, 16, 1, 15), box(0, 0, 1, 1, 1, 15), box(15, 15, 1, 16, 16, 15), box(0, 15, 1, 1, 16, 15));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 0, 1, 15, 16), box(15, 1, 0, 16, 15, 16));
			case NORTH -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(15, 1, 0, 16, 15, 16), box(0, 1, 0, 1, 15, 16));
			case EAST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 15, 16, 15, 16), box(0, 1, 0, 16, 15, 1));
			case WEST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 0, 16, 15, 1), box(0, 1, 15, 16, 15, 16));
			case UP -> Shapes.or(box(0, 0, 0, 16, 16, 1), box(0, 0, 15, 16, 16, 16), box(15, 0, 1, 16, 16, 15), box(0, 0, 1, 1, 16, 15));
			case DOWN -> Shapes.or(box(0, 0, 15, 16, 16, 16), box(0, 0, 0, 16, 16, 1), box(15, 0, 1, 16, 16, 15), box(0, 0, 1, 1, 16, 15));
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
		return super.getStateForPlacement(context).setValue(FACING, context.getNearestLookingDirection().getOpposite()).setValue(WATERLOGGED, flag);
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
	public BlockPathTypes getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return BlockPathTypes.WALKABLE;
	}
}
