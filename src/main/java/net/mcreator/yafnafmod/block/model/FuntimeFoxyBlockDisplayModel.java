package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FuntimeFoxyBlockDisplayItem;

public class FuntimeFoxyBlockDisplayModel extends GeoModel<FuntimeFoxyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeFoxyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/funtime_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeFoxyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/funtime_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeFoxyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_ftfoxy.png");
	}
}
