package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.PlushbabyMobEntity;

public class PlushbabyMobModel extends GeoModel<PlushbabyMobEntity> {
	@Override
	public ResourceLocation getAnimationResource(PlushbabyMobEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/plushbaby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PlushbabyMobEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/plushbaby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PlushbabyMobEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
