package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutBalloraDisplayItem;

public class CutoutBalloraDisplayModel extends GeoModel<CutoutBalloraDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutBalloraDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutBalloraDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutBalloraDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_ballora.png");
	}
}
