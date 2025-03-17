package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.WitheredFoxyBlockDisplayItem;

public class WitheredFoxyBlockDisplayModel extends GeoModel<WitheredFoxyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/withered_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/withered_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_foxy.png");
	}
}
