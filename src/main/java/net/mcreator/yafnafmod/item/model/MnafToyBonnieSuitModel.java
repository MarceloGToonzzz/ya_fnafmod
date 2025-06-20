package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.MnafToyBonnieSuitItem;

public class MnafToyBonnieSuitModel extends GeoModel<MnafToyBonnieSuitItem> {
	@Override
	public ResourceLocation getAnimationResource(MnafToyBonnieSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/mnaf_toybonniesuit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MnafToyBonnieSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/mnaf_toybonniesuit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MnafToyBonnieSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/mnaf_toybonniesuit.png");
	}
}
