package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class ShowTitleProcedure {
	public static void execute(Entity entity, boolean bold, String color, String text) {
		if (entity == null || color == null || text == null)
			return;
		String boold = "";
		if (bold == true) {
			boold = "true";
		} else {
			boold = "false";
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
								_ent.getDisplayName(), _ent.level().getServer(), _ent),
								((("title @s title [\"\",{\"text\":\"TEEXT\",\"color\":\"#COOLER\",\"bold\":BOLDOFYOU}]".replace("COOLER", color)).replace("TEEXT", text)).replace("BOLDOFYOU", boold)));
			}
		}
	}
}
