package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BonnieStandTileEntity;

public class BonnieStandBlockModel extends GeoModel<BonnieStandTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieStandTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/bonnie_stand_diag.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/bonnie_stand.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieStandTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/bonnie_stand_diag.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/bonnie_stand.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieStandTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/stand_bonnie.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/stand_bonnie.png");
	}
}
