package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.NeonSignPartyRoomDisplayItem;

public class NeonSignPartyRoomDisplayModel extends GeoModel<NeonSignPartyRoomDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonSignPartyRoomDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/neon_sign_text.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonSignPartyRoomDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/neon_sign_text.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonSignPartyRoomDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/neonsign_text_orange_kitchen.png");
	}
}
