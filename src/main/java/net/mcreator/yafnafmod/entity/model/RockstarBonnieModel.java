package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.RockstarBonnieEntity;

public class RockstarBonnieModel extends GeoModel<RockstarBonnieEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockstarBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/rockstar_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockstarBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/rockstar_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockstarBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
