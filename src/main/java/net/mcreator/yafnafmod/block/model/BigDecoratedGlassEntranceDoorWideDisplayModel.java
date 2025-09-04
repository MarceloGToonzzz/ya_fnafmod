package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigDecoratedGlassEntranceDoorWideDisplayItem;

public class BigDecoratedGlassEntranceDoorWideDisplayModel extends GeoModel<BigDecoratedGlassEntranceDoorWideDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigDecoratedGlassEntranceDoorWideDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigwidedoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigDecoratedGlassEntranceDoorWideDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigwidedoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigDecoratedGlassEntranceDoorWideDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_decoratedglassentrance_wide.png");
	}
}
