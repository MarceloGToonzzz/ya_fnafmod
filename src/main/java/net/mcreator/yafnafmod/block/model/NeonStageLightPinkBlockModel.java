package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.NeonStageLightPinkTileEntity;

public class NeonStageLightPinkBlockModel extends GeoModel<NeonStageLightPinkTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightPinkTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/stagelight_neon_ceiling.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/stagelight_neon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightPinkTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/stagelight_neon_ceiling.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/stagelight_neon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightPinkTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_neon_pink.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_neon_pink.png");
	}
}
