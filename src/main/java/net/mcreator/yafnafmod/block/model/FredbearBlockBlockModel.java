package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FredbearBlockTileEntity;

public class FredbearBlockBlockModel extends GeoModel<FredbearBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_fredbear.png");
	}
}
