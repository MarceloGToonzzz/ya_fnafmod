package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PiecesBalloraTileEntity;

public class PiecesBalloraBlockModel extends GeoModel<PiecesBalloraTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PiecesBalloraTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pieces_ballora.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PiecesBalloraTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pieces_ballora.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PiecesBalloraTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ballora.png");
	}
}
