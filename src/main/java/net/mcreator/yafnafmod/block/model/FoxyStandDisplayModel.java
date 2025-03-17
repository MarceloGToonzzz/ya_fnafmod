package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FoxyStandDisplayItem;

public class FoxyStandDisplayModel extends GeoModel<FoxyStandDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyStandDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/foxy_stand.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyStandDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/foxy_stand.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyStandDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stand_foxy.png");
	}
}
