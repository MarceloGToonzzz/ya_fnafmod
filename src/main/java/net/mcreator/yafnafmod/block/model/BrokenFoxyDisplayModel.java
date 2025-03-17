package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BrokenFoxyDisplayItem;

public class BrokenFoxyDisplayModel extends GeoModel<BrokenFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/broken_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/broken_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/broken_foxy.png");
	}
}
