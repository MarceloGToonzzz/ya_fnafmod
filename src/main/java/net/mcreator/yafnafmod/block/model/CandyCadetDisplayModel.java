package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CandyCadetDisplayItem;

public class CandyCadetDisplayModel extends GeoModel<CandyCadetDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CandyCadetDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/candy_cadet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CandyCadetDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/candy_cadet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CandyCadetDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/candy_cadet.png");
	}
}
