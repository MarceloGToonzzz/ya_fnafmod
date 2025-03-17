package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FryerDisplayItem;

public class FryerDisplayModel extends GeoModel<FryerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FryerDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fryer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FryerDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fryer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FryerDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fryer.png");
	}
}
