package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class HeadlightsOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getRootVehicle()).getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("forge:vehicles")))) {
			if ((entity.getRootVehicle()).getPersistentData().getDouble("HeadlightOn") == 0) {
				(entity.getRootVehicle()).getPersistentData().putDouble("HeadlightOn", 1);
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Headlights On"), false);
			} else {
				(entity.getRootVehicle()).getPersistentData().putDouble("HeadlightOn", 0);
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Headlights Off"), false);
			}
		}
	}
}
