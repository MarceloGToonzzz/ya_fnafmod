
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
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.procedures.State1CycleProcedure;

import java.util.List;

public class PhantomCupcakeFmsBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 1);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public PhantomCupcakeFmsBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.WOOL).strength(0.5f, 5f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("block.ya_fnafmod.phantom_cupcake_fms.description_0"));
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
			default -> Shapes.or(box(3, 0, 3, 13, 1, 13), box(5, 1, 4.5, 12, 5, 11.5), box(5.5, 5, 5, 11.5, 6, 11), box(5, 5, 4.5, 12, 10, 11.5), box(4.75, 3.75, 4.25, 12.25, 10.25, 11.75), box(9.1, 2.75, 10.575, 11.1, 4.75, 11.575),
					box(5.9, 2.75, 10.575, 7.9, 4.75, 11.575), box(7.75, 10, 7.5, 8.75, 14, 8.5), box(5.5, 4, 5, 11.5, 5, 11));
			case NORTH -> Shapes.or(box(3, 0, 3, 13, 1, 13), box(4, 1, 4.5, 11, 5, 11.5), box(4.5, 5, 5, 10.5, 6, 11), box(4, 5, 4.5, 11, 10, 11.5), box(3.75, 3.75, 4.25, 11.25, 10.25, 11.75), box(4.9, 2.75, 4.425, 6.9, 4.75, 5.425),
					box(8.1, 2.75, 4.425, 10.1, 4.75, 5.425), box(7.25, 10, 7.5, 8.25, 14, 8.5), box(4.5, 4, 5, 10.5, 5, 11));
			case EAST -> Shapes.or(box(3, 0, 3, 13, 1, 13), box(4.5, 1, 4, 11.5, 5, 11), box(5, 5, 4.5, 11, 6, 10.5), box(4.5, 5, 4, 11.5, 10, 11), box(4.25, 3.75, 3.75, 11.75, 10.25, 11.25), box(10.575, 2.75, 4.9, 11.575, 4.75, 6.9),
					box(10.575, 2.75, 8.1, 11.575, 4.75, 10.1), box(7.5, 10, 7.25, 8.5, 14, 8.25), box(5, 4, 4.5, 11, 5, 10.5));
			case WEST -> Shapes.or(box(3, 0, 3, 13, 1, 13), box(4.5, 1, 5, 11.5, 5, 12), box(5, 5, 5.5, 11, 6, 11.5), box(4.5, 5, 5, 11.5, 10, 12), box(4.25, 3.75, 4.75, 11.75, 10.25, 12.25), box(4.425, 2.75, 9.1, 5.425, 4.75, 11.1),
					box(4.425, 2.75, 5.9, 5.425, 4.75, 7.9), box(7.5, 10, 7.75, 8.5, 14, 8.75), box(5, 4, 5.5, 11, 5, 11.5));
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
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		State1CycleProcedure.execute(world, x, y, z, blockstate, entity);
		return InteractionResult.SUCCESS;
	}
}
