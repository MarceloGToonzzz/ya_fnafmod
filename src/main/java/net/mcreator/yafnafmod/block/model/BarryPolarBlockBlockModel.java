package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BarryPolarBlockTileEntity;

public class BarryPolarBlockBlockModel extends GeoModel<BarryPolarBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BarryPolarBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/barrypolar.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/barrypolar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BarryPolarBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/barrypolar.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/barrypolar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BarryPolarBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_barrypolar_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_barrypolar.png");
	}
}
