package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.GusThePugBlockTileEntity;

public class GusThePugBlockBlockModel extends GeoModel<GusThePugBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GusThePugBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/gus_the_pug.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/gus_the_pug.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GusThePugBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/gus_the_pug.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/gus_the_pug.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GusThePugBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_gus_the_pug_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_gus_the_pug.png");
	}
}
