package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.MemoryChicaDayEntity;

public class MemoryChicaDayModel extends GeoModel<MemoryChicaDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(MemoryChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/memory_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MemoryChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/memory_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MemoryChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
