package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;

public class FuseboxEmitRedstoneProcedure {
	public static double execute(BlockState blockstate) {
		double redstone = 0;
		if ((blockstate.getBlock().getStateDefinition().getProperty("enabled") instanceof BooleanProperty _getbp1 && blockstate.getValue(_getbp1)) == true) {
			redstone = 15;
		} else {
			redstone = 0;
		}
		return redstone;
	}
}
