package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.FreddyFazbearDayEntity;

public class FreddyFazbearDayModel extends GeoModel<FreddyFazbearDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/freddyfazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/freddyfazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
