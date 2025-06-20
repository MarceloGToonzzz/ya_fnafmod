package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;

import java.util.HashMap;

public class ApplyNewSignTextButtonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"kill @e[type=minecraft:text_display,distance=..2]");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"kill @e[type=minecraft:block_display,distance=..2]");
		if (world.getServer() != null ? world.getServer().isSingleplayer() : false) {
			if (!(guistate.containsKey("checkbox:UniformFont") && ((Checkbox) guistate.get("checkbox:UniformFont")).selected())) {
				ApplyNewSignTextProcedure.execute(world, x, y, z, guistate.containsKey("text:SignHexCode") ? ((EditBox) guistate.get("text:SignHexCode")).getValue() : "", "default",
						guistate.containsKey("text:TextLine1") ? ((EditBox) guistate.get("text:TextLine1")).getValue() : "", guistate.containsKey("text:TextLine2") ? ((EditBox) guistate.get("text:TextLine2")).getValue() : "");
			} else {
				ApplyNewSignTextProcedure.execute(world, x, y, z, guistate.containsKey("text:SignHexCode") ? ((EditBox) guistate.get("text:SignHexCode")).getValue() : "", "uniform",
						guistate.containsKey("text:TextLine1") ? ((EditBox) guistate.get("text:TextLine1")).getValue() : "", guistate.containsKey("text:TextLine2") ? ((EditBox) guistate.get("text:TextLine2")).getValue() : "");
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("THIS FEATURE DOES NOT WORK ON MULTIPLAYER SERVERS, WE'RE TRYING TO FIX THIS!"), false);
		}
	}
}
