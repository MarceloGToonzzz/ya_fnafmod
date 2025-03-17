package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BlockFrontHigherProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity, double distance) {
		if (entity == null)
			return false;
		BlockState frontblock = Blocks.AIR.defaultBlockState();
		BlockState thisblock = Blocks.AIR.defaultBlockState();
		boolean result = false;
		frontblock = (world.getBlockState(BlockPos.containing(x + entity.getLookAngle().x * distance, y, z + entity.getLookAngle().z * distance)));
		thisblock = (world.getBlockState(BlockPos.containing(x, y, z)));
		if (!thisblock.is(BlockTags.create(new ResourceLocation("minecraft:slab"))) && !(thisblock.getBlock() == Blocks.CAVE_AIR) && frontblock.is(BlockTags.create(new ResourceLocation("minecraft:slab")))
				&& (frontblock.getBlock().getStateDefinition().getProperty("shape") instanceof EnumProperty _getep7 ? frontblock.getValue(_getep7).toString() : "").equals("bottom")
				&& thisblock.is(BlockTags.create(new ResourceLocation("minecraft:slab")))
				&& (thisblock.getBlock().getStateDefinition().getProperty("shape") instanceof EnumProperty _getep9 ? thisblock.getValue(_getep9).toString() : "").equals("bottom")
				&& frontblock.is(BlockTags.create(new ResourceLocation("minecraft:slab")))
				&& (frontblock.getBlock().getStateDefinition().getProperty("shape") instanceof EnumProperty _getep11 ? frontblock.getValue(_getep11).toString() : "").equals("top")
				&& thisblock.is(BlockTags.create(new ResourceLocation("minecraft:slab")))
				&& (thisblock.getBlock().getStateDefinition().getProperty("shape") instanceof EnumProperty _getep13 ? thisblock.getValue(_getep13).toString() : "").equals("bottom")
				&& !frontblock.is(BlockTags.create(new ResourceLocation("minecraft:slab"))) && !(frontblock.getBlock() == Blocks.CAVE_AIR)) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
