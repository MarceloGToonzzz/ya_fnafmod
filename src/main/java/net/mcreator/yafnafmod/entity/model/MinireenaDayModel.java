package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.MinireenaDayEntity;

public class MinireenaDayModel extends GeoModel<MinireenaDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(MinireenaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/minireena.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MinireenaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/minireena.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MinireenaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
