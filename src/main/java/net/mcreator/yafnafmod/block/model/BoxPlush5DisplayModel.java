package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BoxPlush5DisplayItem;

public class BoxPlush5DisplayModel extends GeoModel<BoxPlush5DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BoxPlush5DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/openbox_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxPlush5DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/openbox_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxPlush5DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/boxopen_plush5.png");
	}
}
