package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class FlashlightRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double thing = 0;
		if (itemstack.getOrCreateTag().getBoolean("damaged") == true) {
			itemstack.getOrCreateTag().putBoolean("damaged", false);
		} else if (itemstack.getOrCreateTag().getBoolean("damaged") == false) {
			itemstack.getOrCreateTag().putBoolean("damaged", true);
		}
		for (int index0 = 0; index0 < 2; index0++) {
			world.scheduleTick(BlockPos.containing(x, y + thing, z), world.getBlockState(BlockPos.containing(x, y + thing, z)).getBlock(), 1);
			world.scheduleTick(BlockPos.containing(x + 1, y + thing, z), world.getBlockState(BlockPos.containing(x + 1, y + thing, z)).getBlock(), 1);
			world.scheduleTick(BlockPos.containing(x - 1, y + thing, z), world.getBlockState(BlockPos.containing(x - 1, y + thing, z)).getBlock(), 1);
			world.scheduleTick(BlockPos.containing(x, y + thing, z + 1), world.getBlockState(BlockPos.containing(x, y + thing, z + 1)).getBlock(), 1);
			world.scheduleTick(BlockPos.containing(x, y + thing, z - 1), world.getBlockState(BlockPos.containing(x, y + thing, z - 1)).getBlock(), 1);
			world.scheduleTick(BlockPos.containing(x + 1, y + thing, z + 1), world.getBlockState(BlockPos.containing(x + 1, y + thing, z + 1)).getBlock(), 1);
			world.scheduleTick(BlockPos.containing(x - 1, y + thing, z + 1), world.getBlockState(BlockPos.containing(x - 1, y + thing, z + 1)).getBlock(), 1);
			world.scheduleTick(BlockPos.containing(x + 1, y + thing, z - 1), world.getBlockState(BlockPos.containing(x + 1, y + thing, z - 1)).getBlock(), 1);
			world.scheduleTick(BlockPos.containing(x - 1, y + thing, z - 1), world.getBlockState(BlockPos.containing(x - 1, y + thing, z - 1)).getBlock(), 1);
			thing = thing + 1;
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 5);
	}
}
