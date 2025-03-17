
package net.mcreator.yafnafmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
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
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.procedures.PresentsOnBlockRightClickedProcedure;
import net.mcreator.yafnafmod.procedures.PresentsBlockIsPlacedByProcedure;

import java.util.List;

public class PresentsBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 11);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final IntegerProperty COUNT = IntegerProperty.create("count", 0, 4);

	public PresentsBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(1f, 10f).lightLevel(s -> (new Object() {
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
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(COUNT, 1));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Stackable up to 4!"));
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
				default -> box(4, 0, 3, 12, 8, 11);
				case NORTH -> box(4, 0, 5, 12, 8, 13);
				case EAST -> box(3, 0, 4, 11, 8, 12);
				case WEST -> box(5, 0, 4, 13, 8, 12);
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> box(4, 0, 3, 12, 8, 11);
				case NORTH -> box(4, 0, 5, 12, 8, 13);
				case EAST -> box(3, 0, 4, 11, 8, 12);
				case WEST -> box(5, 0, 4, 13, 8, 12);
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> box(4, 0, 3, 12, 8, 11);
				case NORTH -> box(4, 0, 5, 12, 8, 13);
				case EAST -> box(3, 0, 4, 11, 8, 12);
				case WEST -> box(5, 0, 4, 13, 8, 12);
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(-1, 0, 3, 7, 8, 11), box(10, 0, 6, 18, 8, 14));
				case NORTH -> Shapes.or(box(9, 0, 5, 17, 8, 13), box(-2, 0, 2, 6, 8, 10));
				case EAST -> Shapes.or(box(3, 0, 9, 11, 8, 17), box(6, 0, -2, 14, 8, 6));
				case WEST -> Shapes.or(box(5, 0, -1, 13, 8, 7), box(2, 0, 10, 10, 8, 18));
			};
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(-1, 0, 3, 7, 8, 11), box(10, 0, 6, 18, 8, 14));
				case NORTH -> Shapes.or(box(9, 0, 5, 17, 8, 13), box(-2, 0, 2, 6, 8, 10));
				case EAST -> Shapes.or(box(3, 0, 9, 11, 8, 17), box(6, 0, -2, 14, 8, 6));
				case WEST -> Shapes.or(box(5, 0, -1, 13, 8, 7), box(2, 0, 10, 10, 8, 18));
			};
		}
		if (state.getValue(BLOCKSTATE) == 6) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 0, 2, 8, 8, 10), box(11, 0, 2, 19, 8, 10), box(6, 8, 1, 14, 16, 9));
				case NORTH -> Shapes.or(box(8, 0, 6, 16, 8, 14), box(-3, 0, 6, 5, 8, 14), box(2, 8, 7, 10, 16, 15));
				case EAST -> Shapes.or(box(2, 0, 8, 10, 8, 16), box(2, 0, -3, 10, 8, 5), box(1, 8, 2, 9, 16, 10));
				case WEST -> Shapes.or(box(6, 0, 0, 14, 8, 8), box(6, 0, 11, 14, 8, 19), box(7, 8, 6, 15, 16, 14));
			};
		}
		if (state.getValue(BLOCKSTATE) == 7) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 0, 2, 8, 8, 10), box(11, 0, 2, 19, 8, 10), box(6, 8, 1, 14, 16, 9));
				case NORTH -> Shapes.or(box(8, 0, 6, 16, 8, 14), box(-3, 0, 6, 5, 8, 14), box(2, 8, 7, 10, 16, 15));
				case EAST -> Shapes.or(box(2, 0, 8, 10, 8, 16), box(2, 0, -3, 10, 8, 5), box(1, 8, 2, 9, 16, 10));
				case WEST -> Shapes.or(box(6, 0, 0, 14, 8, 8), box(6, 0, 11, 14, 8, 19), box(7, 8, 6, 15, 16, 14));
			};
		}
		if (state.getValue(BLOCKSTATE) == 8) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 0, 2, 8, 8, 10), box(11, 0, 2, 19, 8, 10), box(6, 8, 1, 14, 16, 9));
				case NORTH -> Shapes.or(box(8, 0, 6, 16, 8, 14), box(-3, 0, 6, 5, 8, 14), box(2, 8, 7, 10, 16, 15));
				case EAST -> Shapes.or(box(2, 0, 8, 10, 8, 16), box(2, 0, -3, 10, 8, 5), box(1, 8, 2, 9, 16, 10));
				case WEST -> Shapes.or(box(6, 0, 0, 14, 8, 8), box(6, 0, 11, 14, 8, 19), box(7, 8, 6, 15, 16, 14));
			};
		}
		if (state.getValue(BLOCKSTATE) == 9) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 0, 3, 8, 8, 11), box(11, 0, 2, 19, 8, 10), box(0, 8, 1, 8, 16, 9), box(10, 8, 1, 18, 16, 9));
				case NORTH -> Shapes.or(box(8, 0, 5, 16, 8, 13), box(-3, 0, 6, 5, 8, 14), box(8, 8, 7, 16, 16, 15), box(-2, 8, 7, 6, 16, 15));
				case EAST -> Shapes.or(box(3, 0, 8, 11, 8, 16), box(2, 0, -3, 10, 8, 5), box(1, 8, 8, 9, 16, 16), box(1, 8, -2, 9, 16, 6));
				case WEST -> Shapes.or(box(5, 0, 0, 13, 8, 8), box(6, 0, 11, 14, 8, 19), box(7, 8, 0, 15, 16, 8), box(7, 8, 10, 15, 16, 18));
			};
		}
		if (state.getValue(BLOCKSTATE) == 10) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 0, 3, 8, 8, 11), box(11, 0, 2, 19, 8, 10), box(0, 8, 1, 8, 16, 9), box(10, 8, 1, 18, 16, 9));
				case NORTH -> Shapes.or(box(8, 0, 5, 16, 8, 13), box(-3, 0, 6, 5, 8, 14), box(8, 8, 7, 16, 16, 15), box(-2, 8, 7, 6, 16, 15));
				case EAST -> Shapes.or(box(3, 0, 8, 11, 8, 16), box(2, 0, -3, 10, 8, 5), box(1, 8, 8, 9, 16, 16), box(1, 8, -2, 9, 16, 6));
				case WEST -> Shapes.or(box(5, 0, 0, 13, 8, 8), box(6, 0, 11, 14, 8, 19), box(7, 8, 0, 15, 16, 8), box(7, 8, 10, 15, 16, 18));
			};
		}
		if (state.getValue(BLOCKSTATE) == 11) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 0, 3, 8, 8, 11), box(11, 0, 2, 19, 8, 10), box(0, 8, 1, 8, 16, 9), box(10, 8, 1, 18, 16, 9));
				case NORTH -> Shapes.or(box(8, 0, 5, 16, 8, 13), box(-3, 0, 6, 5, 8, 14), box(8, 8, 7, 16, 16, 15), box(-2, 8, 7, 6, 16, 15));
				case EAST -> Shapes.or(box(3, 0, 8, 11, 8, 16), box(2, 0, -3, 10, 8, 5), box(1, 8, 8, 9, 16, 16), box(1, 8, -2, 9, 16, 6));
				case WEST -> Shapes.or(box(5, 0, 0, 13, 8, 8), box(6, 0, 11, 14, 8, 19), box(7, 8, 0, 15, 16, 8), box(7, 8, 10, 15, 16, 18));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> box(4, 0, 3, 12, 8, 11);
			case NORTH -> box(4, 0, 5, 12, 8, 13);
			case EAST -> box(3, 0, 4, 11, 8, 12);
			case WEST -> box(5, 0, 4, 13, 8, 12);
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, COUNT, BLOCKSTATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(COUNT, 1);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
		super.setPlacedBy(world, pos, blockstate, entity, itemstack);
		PresentsBlockIsPlacedByProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		PresentsOnBlockRightClickedProcedure.execute(world, x, y, z, blockstate, entity);
		return InteractionResult.SUCCESS;
	}
}
