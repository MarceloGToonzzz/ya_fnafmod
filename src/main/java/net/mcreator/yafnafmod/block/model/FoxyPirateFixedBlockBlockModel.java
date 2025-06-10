package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FoxyPirateFixedBlockTileEntity;

public class FoxyPirateFixedBlockBlockModel extends GeoModel<FoxyPirateFixedBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateFixedBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/foxypirate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateFixedBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/foxypirate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateFixedBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_foxy_pirate_fixed.png");
	}
}
