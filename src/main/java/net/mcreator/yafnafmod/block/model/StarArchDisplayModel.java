package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.StarArchDisplayItem;

public class StarArchDisplayModel extends GeoModel<StarArchDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StarArchDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/star_arch.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StarArchDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/star_arch.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StarArchDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/star_arch.png");
	}
}
