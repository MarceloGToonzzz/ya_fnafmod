package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class GetCoordsBlockRadiusProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z, BlockState block, double radius, String direc) {
		if (direc == null)
			return 0;
		boolean found = false;
		String direction = "";
		String dir = "";
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double return_total = 0;
		double radiussss = 0;
		radiussss = radius * (-0.5);
		sx = radiussss;
		if (found == true) {
			for (int index0 = 0; index0 < (int) radius; index0++) {
				if (found == true) {
					sy = radiussss;
					for (int index1 = 0; index1 < (int) radius; index1++) {
						if (found == true) {
							sz = radiussss;
							for (int index2 = 0; index2 < (int) radius; index2++) {
								if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == block.getBlock()) {
									if ((direc).equals("x")) {
										return_total = x + sx;
										if (!world.isClientSide() && world.getServer() != null)
											world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("" + (x + sx))), false);
									} else if ((direc).equals("y")) {
										return_total = y + sy;
										if (!world.isClientSide() && world.getServer() != null)
											world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("" + (y + sy))), false);
									} else if ((direc).equals("z")) {
										return_total = z + sz;
										if (!world.isClientSide() && world.getServer() != null)
											world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("" + (z + sz))), false);
									}
									found = true;
								}
								sz = sz + 1;
							}
							sy = sy + 1;
						}
					}
					sx = sx + 1;
				}
			}
		}
		return return_total;
	}
}
