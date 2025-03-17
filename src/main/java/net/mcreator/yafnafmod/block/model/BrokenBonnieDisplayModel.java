package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BrokenBonnieDisplayItem;

public class BrokenBonnieDisplayModel extends GeoModel<BrokenBonnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenBonnieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/broken_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenBonnieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/broken_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenBonnieDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/broken_bonnie.png");
	}
}
