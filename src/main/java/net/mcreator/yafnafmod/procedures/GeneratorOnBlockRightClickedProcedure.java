package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.init.YaFnafmodModGameRules;
import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

public class GeneratorOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FAZWRENCH.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("generator_selected", true);
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("fusebox_selected", false);
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("controlpanel_selected", false);
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("generator_x", x);
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("generator_y", y);
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("generator_z", z);
			if (blockstate.getBlock() == YaFnafmodModBlocks.GENERATOR_BLOCK.get()) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("generator_type", 0);
			} else {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("generator_type", 1);
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("generator_x")) + " "
						+ ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("generator_y")) + " "
						+ ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("generator_z")) + " - Connected, right click a generator-connectable device to link them.")), false);
		} else {
			if (!world.isClientSide()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:generator_turnon")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:generator_turnon")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("energy", (world.getLevelData().getGameRules().getInt(YaFnafmodModGameRules.GENERATOR_MAX_CAPACITY)));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			{
				int _value = 0;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x + 1, y, z), _level.getBlockState(BlockPos.containing(x + 1, y, z)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x - 1, y, z), _level.getBlockState(BlockPos.containing(x - 1, y, z)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y, z + 1), _level.getBlockState(BlockPos.containing(x, y, z + 1)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y, z - 1), _level.getBlockState(BlockPos.containing(x, y, z - 1)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x + 1, y, z + 1), _level.getBlockState(BlockPos.containing(x + 1, y, z + 1)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x + 1, y, z - 1), _level.getBlockState(BlockPos.containing(x + 1, y, z - 1)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x - 1, y, z + 1), _level.getBlockState(BlockPos.containing(x - 1, y, z + 1)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x - 1, y, z - 1), _level.getBlockState(BlockPos.containing(x - 1, y, z - 1)).getBlock());
		}
	}
}
