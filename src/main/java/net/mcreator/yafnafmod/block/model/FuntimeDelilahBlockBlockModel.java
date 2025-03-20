package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FuntimeDelilahBlockTileEntity;

public class FuntimeDelilahBlockBlockModel extends GeoModel<FuntimeDelilahBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeDelilahBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/ftdelilah.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/ftdelilah.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeDelilahBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/ftdelilah.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/ftdelilah.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeDelilahBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_delilah_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_delilah.png");
	}
}
