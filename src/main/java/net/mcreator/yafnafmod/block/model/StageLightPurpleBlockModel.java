package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.StageLightPurpleTileEntity;

public class StageLightPurpleBlockModel extends GeoModel<StageLightPurpleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StageLightPurpleTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/stagelight_floor.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/stagelight.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "animations/stagelight_floor.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/stagelight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightPurpleTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/stagelight_floor.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/stagelight.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "geo/stagelight_floor.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/stagelight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightPurpleTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_off.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_purple.png");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_purple.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_off.png");
	}
}
