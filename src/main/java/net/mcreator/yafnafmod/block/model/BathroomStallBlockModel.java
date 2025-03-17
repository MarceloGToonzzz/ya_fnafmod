package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BathroomStallTileEntity;

public class BathroomStallBlockModel extends GeoModel<BathroomStallTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BathroomStallTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/bathroom_stall_open.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/bathroom_stall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BathroomStallTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/bathroom_stall_open.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/bathroom_stall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BathroomStallTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/bathroom_stall.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/bathroom_stall.png");
	}
}
