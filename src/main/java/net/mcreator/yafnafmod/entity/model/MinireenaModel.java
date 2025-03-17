package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.MinireenaEntity;

public class MinireenaModel extends GeoModel<MinireenaEntity> {
	@Override
	public ResourceLocation getAnimationResource(MinireenaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/minireena.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MinireenaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/minireena.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MinireenaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
