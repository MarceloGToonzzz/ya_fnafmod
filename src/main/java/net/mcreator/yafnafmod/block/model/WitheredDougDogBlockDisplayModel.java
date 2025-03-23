package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.WitheredDougDogBlockDisplayItem;

public class WitheredDougDogBlockDisplayModel extends GeoModel<WitheredDougDogBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredDougDogBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dougthedog.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredDougDogBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dougthedog.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredDougDogBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_doug.png");
	}
}
