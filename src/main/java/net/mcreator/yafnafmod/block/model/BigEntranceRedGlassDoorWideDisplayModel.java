package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigEntranceRedGlassDoorWideDisplayItem;

public class BigEntranceRedGlassDoorWideDisplayModel extends GeoModel<BigEntranceRedGlassDoorWideDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigEntranceRedGlassDoorWideDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigwidedoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigEntranceRedGlassDoorWideDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigwidedoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigEntranceRedGlassDoorWideDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_redglassentrance_wide.png");
	}
}
