package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.RockstarFreddyDayEntity;

public class RockstarFreddyDayModel extends GeoModel<RockstarFreddyDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockstarFreddyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/rockstar_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockstarFreddyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/rockstar_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockstarFreddyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
