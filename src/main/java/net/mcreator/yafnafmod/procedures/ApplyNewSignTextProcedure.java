package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class ApplyNewSignTextProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, String COLOR, String TEXT1, String TEXT2) {
		if (COLOR == null || TEXT1 == null || TEXT2 == null)
			return;
		String text1 = "";
		String text2 = "";
		String color = "";
		String command = "";
		double yaw = 0;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"kill @e[tag=yafnafmod_pizzasign]");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"kill @e[type=minecraft:text_display,distance=..2]");
		text1 = TEXT1;
		text2 = TEXT2;
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putString("text1", TEXT1);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putString("text2", TEXT2);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putString("color", COLOR);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if ("black,dark_blue,dark_green_dark_aqua,dark_red,dark_purple,gold,gray,dark_gray,blue,green,aqua,red,light_purple,yellow,white".contains(COLOR)) {
			color = COLOR;
		} else {
			color = "#" + COLOR;
		}
		if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.NORTH) {
			command = (("summon block_display ~ ~0.5 ~ {Passengers:[{id:\"minecraft:text_display\",text:'[{\"text\":\"TEXT1\",\"color\":\"COLOR\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false,\"font\":\"minecraft:uniform\"}]',text_opacity:255,background:0,alignment:\"center\",line_width:210,default_background:false,transformation:[-2f,0f,0f,0.5f,0f,2f,0f,0.25f,0f,0f,-2f,0.863125f,0f,0f,0f,1f],brightness:{sky:15,block:0}},{id:\"minecraft:text_display\",text:'[{\"text\":\"TEXT2\",\"color\":\"COLOR\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false,\"font\":\"minecraft:uniform\"}]',text_opacity:255,background:0,alignment:\"center\",line_width:210,default_background:false,transformation:[-2f,0f,0f,0.5f,0f,2f,0f,-0.75f,0f,0f,-2f,0.863125f,0f,0f,0f,1f],brightness:{sky:15,block:0}}],Tags:[\"yafnafmod_pizzasign\"]}"
					.replace("COLOR", color)).replace("TEXT2", text2)).replace("TEXT1", text1);
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.EAST) {
			command = (("summon block_display ~ ~0.5 ~ {Passengers:[{id:\"minecraft:text_display\",text:'[{\"text\":\"TEXT1\",\"color\":\"COLOR\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false,\"font\":\"minecraft:uniform\"}]',text_opacity:255,background:0,alignment:\"center\",line_width:210,default_background:false,transformation:[0f,0f,2f,0.136875f,0f,2f,0f,0.25f,-2f,0f,0f,0.5f,0f,0f,0f,1f],brightness:{sky:15,block:0}},{id:\"minecraft:text_display\",text:'[{\"text\":\"TEXT2\",\"color\":\"COLOR\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false,\"font\":\"minecraft:uniform\"}]',text_opacity:255,background:0,alignment:\"center\",line_width:210,default_background:false,transformation:[0f,0f,2f,0.136875f,0f,2f,0f,-0.75f,-2f,0f,0f,0.5f,0f,0f,0f,1f],brightness:{sky:15,block:0}}],Tags:[\"yafnafmod_pizzasign\"]}"
					.replace("COLOR", color)).replace("TEXT2", text2)).replace("TEXT1", text1);
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.SOUTH) {
			command = (("summon block_display ~ ~0.5 ~ {Passengers:[{id:\"minecraft:text_display\",text:'[{\"text\":\"TEXT1\",\"color\":\"COLOR\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false,\"font\":\"minecraft:uniform\"}]',text_opacity:255,background:0,alignment:\"center\",line_width:210,default_background:false,transformation:[2f,0f,0f,0.5f,0f,2f,0f,0.25f,0f,0f,2f,0.136875f,0f,0f,0f,1f],brightness:{sky:15,block:0}},{id:\"minecraft:text_display\",text:'[{\"text\":\"TEXT2\",\"color\":\"COLOR\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false,\"font\":\"minecraft:uniform\"}]',text_opacity:255,background:0,alignment:\"center\",line_width:210,default_background:false,transformation:[2f,0f,0f,0.5f,0f,2f,0f,-0.75f,0f,0f,2f,0.136875f,0f,0f,0f,1f],brightness:{sky:15,block:0}}],Tags:[\"yafnafmod_pizzasign\"]}"
					.replace("COLOR", color)).replace("TEXT2", text2)).replace("TEXT1", text1);
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.WEST) {
			command = (("summon block_display ~ ~0.5 ~ {Passengers:[{id:\"minecraft:text_display\",text:'[{\"text\":\"TEXT1\",\"color\":\"COLOR\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false,\"font\":\"minecraft:uniform\"}]',text_opacity:255,background:0,alignment:\"center\",line_width:210,default_background:false,transformation:[0f,0f,-2f,0.863125f,0f,2f,0f,0.25f,2f,0f,0f,0.5f,0f,0f,0f,1f],brightness:{sky:15,block:0}},{id:\"minecraft:text_display\",text:'[{\"text\":\"TEXT2\",\"color\":\"COLOR\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false,\"font\":\"minecraft:uniform\"}]',text_opacity:255,background:0,alignment:\"center\",line_width:210,default_background:false,transformation:[0f,0f,-2f,0.863125f,0f,2f,0f,-0.75f,2f,0f,0f,0.5f,0f,0f,0f,1f],brightness:{sky:15,block:0}}],Tags:[\"yafnafmod_pizzasign\"]}"
					.replace("COLOR", color)).replace("TEXT2", text2)).replace("TEXT1", text1);
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(command), false);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), command);
	}
}
