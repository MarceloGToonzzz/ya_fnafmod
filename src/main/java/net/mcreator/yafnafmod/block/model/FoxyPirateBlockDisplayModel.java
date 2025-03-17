package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FoxyPirateBlockDisplayItem;

public class FoxyPirateBlockDisplayModel extends GeoModel<FoxyPirateBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/foxypirate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/foxypirate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_foxy_pirate.png");
	}
}
