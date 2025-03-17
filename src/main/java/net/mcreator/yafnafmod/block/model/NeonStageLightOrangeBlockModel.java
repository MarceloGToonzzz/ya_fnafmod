package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.NeonStageLightOrangeTileEntity;

public class NeonStageLightOrangeBlockModel extends GeoModel<NeonStageLightOrangeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightOrangeTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/stagelight_neon_ceiling.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/stagelight_neon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightOrangeTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/stagelight_neon_ceiling.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/stagelight_neon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightOrangeTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_neon_orange.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_neon_orange.png");
	}
}
