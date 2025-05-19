package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.PuppetFreddybearDayEntity;

public class PuppetFreddybearDayModel extends GeoModel<PuppetFreddybearDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetFreddybearDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/puppet_freddybear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetFreddybearDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/puppet_freddybear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetFreddybearDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
