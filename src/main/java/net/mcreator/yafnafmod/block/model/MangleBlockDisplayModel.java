package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.MangleBlockDisplayItem;

public class MangleBlockDisplayModel extends GeoModel<MangleBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MangleBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/mangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MangleBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/mangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MangleBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_mangle.png");
	}
}
