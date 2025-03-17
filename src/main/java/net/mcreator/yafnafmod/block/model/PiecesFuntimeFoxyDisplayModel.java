package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PiecesFuntimeFoxyDisplayItem;

public class PiecesFuntimeFoxyDisplayModel extends GeoModel<PiecesFuntimeFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PiecesFuntimeFoxyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pieces_ftfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PiecesFuntimeFoxyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pieces_ftfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PiecesFuntimeFoxyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ftfoxy.png");
	}
}
