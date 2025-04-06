package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FuntimeChicaBlockTileEntity;

public class FuntimeChicaBlockBlockModel extends GeoModel<FuntimeChicaBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeChicaBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/funtime_chica.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/funtime_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeChicaBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/funtime_chica.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/funtime_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeChicaBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_ftchica_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_ftchica.png");
	}
}
