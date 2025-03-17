package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ShopSignRareFindsAuctionDisplayItem;

public class ShopSignRareFindsAuctionDisplayModel extends GeoModel<ShopSignRareFindsAuctionDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ShopSignRareFindsAuctionDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/flatsign1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShopSignRareFindsAuctionDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/flatsign1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShopSignRareFindsAuctionDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/sign_rfa.png");
	}
}
