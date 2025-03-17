package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BarryPolarBlockDisplayItem;

public class BarryPolarBlockDisplayModel extends GeoModel<BarryPolarBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BarryPolarBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/barrypolar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BarryPolarBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/barrypolar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BarryPolarBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_barrypolar.png");
	}
}
