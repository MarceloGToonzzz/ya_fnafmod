package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.OfficeChairBlackDisplayItem;

public class OfficeChairBlackDisplayModel extends GeoModel<OfficeChairBlackDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OfficeChairBlackDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/officechair.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OfficeChairBlackDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/officechair.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OfficeChairBlackDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/officechair_black.png");
	}
}
