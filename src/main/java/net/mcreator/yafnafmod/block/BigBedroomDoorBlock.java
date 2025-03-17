
package net.mcreator.yafnafmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.procedures.BigDoorOnBlockRightClickedProcedure;
import net.mcreator.yafnafmod.procedures.BigDoorEntityCollidesInTheBlockProcedure;
import net.mcreator.yafnafmod.procedures.BigDoorBlockIsPlacedByProcedure;
import net.mcreator.yafnafmod.procedures.BigDoorBlockDestroyedByPlayerProcedure;
import net.mcreator.yafnafmod.init.YaFnafmodModBlockEntities;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Collections;

public class BigBedroomDoorBlock extends BaseEntityBlock implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 2);
	public static final IntegerProperty ANIMATION = IntegerProperty.create("animation", 0, (int) 1);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public BigBedroomDoorBlock() {
		super(BlockBehaviour.Properties.of()

				.sound(SoundType.WOOD).strength(1f, 10f).lightLevel(s -> (new Object() {
					public int getLightLevel() {
						if (s.getValue(BLOCKSTATE) == 1)
							return 0;
						if (s.getValue(BLOCKSTATE) == 2)
							return 0;
						return 0;
					}
				}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public RenderShape getRenderShape(BlockState state) {
		return RenderShape.ENTITYBLOCK_ANIMATED;
	}

	@Nullable
	@Override
	public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
		return YaFnafmodModBlockEntities.BIG_BEDROOM_DOOR.get().create(blockPos, blockState);
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
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		if (state.getValue(BLOCKSTATE) == 1) {

			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(-17, -16, -1, -15, 33, 17), box(15, -16, -1, 17, 33, 17), box(-17, 31, -1, 17, 33, 17));
				case NORTH -> Shapes.or(box(31, -16, -1, 33, 33, 17), box(-1, -16, -1, 1, 33, 17), box(-1, 31, -1, 33, 33, 17));
				case EAST -> Shapes.or(box(-1, -16, 31, 17, 33, 33), box(-1, -16, -1, 17, 33, 1), box(-1, 31, -1, 17, 33, 33));
				case WEST -> Shapes.or(box(-1, -16, -17, 17, 33, -15), box(-1, -16, 15, 17, 33, 17), box(-1, 31, -17, 17, 33, 17));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {

			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(-17, -16, -1, -15, 33, 17), box(15, -16, -1, 17, 33, 17), box(-17, 31, -1, 17, 33, 17));
				case NORTH -> Shapes.or(box(31, -16, -1, 33, 33, 17), box(-1, -16, -1, 1, 33, 17), box(-1, 31, -1, 33, 33, 17));
				case EAST -> Shapes.or(box(-1, -16, 31, 17, 33, 33), box(-1, -16, -1, 17, 33, 1), box(-1, 31, -1, 17, 33, 33));
				case WEST -> Shapes.or(box(-1, -16, -17, 17, 33, -15), box(-1, -16, 15, 17, 33, 17), box(-1, 31, -17, 17, 33, 17));
			};
		}

		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(-17, -16, -1, -15, 33, 17), box(15, -16, -1, 17, 33, 17), box(-17, 31, -1, 17, 33, 17), box(-16, -16, 7, 16, 32, 9));
			case NORTH -> Shapes.or(box(31, -16, -1, 33, 33, 17), box(-1, -16, -1, 1, 33, 17), box(-1, 31, -1, 33, 33, 17), box(0, -16, 7, 32, 32, 9));
			case EAST -> Shapes.or(box(-1, -16, 31, 17, 33, 33), box(-1, -16, -1, 17, 33, 1), box(-1, 31, -1, 17, 33, 33), box(7, -16, 0, 9, 32, 32));
			case WEST -> Shapes.or(box(-1, -16, -17, 17, 33, -15), box(-1, -16, 15, 17, 33, 17), box(-1, 31, -17, 17, 33, 17), box(7, -16, -16, 9, 32, 16));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(ANIMATION, FACING, BLOCKSTATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		BigDoorBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
		return retval;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		BigDoorEntityCollidesInTheBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate, entity);
	}

	@Override
	public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
		super.setPlacedBy(world, pos, blockstate, entity, itemstack);
		BigDoorBlockIsPlacedByProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
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

		BigDoorOnBlockRightClickedProcedure.execute(world, x, y, z, blockstate, entity);
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}
}
