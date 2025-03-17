package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.ElChipDayEntity;

public class ElChipDayModel extends GeoModel<ElChipDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(ElChipDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/el_chip.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ElChipDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/el_chip.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ElChipDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
