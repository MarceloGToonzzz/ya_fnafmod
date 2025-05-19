package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BoxPlush6DisplayItem;

public class BoxPlush6DisplayModel extends GeoModel<BoxPlush6DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BoxPlush6DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/openbox_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxPlush6DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/openbox_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxPlush6DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/boxopen_plush6.png");
	}
}
