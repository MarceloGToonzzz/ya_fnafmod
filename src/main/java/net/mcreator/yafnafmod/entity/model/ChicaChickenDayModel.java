package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.ChicaChickenDayEntity;

public class ChicaChickenDayModel extends GeoModel<ChicaChickenDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/chicachicken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/chicachicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
