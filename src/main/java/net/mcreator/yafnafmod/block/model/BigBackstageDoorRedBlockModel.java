package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BigBackstageDoorRedTileEntity;

public class BigBackstageDoorRedBlockModel extends GeoModel<BigBackstageDoorRedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BigBackstageDoorRedTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/bigdooropen.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/bigdooropenback.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/bigdoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigBackstageDoorRedTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/bigdooropen.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/bigdooropenback.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/bigdoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigBackstageDoorRedTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_redbackstage.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_redbackstage.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_redbackstage.png");
	}
}
