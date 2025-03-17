package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class PizzaBoxOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 0) {
			{
				int _value = 1;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip4 ? blockstate.getValue(_getip4) : -1) == 1) {
			if (entity.isShiftKeyDown()) {
				if (new Object() {
					public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getMaxEnergyStored()));
						return _retval.get();
					}
				}.getMaxEnergyStored(world, BlockPos.containing(x, y, z)) > 0) {
					if (blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_BOX_1988.get() || blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_BOX_2023.get()) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(YaFnafmodModItems.PIZZA_SLICE.get()).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_BOX_1985.get() || blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_BOX_1987.get() || blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_BOX_1987_ALT.get()) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(YaFnafmodModItems.PIZZA_SLICE_FRESH.get()).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 1;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
				}
			} else {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		}
		if (new Object() {
			public int getEnergyStored(LevelAccessor level, BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(world, BlockPos.containing(x, y, z)) == 0) {
			if (!(ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString()).contains("_empty")) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(((ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString() + "_empty")).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState();
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
