package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class GetDirectionsProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z, boolean vertical) {
		String aaa = "";
		boolean left = false;
		boolean back = false;
		boolean front = false;
		boolean right = false;
		boolean up = false;
		boolean down = false;
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			front = true;
			aaa = aaa + "front";
		} else {
			front = false;
			aaa = aaa + ".";
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			back = true;
			aaa = aaa + "back";
		} else {
			back = false;
			aaa = aaa + ".";
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			right = true;
			aaa = aaa + "right";
		} else {
			right = false;
			aaa = aaa + ".";
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			left = true;
			aaa = aaa + "left";
		} else {
			left = false;
			aaa = aaa + ".";
		}
		if (vertical == true) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
				up = true;
				aaa = aaa + "up";
			} else {
				up = false;
				aaa = aaa + ".";
			}
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
				down = true;
				aaa = aaa + "down";
			} else {
				down = false;
				aaa = aaa + ".";
			}
		}
		return aaa;
	}
}
