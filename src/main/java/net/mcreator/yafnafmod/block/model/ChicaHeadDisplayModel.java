package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ChicaHeadDisplayItem;

public class ChicaHeadDisplayModel extends GeoModel<ChicaHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaHeadDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_chicaclassic.png");
	}
}
