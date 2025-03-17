package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.TrashTileEntity;

public class TrashBlockModel extends GeoModel<TrashTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/trash.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/trash.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/trash.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/trash.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/trash.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/trash.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/trash2.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/trash3.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/trash1.png");
	}
}
