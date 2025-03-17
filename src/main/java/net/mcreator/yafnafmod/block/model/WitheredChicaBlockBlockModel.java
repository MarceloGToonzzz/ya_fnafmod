package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.WitheredChicaBlockTileEntity;

public class WitheredChicaBlockBlockModel extends GeoModel<WitheredChicaBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/withered_chica.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/withered_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/withered_chica.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/withered_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_chica_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_chica.png");
	}
}
