package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.NumberOneCrateEntity;

public class NumberOneCrateModel extends GeoModel<NumberOneCrateEntity> {
	@Override
	public ResourceLocation getAnimationResource(NumberOneCrateEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/numberone_crate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NumberOneCrateEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/numberone_crate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NumberOneCrateEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
