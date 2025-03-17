package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BoxPlush2DisplayItem;

public class BoxPlush2DisplayModel extends GeoModel<BoxPlush2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BoxPlush2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/openbox_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxPlush2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/openbox_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxPlush2DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/boxopen_plush2.png");
	}
}
