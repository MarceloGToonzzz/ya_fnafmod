package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.NumberOneCrateDayEntity;

public class NumberOneCrateDayModel extends GeoModel<NumberOneCrateDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(NumberOneCrateDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/numberone_crate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NumberOneCrateDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/numberone_crate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NumberOneCrateDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
