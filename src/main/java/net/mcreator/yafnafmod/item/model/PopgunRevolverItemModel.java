package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.PopgunRevolverItem;

public class PopgunRevolverItemModel extends GeoModel<PopgunRevolverItem> {
	@Override
	public ResourceLocation getAnimationResource(PopgunRevolverItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/popgun_revolver.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopgunRevolverItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/popgun_revolver.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopgunRevolverItem animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/item/popgun_revolver.png");
	}
}
