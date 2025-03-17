
package net.mcreator.yafnafmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
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
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.Containers;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.procedures.SecurityDoorRedstoneOnProcedure;
import net.mcreator.yafnafmod.procedures.SecurityDoorRedstoneOffProcedure;
import net.mcreator.yafnafmod.procedures.SecurityDoorOnTickUpdateProcedure;
import net.mcreator.yafnafmod.procedures.SecurityDoorOnBlockRightClickedProcedure;
import net.mcreator.yafnafmod.block.entity.SecurityVentBlockEntity;

import java.util.List;

public class SecurityVentBlock extends Block implements SimpleWaterloggedBlock, EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 1);
	public static final DirectionProperty FACING = DirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public SecurityVentBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("- Must be connected to a generator block to function!"));
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
				default -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 0, 1, 15, 16), box(15, 1, 0, 16, 15, 16), box(1, 1, 7.5, 15, 15, 8.5));
				case NORTH -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(15, 1, 0, 16, 15, 16), box(0, 1, 0, 1, 15, 16), box(1, 1, 7.5, 15, 15, 8.5));
				case EAST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 15, 16, 15, 16), box(0, 1, 0, 16, 15, 1), box(7.5, 1, 1, 8.5, 15, 15));
				case WEST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 15, 0, 16, 16, 16), box(0, 1, 0, 16, 15, 1), box(0, 1, 15, 16, 15, 16), box(7.5, 1, 1, 8.5, 15, 15));
				case UP -> Shapes.or(box(0, 0, 0, 16, 16, 1), box(0, 0, 15, 16, 16, 16), box(15, 0, 1, 16, 16, 15), box(0, 0, 1, 1, 16, 15), box(1, 7.5, 1, 15, 8.5, 15));
				case DOWN -> Shapes.or(box(0, 0, 15, 16, 16, 16), box(0, 0, 0, 16, 16, 1), box(15, 0, 1, 16, 16, 15), box(0, 0, 1, 1, 16, 15), box(1, 7.5, 1, 15, 8.5, 15));
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

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 10);
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			SecurityDoorRedstoneOnProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
		} else {
			SecurityDoorRedstoneOffProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
		}
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		SecurityDoorOnTickUpdateProcedure.execute(world, x, y, z, blockstate);
		world.scheduleTick(pos, this, 10);
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
		SecurityDoorOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new SecurityVentBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof SecurityVentBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof SecurityVentBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
