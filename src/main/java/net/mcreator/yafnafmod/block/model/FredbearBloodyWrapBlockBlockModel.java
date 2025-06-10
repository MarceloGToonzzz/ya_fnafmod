package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FredbearBloodyWrapBlockTileEntity;

public class FredbearBloodyWrapBlockBlockModel extends GeoModel<FredbearBloodyWrapBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearBloodyWrapBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fredbear_bloody.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearBloodyWrapBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fredbear_bloody.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearBloodyWrapBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fredbear_bloodywrap.png");
	}
}
