package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RetroBonnieBlockTileEntity;

public class RetroBonnieBlockBlockModel extends GeoModel<RetroBonnieBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroBonnieBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/retro_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroBonnieBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/retro_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroBonnieBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_retro_bonnie.png");
	}
}
