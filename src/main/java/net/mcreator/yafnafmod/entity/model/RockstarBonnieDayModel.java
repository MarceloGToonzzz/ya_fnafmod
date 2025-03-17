package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.RockstarBonnieDayEntity;

public class RockstarBonnieDayModel extends GeoModel<RockstarBonnieDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockstarBonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/rockstar_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockstarBonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/rockstar_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockstarBonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
