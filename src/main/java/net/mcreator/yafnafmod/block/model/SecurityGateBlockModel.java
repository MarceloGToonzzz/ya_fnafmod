package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.SecurityGateTileEntity;

public class SecurityGateBlockModel extends GeoModel<SecurityGateTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SecurityGateTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/securitygate.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/securitygate.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "animations/securitygate.animation.json");
		if (blockstate == 4)
			return new ResourceLocation("ya_fnafmod", "animations/securitygate.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/securitygate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SecurityGateTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/securitygate.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/securitygate.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "geo/securitygate.geo.json");
		if (blockstate == 4)
			return new ResourceLocation("ya_fnafmod", "geo/securitygate.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/securitygate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SecurityGateTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/securitygate.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/securitygatebottom.png");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "textures/block/securitygatemiddle.png");
		if (blockstate == 4)
			return new ResourceLocation("ya_fnafmod", "textures/block/securitygatetop.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/securitygate.png");
	}
}
