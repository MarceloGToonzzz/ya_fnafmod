package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BoxEndoDisplayItem;

public class BoxEndoDisplayModel extends GeoModel<BoxEndoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BoxEndoDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/openbox_endo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxEndoDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/openbox_endo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxEndoDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/boxopen_endo.png");
	}
}
