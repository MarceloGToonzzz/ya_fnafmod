package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PartsBoxDisplayItem;

public class PartsBoxDisplayModel extends GeoModel<PartsBoxDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PartsBoxDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/partsbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PartsBoxDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/partsbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PartsBoxDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/partsbox.png");
	}
}
