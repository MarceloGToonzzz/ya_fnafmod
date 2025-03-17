package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.NoveltyTrafficLightTileEntity;

public class NoveltyTrafficLightBlockModel extends GeoModel<NoveltyTrafficLightTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NoveltyTrafficLightTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/novelty_trafficlight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NoveltyTrafficLightTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/novelty_trafficlight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NoveltyTrafficLightTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/novelty_trafficlight.png");
	}
}
