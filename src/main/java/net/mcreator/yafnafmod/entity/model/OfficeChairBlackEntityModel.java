package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.OfficeChairBlackEntityEntity;

public class OfficeChairBlackEntityModel extends GeoModel<OfficeChairBlackEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(OfficeChairBlackEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/officechair.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OfficeChairBlackEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/officechair.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OfficeChairBlackEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
