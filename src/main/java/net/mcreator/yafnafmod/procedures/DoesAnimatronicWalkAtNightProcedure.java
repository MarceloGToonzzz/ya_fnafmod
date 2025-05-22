package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class DoesAnimatronicWalkAtNightProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		double yaw = 0;
		boolean result = false;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:nonnight_walker"))) && entity.getPersistentData().getBoolean("walks_at_night") == true) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
