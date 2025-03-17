package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.NeonSignRestroomTileEntity;

public class NeonSignRestroomBlockModel extends GeoModel<NeonSignRestroomTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonSignRestroomTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/neon_sign_text.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonSignRestroomTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/neon_sign_text.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonSignRestroomTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/neonsign_text_blue_restroom.png");
	}
}
