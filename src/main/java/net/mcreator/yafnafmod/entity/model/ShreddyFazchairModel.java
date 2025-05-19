package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.ShreddyFazchairEntity;

public class ShreddyFazchairModel extends GeoModel<ShreddyFazchairEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShreddyFazchairEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/shreddy_fazchair.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShreddyFazchairEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/shreddy_fazchair.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShreddyFazchairEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
