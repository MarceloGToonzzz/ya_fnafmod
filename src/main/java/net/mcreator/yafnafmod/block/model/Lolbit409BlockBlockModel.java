package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.Lolbit409BlockTileEntity;

public class Lolbit409BlockBlockModel extends GeoModel<Lolbit409BlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Lolbit409BlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/lolbit_409.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/lolbit_409.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Lolbit409BlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/lolbit_409.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/lolbit_409.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Lolbit409BlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_lolbit_409_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_lolbit_409.png");
	}
}
