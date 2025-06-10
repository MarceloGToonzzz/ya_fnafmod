package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BalloonBoyBlockTileEntity;

public class BalloonBoyBlockBlockModel extends GeoModel<BalloonBoyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BalloonBoyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloonBoyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloonBoyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_bb.png");
	}
}
