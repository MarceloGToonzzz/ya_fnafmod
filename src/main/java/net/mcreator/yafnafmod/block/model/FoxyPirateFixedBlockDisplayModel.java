package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FoxyPirateFixedBlockDisplayItem;

public class FoxyPirateFixedBlockDisplayModel extends GeoModel<FoxyPirateFixedBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateFixedBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/foxypirate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateFixedBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/foxypirate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateFixedBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_foxy_pirate_fixed.png");
	}
}
