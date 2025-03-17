package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.NeonSignArcadeTileEntity;

public class NeonSignArcadeBlockModel extends GeoModel<NeonSignArcadeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonSignArcadeTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/neon_sign_text.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonSignArcadeTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/neon_sign_text.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonSignArcadeTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/neonsign_text_red_arcade.png");
	}
}
