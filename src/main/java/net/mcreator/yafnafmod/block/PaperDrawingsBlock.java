
package net.mcreator.yafnafmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.procedures.PaperDrawingsBlockAddedProcedure;

public class PaperDrawingsBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 36);
	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public PaperDrawingsBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.AZALEA_LEAVES).strength(1f, 10f).lightLevel(s -> (new Object() {
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
				if (s.getValue(BLOCKSTATE) == 21)
					return 0;
				if (s.getValue(BLOCKSTATE) == 22)
					return 0;
				if (s.getValue(BLOCKSTATE) == 23)
					return 0;
				if (s.getValue(BLOCKSTATE) == 24)
					return 0;
				if (s.getValue(BLOCKSTATE) == 25)
					return 0;
				if (s.getValue(BLOCKSTATE) == 26)
					return 0;
				if (s.getValue(BLOCKSTATE) == 27)
					return 0;
				if (s.getValue(BLOCKSTATE) == 28)
					return 0;
				if (s.getValue(BLOCKSTATE) == 29)
					return 0;
				if (s.getValue(BLOCKSTATE) == 30)
					return 0;
				if (s.getValue(BLOCKSTATE) == 31)
					return 0;
				if (s.getValue(BLOCKSTATE) == 32)
					return 0;
				if (s.getValue(BLOCKSTATE) == 33)
					return 0;
				if (s.getValue(BLOCKSTATE) == 34)
					return 0;
				if (s.getValue(BLOCKSTATE) == 35)
					return 0;
				if (s.getValue(BLOCKSTATE) == 36)
					return 0;
				return 0;
			}
		}.getLightLevel())).noCollission().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> box(0, 0, 0, 16, 16, 0.1);
			case NORTH -> box(0, 0, 15.9, 16, 16, 16);
			case EAST -> box(0, 0, 0, 0.1, 16, 16);
			case WEST -> box(15.9, 0, 0, 16, 16, 16);
			case UP -> box(0, 0, 0, 16, 0.1, 16);
			case DOWN -> box(0, 15.9, 0, 16, 16, 16);
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, BLOCKSTATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getNearestLookingDirection().getOpposite());
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
		PaperDrawingsBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
