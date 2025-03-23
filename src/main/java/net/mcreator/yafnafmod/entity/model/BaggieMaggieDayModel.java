package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BaggieMaggieDayEntity;

public class BaggieMaggieDayModel extends GeoModel<BaggieMaggieDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(BaggieMaggieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/trashbag.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BaggieMaggieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/trashbag.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BaggieMaggieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
