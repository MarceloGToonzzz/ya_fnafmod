package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BoxPlush1DisplayItem;

public class BoxPlush1DisplayModel extends GeoModel<BoxPlush1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BoxPlush1DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/openbox_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxPlush1DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/openbox_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxPlush1DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/boxopen_plush1.png");
	}
}
