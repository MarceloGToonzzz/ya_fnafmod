package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BoxPlush4DisplayItem;

public class BoxPlush4DisplayModel extends GeoModel<BoxPlush4DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BoxPlush4DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/openbox_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxPlush4DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/openbox_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxPlush4DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/boxopen_plush4.png");
	}
}
