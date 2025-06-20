package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.MnafToyChicaSuitItem;

public class MnafToyChicaSuitModel extends GeoModel<MnafToyChicaSuitItem> {
	@Override
	public ResourceLocation getAnimationResource(MnafToyChicaSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/mnaf_toychicasuit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MnafToyChicaSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/mnaf_toychicasuit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MnafToyChicaSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/mnaf_toychicasuit.png");
	}
}
