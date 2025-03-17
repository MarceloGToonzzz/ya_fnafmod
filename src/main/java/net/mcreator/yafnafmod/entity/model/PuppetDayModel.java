package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.PuppetDayEntity;

public class PuppetDayModel extends GeoModel<PuppetDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/puppet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/puppet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
