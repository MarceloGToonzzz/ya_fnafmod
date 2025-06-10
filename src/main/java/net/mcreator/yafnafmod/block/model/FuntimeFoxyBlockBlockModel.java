package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FuntimeFoxyBlockTileEntity;

public class FuntimeFoxyBlockBlockModel extends GeoModel<FuntimeFoxyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeFoxyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/funtime_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeFoxyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/funtime_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeFoxyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_ftfoxy.png");
	}
}
