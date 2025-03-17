package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.NeddBearDayEntity;

public class NeddBearDayModel extends GeoModel<NeddBearDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeddBearDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/neddbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeddBearDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/neddbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeddBearDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
