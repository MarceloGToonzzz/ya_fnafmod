package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;
import net.mcreator.yafnafmod.YaFnafmodMod;

public class PosterOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		boolean found_location = false;
		double curx = 0;
		double cury = 0;
		double curz = 0;
		if (blockstate.getBlock() == YaFnafmodModBlocks.TOYPUG.get()) {
			{
				int _value = 1;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
			if (world instanceof Level)
				((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wolf.ambient")), SoundSource.NEUTRAL, 1, 1);
			YaFnafmodMod.queueServerWork(8, () -> {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp)
						world.setBlock(_pos, _bs.setValue(_integerProp, 0), 3);
				}
			});
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.GARFELD.get()) {
			if (world instanceof Level)
				((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:thatcat")), SoundSource.NEUTRAL, 1, 1);
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.ROSIE.get()) {
			if (world instanceof Level)
				((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:tattletale_hehe")), SoundSource.NEUTRAL, 1, 1);
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.PLUSH_STEPHAN.get()) {
			if (world instanceof Level)
				((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fox.ambient")), SoundSource.NEUTRAL, 1, 1);
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.PLUSH_LOGAN.get()) {
			if (world instanceof Level)
				((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wolf.ambient")), SoundSource.NEUTRAL, 1, 1);
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.PLUSH_MARCELO.get()) {
			if (world instanceof Level)
				((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.frog.ambient")), SoundSource.NEUTRAL, 1, 1);
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.PLUSH_STATICBEAR.get()) {
			if (world instanceof Level)
				((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:staticbear_vanish")), SoundSource.NEUTRAL, 1, 1);
			while (found_location == false) {
				curx = x + Mth.nextInt(RandomSource.create(), -15, 15);
				cury = y + Mth.nextInt(RandomSource.create(), -15, 15);
				curz = z + Mth.nextInt(RandomSource.create(), -15, 15);
				if ((world.getBlockState(BlockPos.containing(curx, cury, curz))).getBlock() == Blocks.AIR) {
					found_location = true;
				}
			}
			world.setBlock(BlockPos.containing(curx, cury, curz), blockstate, 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else {
			if (world instanceof Level)
				((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:honk")), SoundSource.NEUTRAL, 1,
						(float) (Math.random() * Mth.nextDouble(RandomSource.create(), 1, 2)));
		}
	}
}
