package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PiecesFuntimeFreddyDisplayItem;

public class PiecesFuntimeFreddyDisplayModel extends GeoModel<PiecesFuntimeFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PiecesFuntimeFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pieces_ftfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PiecesFuntimeFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pieces_ftfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PiecesFuntimeFreddyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ftfreddy.png");
	}
}
