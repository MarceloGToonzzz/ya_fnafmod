package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FoxyPirateBlockTileEntity;

public class FoxyPirateBlockBlockModel extends GeoModel<FoxyPirateBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/foxypirate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/foxypirate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_foxy_pirate.png");
	}
}
