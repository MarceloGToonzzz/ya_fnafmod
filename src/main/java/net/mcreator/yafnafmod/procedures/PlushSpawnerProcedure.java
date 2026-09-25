package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.yafnafmod.network.YaFnafmodModVariables;
import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

import java.util.List;
import java.util.Comparator;

public class PlushSpawnerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double chance1 = 0;
		double chance2 = 0;
		String texture = "";
		String entity = "";
		String command = "";
		String command_base = "";
		if (IsItNighttimeProcedure.execute(world) == true) {
			command_base = "summon ya_fnafmod:ENTITY ~ ~ ~ {Brain: {memories: {}}, ForgeData: {skin: 0.0d, style: STYLEd}}";
			if ((blockstate.getBlock().getStateDefinition().getProperty("has_spawned") instanceof BooleanProperty _getbp1 && blockstate.getValue(_getbp1)) == false) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.PLUSH_FREDDY_RETRO_SPAWNER.get()) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								((command_base.replace("STYLE", "" + (blockstate.getBlock().getStateDefinition().getProperty("style") instanceof IntegerProperty _getip5 ? blockstate.getValue(_getip5) : -1))).replace("ENTITY", "nightmare_freddy")));
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.PLUSH_BONNIE_RETRO_SPAWNER.get()) {
					if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == false) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									((command_base.replace("STYLE", "" + (blockstate.getBlock().getStateDefinition().getProperty("style") instanceof IntegerProperty _getip10 ? blockstate.getValue(_getip10) : -1))).replace("ENTITY",
											"nightmare_bonnie")));
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									((command_base.replace("STYLE", "" + (blockstate.getBlock().getStateDefinition().getProperty("style") instanceof IntegerProperty _getip13 ? blockstate.getValue(_getip13) : -1))).replace("ENTITY",
											"jack_o_bonnie")));
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.PLUSH_CHICA_RETRO_SPAWNER.get()) {
					if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == false) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									((command_base.replace("STYLE", "" + (blockstate.getBlock().getStateDefinition().getProperty("style") instanceof IntegerProperty _getip18 ? blockstate.getValue(_getip18) : -1))).replace("ENTITY",
											"nightmare_chica")));
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									((command_base.replace("STYLE", "" + (blockstate.getBlock().getStateDefinition().getProperty("style") instanceof IntegerProperty _getip21 ? blockstate.getValue(_getip21) : -1))).replace("ENTITY",
											"nightmare_cupcake_entity")));
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									((command_base.replace("STYLE", "" + (blockstate.getBlock().getStateDefinition().getProperty("style") instanceof IntegerProperty _getip24 ? blockstate.getValue(_getip24) : -1))).replace("ENTITY", "jack_o_chica")));
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									((command_base.replace("STYLE", "" + (blockstate.getBlock().getStateDefinition().getProperty("style") instanceof IntegerProperty _getip27 ? blockstate.getValue(_getip27) : -1))).replace("ENTITY",
											"nightmare_pumpkin_entity")));
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.PLUSH_FOXY_RETRO_SPAWNER.get()) {
					if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == false) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									((command_base.replace("STYLE", "" + (blockstate.getBlock().getStateDefinition().getProperty("style") instanceof IntegerProperty _getip32 ? blockstate.getValue(_getip32) : -1))).replace("ENTITY",
											"nightmare_foxy")));
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									((command_base.replace("STYLE", "" + (blockstate.getBlock().getStateDefinition().getProperty("style") instanceof IntegerProperty _getip35 ? blockstate.getValue(_getip35) : -1))).replace("ENTITY",
											"nightmare_mangle")));
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.PLUSH_FREDBEAR_SPAWNER.get()) {
					chance1 = Mth.nextInt(RandomSource.create(), 1, 2);
					if (chance1 == 1) {
						chance2 = Mth.nextInt(RandomSource.create(), 1, 3);
						if (chance2 == 1) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										((command_base.replace("STYLE", "" + (blockstate.getBlock().getStateDefinition().getProperty("style") instanceof IntegerProperty _getip42 ? blockstate.getValue(_getip42) : -1))).replace("ENTITY",
												"nightmare_fredbear")));
						} else if (chance2 == 2) {
							if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == false) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											((command_base.replace("STYLE", "" + (blockstate.getBlock().getStateDefinition().getProperty("style") instanceof IntegerProperty _getip45 ? blockstate.getValue(_getip45) : -1))).replace("ENTITY",
													"nightmare")));
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											((command_base.replace("STYLE", "" + (blockstate.getBlock().getStateDefinition().getProperty("style") instanceof IntegerProperty _getip48 ? blockstate.getValue(_getip48) : -1))).replace("ENTITY",
													"nightmarionne")));
							}
						} else if (chance2 == 3) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										((command_base.replace("STYLE", "" + (blockstate.getBlock().getStateDefinition().getProperty("style") instanceof IntegerProperty _getip51 ? blockstate.getValue(_getip51) : -1))).replace("ENTITY",
												"nightmare_fredbear")));
							if (YaFnafmodModVariables.MapVariables.get(world).halloween_night == false) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											((command_base.replace("STYLE", "" + (blockstate.getBlock().getStateDefinition().getProperty("style") instanceof IntegerProperty _getip54 ? blockstate.getValue(_getip54) : -1))).replace("ENTITY",
													"nightmare")));
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											((command_base.replace("STYLE", "" + (blockstate.getBlock().getStateDefinition().getProperty("style") instanceof IntegerProperty _getip57 ? blockstate.getValue(_getip57) : -1))).replace("ENTITY",
													"nightmarionne")));
							}
						}
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						SettingSkinProcedure.execute(world, entityiterator, 0, blockstate.getBlock().getStateDefinition().getProperty("style") instanceof IntegerProperty _getip60 ? blockstate.getValue(_getip60) : -1);
					}
				}
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("has_spawned") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
				}
			}
		} else {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("has_spawned") instanceof BooleanProperty _booleanProp)
					world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
			}
		}
	}
}
