package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.IgnitedChicaBlockTileEntity;

public class IgnitedChicaBlockBlockModel extends GeoModel<IgnitedChicaBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IgnitedChicaBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/ignited_chica.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/ignited_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IgnitedChicaBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/ignited_chica.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/ignited_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IgnitedChicaBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_ignited_chica_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_ignited_chica.png");
	}
}
