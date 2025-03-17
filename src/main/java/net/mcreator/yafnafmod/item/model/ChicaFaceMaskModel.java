package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.ChicaFaceMaskItem;

public class ChicaFaceMaskModel extends GeoModel<ChicaFaceMaskItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaFaceMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/mask.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaFaceMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/mask.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaFaceMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/mask_retrochica.png");
	}
}
