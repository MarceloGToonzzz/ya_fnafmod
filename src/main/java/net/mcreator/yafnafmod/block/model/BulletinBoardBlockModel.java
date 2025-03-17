package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BulletinBoardTileEntity;

public class BulletinBoardBlockModel extends GeoModel<BulletinBoardTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BulletinBoardTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/bulletinboard.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/bulletinboard.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BulletinBoardTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/bulletinboard.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/bulletinboard.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BulletinBoardTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/bulletinboard.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/bulletinboard_blank.png");
	}
}
