package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.NeonSignKitchenDisplayItem;

public class NeonSignKitchenDisplayModel extends GeoModel<NeonSignKitchenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonSignKitchenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/neon_sign_text.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonSignKitchenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/neon_sign_text.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonSignKitchenDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/neonsign_text_yellow_kitchen.png");
	}
}
