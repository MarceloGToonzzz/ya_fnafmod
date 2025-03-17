package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ProjectorTileEntity;

public class ProjectorBlockModel extends GeoModel<ProjectorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ProjectorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/projector.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/projector.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProjectorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/projector.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/projector.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProjectorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/projector_on.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/projector_off.png");
	}
}
