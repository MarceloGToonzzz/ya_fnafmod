package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BoxPlush3DisplayItem;

public class BoxPlush3DisplayModel extends GeoModel<BoxPlush3DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BoxPlush3DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/openbox_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxPlush3DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/openbox_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxPlush3DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/boxopen_plush3.png");
	}
}
