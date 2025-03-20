package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FuntimeDelilahBlockDisplayItem;

public class FuntimeDelilahBlockDisplayModel extends GeoModel<FuntimeDelilahBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeDelilahBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/ftdelilah.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeDelilahBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/ftdelilah.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeDelilahBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_delilah.png");
	}
}
