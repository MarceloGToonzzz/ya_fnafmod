package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ShopSignStansBudgetTechDisplayItem;

public class ShopSignStansBudgetTechDisplayModel extends GeoModel<ShopSignStansBudgetTechDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ShopSignStansBudgetTechDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/flatsign1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShopSignStansBudgetTechDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/flatsign1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShopSignStansBudgetTechDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/sign_sbt.png");
	}
}
