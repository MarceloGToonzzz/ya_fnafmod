package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.NightmareBbDayEntity;

public class NightmareBbDayModel extends GeoModel<NightmareBbDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(NightmareBbDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/nightmare_bb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NightmareBbDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/nightmare_bb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NightmareBbDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
