package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PopgoesWeaselBlockDisplayItem;

public class PopgoesWeaselBlockDisplayModel extends GeoModel<PopgoesWeaselBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PopgoesWeaselBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/popgoes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopgoesWeaselBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/popgoes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopgoesWeaselBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_popgoes.png");
	}
}
