package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.DrTeethDayEntity;

public class DrTeethDayModel extends GeoModel<DrTeethDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(DrTeethDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/bidybab.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrTeethDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/bidybab.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrTeethDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
