package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.MrHippoBlockTileEntity;

public class MrHippoBlockBlockModel extends GeoModel<MrHippoBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MrHippoBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/mr_hippo.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/mr_hippo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrHippoBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/mr_hippo.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/mr_hippo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrHippoBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_mr_hippo_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_mr_hippo.png");
	}
}
