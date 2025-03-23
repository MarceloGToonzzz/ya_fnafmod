package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.MysteriousGiantScuttlerEntity;

public class MysteriousGiantScuttlerModel extends GeoModel<MysteriousGiantScuttlerEntity> {
	@Override
	public ResourceLocation getAnimationResource(MysteriousGiantScuttlerEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/scutler.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MysteriousGiantScuttlerEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/scutler.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MysteriousGiantScuttlerEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
