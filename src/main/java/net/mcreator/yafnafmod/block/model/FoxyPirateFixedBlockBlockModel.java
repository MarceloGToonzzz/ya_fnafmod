package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FoxyPirateFixedBlockTileEntity;

public class FoxyPirateFixedBlockBlockModel extends GeoModel<FoxyPirateFixedBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateFixedBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/foxypirate.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/foxypirate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateFixedBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/foxypirate.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/foxypirate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateFixedBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_foxy_pirate_fixed_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_foxy_pirate_fixed.png");
	}
}
