package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.NeonSignKitchenTileEntity;

public class NeonSignKitchenBlockModel extends GeoModel<NeonSignKitchenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonSignKitchenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/neon_sign_text.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonSignKitchenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/neon_sign_text.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonSignKitchenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/neonsign_text_yellow_kitchen.png");
	}
}
