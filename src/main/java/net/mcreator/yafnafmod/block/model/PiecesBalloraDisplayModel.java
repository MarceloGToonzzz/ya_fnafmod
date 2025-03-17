package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PiecesBalloraDisplayItem;

public class PiecesBalloraDisplayModel extends GeoModel<PiecesBalloraDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PiecesBalloraDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pieces_ballora.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PiecesBalloraDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pieces_ballora.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PiecesBalloraDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ballora.png");
	}
}
