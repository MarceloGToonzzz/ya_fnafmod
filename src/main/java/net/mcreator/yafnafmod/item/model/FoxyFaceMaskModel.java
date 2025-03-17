package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.FoxyFaceMaskItem;

public class FoxyFaceMaskModel extends GeoModel<FoxyFaceMaskItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyFaceMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/mask.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyFaceMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/mask.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyFaceMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/mask_retrofoxy.png");
	}
}
