package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.MemoryBonnieDayEntity;

public class MemoryBonnieDayModel extends GeoModel<MemoryBonnieDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(MemoryBonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/memory_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MemoryBonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/memory_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MemoryBonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
