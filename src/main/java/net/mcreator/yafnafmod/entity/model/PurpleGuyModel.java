package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.PurpleGuyEntity;

public class PurpleGuyModel extends GeoModel<PurpleGuyEntity> {
	@Override
	public ResourceLocation getAnimationResource(PurpleGuyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/purple_guy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PurpleGuyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/purple_guy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PurpleGuyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
