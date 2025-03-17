package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.NeonSignRestroomDisplayItem;

public class NeonSignRestroomDisplayModel extends GeoModel<NeonSignRestroomDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonSignRestroomDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/neon_sign_text.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonSignRestroomDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/neon_sign_text.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonSignRestroomDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/neonsign_text_blue_restroom.png");
	}
}
