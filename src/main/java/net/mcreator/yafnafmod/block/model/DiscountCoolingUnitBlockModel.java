package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DiscountCoolingUnitTileEntity;

public class DiscountCoolingUnitBlockModel extends GeoModel<DiscountCoolingUnitTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DiscountCoolingUnitTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/discount_coolingunit_animated.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/discount_coolingunit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiscountCoolingUnitTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/discount_coolingunit_animated.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/discount_coolingunit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiscountCoolingUnitTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/discount_coolingunit.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/discount_coolingunit.png");
	}
}
