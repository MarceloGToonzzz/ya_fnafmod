package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

import java.util.Map;

public class GamePaperDrawingsBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double random1 = 0;
		if (blockstate.getBlock() == YaFnafmodModBlocks.PAPER_DRAWINGS_FNAF_1.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = (new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(YaFnafmodModBlocks.PAPER_DRAWINGS.get().defaultBlockState(), "blockstate", Mth.nextInt(RandomSource.create(), 0, 9)));
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.PAPER_DRAWINGS_FNAF_2.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = (new Object() {
					public BlockState with(BlockState _bs, String _property, int _newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
						return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
					}
				}.with(YaFnafmodModBlocks.PAPER_DRAWINGS.get().defaultBlockState(), "blockstate", Mth.nextInt(RandomSource.create(), 18, 25)));
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.PAPER_DRAWINGS_FNAF_3.get()) {
			if (((Mth.nextInt(RandomSource.create(), 1, 10))) > (0) && ((Mth.nextInt(RandomSource.create(), 1, 10))) < (8)) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = (new Object() {
						public BlockState with(BlockState _bs, String _property, int _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
						}
					}.with(YaFnafmodModBlocks.PAPER_DRAWINGS.get().defaultBlockState(), "blockstate", Mth.nextInt(RandomSource.create(), 10, 17)));
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = (new Object() {
						public BlockState with(BlockState _bs, String _property, int _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
						}
					}.with(YaFnafmodModBlocks.PAPER_DRAWINGS.get().defaultBlockState(), "blockstate", Mth.nextInt(RandomSource.create(), 26, 27)));
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.PAPER_DRAWINGS_FNAF_6.get()) {
			if (((Mth.nextInt(RandomSource.create(), 0, 10))) > (0) && ((Mth.nextInt(RandomSource.create(), 0, 10))) < (7)) {
				if (((Mth.nextInt(RandomSource.create(), 1, 6))) > (0) && ((Mth.nextInt(RandomSource.create(), 1, 6))) < (4)) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = (new Object() {
							public BlockState with(BlockState _bs, String _property, int _newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
								return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
							}
						}.with(YaFnafmodModBlocks.PAPER_DRAWINGS.get().defaultBlockState(), "blockstate", Mth.nextInt(RandomSource.create(), 28, 31)));
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				} else {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = (new Object() {
							public BlockState with(BlockState _bs, String _property, int _newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
								return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
							}
						}.with(YaFnafmodModBlocks.PAPER_DRAWINGS.get().defaultBlockState(), "blockstate", Mth.nextInt(RandomSource.create(), 34, 36)));
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			} else {
				random1 = Mth.nextInt(RandomSource.create(), 1, 4);
				if (random1 == 1) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = YaFnafmodModBlocks.DRAWING_BIG_ROCKSTAR_FREDDY.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				} else if (random1 == 2) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = YaFnafmodModBlocks.DRAWING_BIG_LEFTY.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				} else if (random1 == 3) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = YaFnafmodModBlocks.DRAWING_BIG_CLOWN.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				} else if (random1 == 4) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = YaFnafmodModBlocks.DRAWING_BIG_ROCKSTARS.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
		}
	}
}
