package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ShopSignSmilesAndServosDisplayItem;

public class ShopSignSmilesAndServosDisplayModel extends GeoModel<ShopSignSmilesAndServosDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ShopSignSmilesAndServosDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/flatsign1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShopSignSmilesAndServosDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/flatsign1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShopSignSmilesAndServosDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/sign_sns.png");
	}
}
