package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DougDogBlockDisplayItem;

public class DougDogBlockDisplayModel extends GeoModel<DougDogBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DougDogBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dougthedog.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DougDogBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dougthedog.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DougDogBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_doug.png");
	}
}
