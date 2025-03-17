package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ShopSignDumpsterDiverDisplayItem;

public class ShopSignDumpsterDiverDisplayModel extends GeoModel<ShopSignDumpsterDiverDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ShopSignDumpsterDiverDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/flatsign1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShopSignDumpsterDiverDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/flatsign1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShopSignDumpsterDiverDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/sign_ddw.png");
	}
}
