package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.FredbearDayEntity;

public class FredbearDayModel extends GeoModel<FredbearDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/fredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/fredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
