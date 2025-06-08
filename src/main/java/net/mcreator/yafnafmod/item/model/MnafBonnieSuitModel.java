package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.MnafBonnieSuitItem;

public class MnafBonnieSuitModel extends GeoModel<MnafBonnieSuitItem> {
	@Override
	public ResourceLocation getAnimationResource(MnafBonnieSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/mnaf_bonniesuit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MnafBonnieSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/mnaf_bonniesuit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MnafBonnieSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/mnaf_bonniesuit.png");
	}
}
