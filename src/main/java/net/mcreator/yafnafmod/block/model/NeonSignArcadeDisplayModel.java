package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.NeonSignArcadeDisplayItem;

public class NeonSignArcadeDisplayModel extends GeoModel<NeonSignArcadeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonSignArcadeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/neon_sign_text.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonSignArcadeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/neon_sign_text.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonSignArcadeDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/neonsign_text_red_arcade.png");
	}
}
