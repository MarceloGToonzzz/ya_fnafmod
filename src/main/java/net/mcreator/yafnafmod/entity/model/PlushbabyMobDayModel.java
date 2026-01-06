package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.PlushbabyMobDayEntity;

public class PlushbabyMobDayModel extends GeoModel<PlushbabyMobDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(PlushbabyMobDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/plushbaby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PlushbabyMobDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/plushbaby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PlushbabyMobDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
