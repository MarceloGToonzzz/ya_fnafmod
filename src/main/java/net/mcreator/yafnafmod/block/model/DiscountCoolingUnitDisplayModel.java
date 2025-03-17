package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DiscountCoolingUnitDisplayItem;

public class DiscountCoolingUnitDisplayModel extends GeoModel<DiscountCoolingUnitDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DiscountCoolingUnitDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/discount_coolingunit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiscountCoolingUnitDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/discount_coolingunit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiscountCoolingUnitDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/discount_coolingunit.png");
	}
}
