package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

public class PizzaBlockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 3) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.PIZZACUTTER.get())) {
			if (!((ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString()).contains("fresh") || blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_GOLDEN_BITE_BLOCK.get())) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 3));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 3));
				if (entity instanceof Player _player)
					_player.causeFoodExhaustion((float) 0.25);
			} else if ((ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString()).contains("fresh") || blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_GOLDEN_BITE_BLOCK.get()) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 4.5));
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 4.5));
				if (entity instanceof Player _player)
					_player.causeFoodExhaustion((float) 0.375);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.PIZZACUTTER.get()) {
			if (blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_BLOCK.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(YaFnafmodModItems.PIZZA_SLICE.get()).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_FRESH_BLOCK.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(YaFnafmodModItems.PIZZA_SLICE_FRESH.get()).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_CHEESE_BLOCK.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(YaFnafmodModItems.PIZZA_SLICE_CHEESE.get()).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_FRESH_CHEESE_BLOCK.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(YaFnafmodModItems.PIZZA_SLICE_CHEESE_FRESH.get()).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_GOLDEN_BITE_BLOCK.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(YaFnafmodModItems.PIZZA_SLICE_GOLDEN_BITE.get()).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if (blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_ANCHOVY_BLOCK.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(YaFnafmodModItems.PIZZA_SLICE_ANCHOVY.get()).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_FRESH_ANCHOVY_BLOCK.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(YaFnafmodModItems.PIZZA_SLICE_ANCHOVY_FRESH.get()).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if (blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_ARTICHOKE_BLOCK.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(YaFnafmodModItems.PIZZA_SLICE_ARTICHOKE.get()).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_FRESH_ARTICHOKE_BLOCK.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(YaFnafmodModItems.PIZZA_SLICE_ARTICHOKE_FRESH.get()).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if (blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_RALPH_BLOCK.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(YaFnafmodModItems.PIZZA_SLICE_RALPH.get()).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_FRESH_RALPH_BLOCK.get()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(YaFnafmodModItems.PIZZA_SLICE_RALPH_FRESH.get()).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		{
			int _value = (int) ((blockstate.getBlock().getStateDefinition().getProperty("sliceseaten") instanceof IntegerProperty _getip61 ? blockstate.getValue(_getip61) : -1) + 1);
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("sliceseaten") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
				world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
		}
		{
			int _value = (int) ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip64 ? blockstate.getValue(_getip64) : -1) + 1);
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
				world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
		}
	}
}
