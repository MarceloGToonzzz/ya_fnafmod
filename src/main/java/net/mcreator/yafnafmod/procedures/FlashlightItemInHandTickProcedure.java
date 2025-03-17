package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

public class FlashlightItemInHandTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("damaged") == true) {
			if (world.isEmptyBlock(BlockPos.containing(x, entity.getY() + entity.getEyeHeight(), z))) {
				world.setBlock(BlockPos.containing(entity.getX(), entity.getY() + entity.getEyeHeight(), entity.getZ()), YaFnafmodModBlocks.FLASHLIGHT_LIGHT.get().defaultBlockState(), 3);
				if (0 < itemstack.getDamageValue()) {
					{
						ItemStack _ist = itemstack;
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
			}
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
