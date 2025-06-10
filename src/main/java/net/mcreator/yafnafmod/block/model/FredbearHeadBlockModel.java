package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FredbearHeadTileEntity;

public class FredbearHeadBlockModel extends GeoModel<FredbearHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_fredbear.png");
	}
}
