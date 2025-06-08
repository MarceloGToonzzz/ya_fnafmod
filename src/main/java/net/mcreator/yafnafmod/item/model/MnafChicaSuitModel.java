package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.MnafChicaSuitItem;

public class MnafChicaSuitModel extends GeoModel<MnafChicaSuitItem> {
	@Override
	public ResourceLocation getAnimationResource(MnafChicaSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/mnaf_chicasuit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MnafChicaSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/mnaf_chicasuit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MnafChicaSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/mnaf_chicasuit.png");
	}
}
