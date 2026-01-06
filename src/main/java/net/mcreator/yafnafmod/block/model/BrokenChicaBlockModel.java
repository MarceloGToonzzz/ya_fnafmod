package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BrokenChicaTileEntity;

public class BrokenChicaBlockModel extends GeoModel<BrokenChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenChicaTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/broken_chica.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/broken_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenChicaTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/broken_chica.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/broken_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenChicaTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_chicachicken_broken-skin.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/broken_chica.png");
	}
}
