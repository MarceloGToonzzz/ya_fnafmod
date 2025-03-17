package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BrokenChicaDisplayItem;

public class BrokenChicaDisplayModel extends GeoModel<BrokenChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenChicaDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/broken_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenChicaDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/broken_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenChicaDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/broken_chica.png");
	}
}
