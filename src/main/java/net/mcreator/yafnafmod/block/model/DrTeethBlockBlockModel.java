package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DrTeethBlockTileEntity;

public class DrTeethBlockBlockModel extends GeoModel<DrTeethBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DrTeethBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/bidybab.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/bidybab.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrTeethBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/bidybab.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/bidybab.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrTeethBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_drteeth_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_drteeth.png");
	}
}
