package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BrokenBonnieTileEntity;

public class BrokenBonnieBlockModel extends GeoModel<BrokenBonnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenBonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/broken_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenBonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/broken_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenBonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/broken_bonnie.png");
	}
}
