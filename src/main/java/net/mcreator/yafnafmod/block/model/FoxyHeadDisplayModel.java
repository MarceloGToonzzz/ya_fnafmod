package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FoxyHeadDisplayItem;

public class FoxyHeadDisplayModel extends GeoModel<FoxyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/foxy_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/foxy_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyHeadDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_foxy.png");
	}
}
