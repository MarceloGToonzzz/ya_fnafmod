package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class LookyLooProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z, String block) {
		if (block == null)
			return "";
		boolean found = false;
		double Radius = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		Radius = 64;
		sx = Radius * (-0.5);
		found = false;
		for (int index0 = 0; index0 < (int) Radius; index0++) {
			sy = Radius * (-0.5);
			if (found == false) {
				for (int index1 = 0; index1 < (int) Radius; index1++) {
					if (found == false) {
						sz = Radius * (-0.5);
						for (int index2 = 0; index2 < (int) Radius; index2++) {
							if (found == false) {
								if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == ForgeRegistries.BLOCKS.getValue(new ResourceLocation((block).toLowerCase(java.util.Locale.ENGLISH)))) {
									found = true;
									return "X" + Math.floor(x + sx) + "X" + "Y" + Math.floor(y + sy) + "Y" + "Z" + Math.floor(z + sz) + "Z";
								}
								sz = sz + 1;
							}
						}
						sy = sy + 1;
					}
				}
				sx = sx + 1;
			}
		}
		return "X" + 0 + "X" + "Y" + (-200) + "Y" + "Z" + 0 + "Z";
	}
}
