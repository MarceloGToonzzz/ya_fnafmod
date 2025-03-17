package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.MrHugsEntity;

public class MrHugsModel extends GeoModel<MrHugsEntity> {
	@Override
	public ResourceLocation getAnimationResource(MrHugsEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/mrhugs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrHugsEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/mrhugs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrHugsEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
