package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

public class FlashlightItemInHandTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double lightbeam = 0;
		if (itemstack.getOrCreateTag().getBoolean("damaged") == true) {
			if (world.isEmptyBlock(BlockPos.containing(x, entity.getY() + entity.getEyeHeight(), z))) {
				if (lightbeam < 7 && !(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(lightbeam)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
						.getType() == HitResult.Type.BLOCK)) {
					lightbeam = lightbeam + 1;
				} else {
					lightbeam = 1;
				}
				world.setBlock(BlockPos.containing(entity.getX(), entity.getY() + entity.getEyeHeight(), entity.getZ()), YaFnafmodModBlocks.HEADLIGHT_BLOCK.get().defaultBlockState(), 3);
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), ("setblock ^ ^ ^" + lightbeam + " ya_fnafmod:headlight_block keep"));
					}
				}
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
