package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.OfficeChairRedDisplayItem;

public class OfficeChairRedDisplayModel extends GeoModel<OfficeChairRedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OfficeChairRedDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/officechair.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OfficeChairRedDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/officechair.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OfficeChairRedDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/officechair_red.png");
	}
}
