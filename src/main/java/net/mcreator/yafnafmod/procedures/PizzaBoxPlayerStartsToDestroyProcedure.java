package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class PizzaBoxPlayerStartsToDestroyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_BOX_1988.get() || blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_BOX_2023.get()) {
			for (int index0 = 0; index0 < new Object() {
				public int getEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, BlockPos.containing(x, y, z)); index0++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(YaFnafmodModItems.PIZZA_SLICE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_BOX_1979.get() || blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_BOX_1985.get() || blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_BOX_1987.get()
				|| blockstate.getBlock() == YaFnafmodModBlocks.PIZZA_BOX_1987_ALT.get()) {
			for (int index1 = 0; index1 < new Object() {
				public int getEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, BlockPos.containing(x, y, z)); index1++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(YaFnafmodModItems.PIZZA_SLICE_FRESH.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
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
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
			int _amount = 8;
			if (_ent != null)
				_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
		}
	}
}
