package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

public class StructureBlockWarnProcedure {
	public static void execute(BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		double x = 0;
		double z = 0;
		double y = 0;
		if (blockstate.getBlock() == YaFnafmodModBlocks.STRUCTURE_BLOCK_FNAF_1.get()) {
			x = 96;
			y = 24;
			z = 96;
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.STRUCTURE_BLOCK_FNAF_2.get()) {
			x = 96;
			y = 30;
			z = 96;
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.STRUCTURE_BLOCK_FNAF_3.get()) {
			x = 96;
			y = 30;
			z = 96;
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.STRUCTURE_BLOCK_FNAF_4.get()) {
			x = 96;
			y = 48;
			z = 96;
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.STRUCTURE_BLOCK_FNAF_6.get()) {
			x = 96;
			y = 48;
			z = 96;
		}
		if (blockstate.getBlock() == YaFnafmodModBlocks.STRUCTURE_BLOCK_FNAF_1_CLASSIC.get()) {
			x = 48;
			y = 25;
			z = 48;
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.STRUCTURE_FNAF_2_CLASSIC.get()) {
			x = 47;
			y = 25;
			z = 48;
		} else if (blockstate.getBlock() == YaFnafmodModBlocks.STRUCTURE_FNAF_3_CLASSIC.get()) {
			x = 48;
			y = 25;
			z = 48;
		}
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(
					Component.literal(("Are you sure you want to place this structure? It will take up an area of SIZE, facing South-East. Right click it to confirm.".replace("SIZE", (x + " by " + y + " by " + z).replace(".0", "")))), false);
		if (blockstate.getBlock() == YaFnafmodModBlocks.STRUCTURE_BLOCK_FNAF_6.get()) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("* WARNING, SPAWNING THIS STRUCTURE MIGHT CAUSE A LAG SPIKE. *"), false);
		}
	}
}
