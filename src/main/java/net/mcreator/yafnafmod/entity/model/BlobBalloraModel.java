package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BlobBalloraEntity;

public class BlobBalloraModel extends GeoModel<BlobBalloraEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlobBalloraEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/wirepile.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlobBalloraEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/wirepile.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlobBalloraEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
