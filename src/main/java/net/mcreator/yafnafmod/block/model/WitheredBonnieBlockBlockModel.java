package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.WitheredBonnieBlockTileEntity;

public class WitheredBonnieBlockBlockModel extends GeoModel<WitheredBonnieBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/withered_bonnie.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/withered_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/withered_bonnie.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/withered_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_bonnie_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_bonnie.png");
	}
}
