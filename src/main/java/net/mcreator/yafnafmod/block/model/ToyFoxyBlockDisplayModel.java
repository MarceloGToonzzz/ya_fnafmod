package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ToyFoxyBlockDisplayItem;

public class ToyFoxyBlockDisplayModel extends GeoModel<ToyFoxyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/toyfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/toyfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_tfoxy_day.png");
	}
}
