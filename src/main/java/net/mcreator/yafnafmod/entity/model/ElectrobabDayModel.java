package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.ElectrobabDayEntity;

public class ElectrobabDayModel extends GeoModel<ElectrobabDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(ElectrobabDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/bidybab.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ElectrobabDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/bidybab.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ElectrobabDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
