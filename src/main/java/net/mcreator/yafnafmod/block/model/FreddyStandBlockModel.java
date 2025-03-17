package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FreddyStandTileEntity;

public class FreddyStandBlockModel extends GeoModel<FreddyStandTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyStandTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/freddy_stand_diag.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/freddy_stand.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyStandTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/freddy_stand_diag.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/freddy_stand.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyStandTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/stand_freddy.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/stand_freddy.png");
	}
}
