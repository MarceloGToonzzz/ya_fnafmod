package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ClownFruitPunchDisplayItem;

public class ClownFruitPunchDisplayModel extends GeoModel<ClownFruitPunchDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClownFruitPunchDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clown_fruitpunch.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClownFruitPunchDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clown_fruitpunch.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClownFruitPunchDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clown_fruitpunch.png");
	}
}
