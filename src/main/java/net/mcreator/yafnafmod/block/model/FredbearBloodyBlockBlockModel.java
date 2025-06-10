package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FredbearBloodyBlockTileEntity;

public class FredbearBloodyBlockBlockModel extends GeoModel<FredbearBloodyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearBloodyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fredbear_bloody.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearBloodyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fredbear_bloody.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearBloodyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fredbear_bloody.png");
	}
}
