package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.Endo02PileTileEntity;

public class Endo02PileBlockModel extends GeoModel<Endo02PileTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02PileTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/endopile.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/endopile.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02PileTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/endopile.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/endopile.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02PileTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/endo02pile_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_endo2.png");
	}
}
