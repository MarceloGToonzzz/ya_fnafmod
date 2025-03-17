package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ShopSignSmilesAndServosTileEntity;

public class ShopSignSmilesAndServosBlockModel extends GeoModel<ShopSignSmilesAndServosTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShopSignSmilesAndServosTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/flatsign1_offcenter.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/flatsign1.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "animations/flatsign1_offcenter.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/flatsign1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShopSignSmilesAndServosTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/flatsign1_offcenter.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/flatsign1.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "geo/flatsign1_offcenter.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/flatsign1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShopSignSmilesAndServosTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/sign_sns.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/sign_sns.png");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "textures/block/sign_sns.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/sign_sns.png");
	}
}
