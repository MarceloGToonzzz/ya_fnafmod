package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RetroBonnieHeadDisplayItem;

public class RetroBonnieHeadDisplayModel extends GeoModel<RetroBonnieHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RetroBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroBonnieHeadDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_bonnieretro.png");
	}
}
