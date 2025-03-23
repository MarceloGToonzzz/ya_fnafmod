package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.MrCanDoBlockTileEntity;

public class MrCanDoBlockBlockModel extends GeoModel<MrCanDoBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MrCanDoBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/mr_can_do.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrCanDoBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/mr_can_do.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrCanDoBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_mr_can_do.png");
	}
}
