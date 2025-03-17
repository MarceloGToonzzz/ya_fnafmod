package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BigSecurityDoorTileEntity;

public class BigSecurityDoorBlockModel extends GeoModel<BigSecurityDoorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BigSecurityDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/big_securitydoor_open.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/big_securitydoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigSecurityDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/big_securitydoor_open.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/big_securitydoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigSecurityDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/big_securitydoor.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/big_securitydoor.png");
	}
}
