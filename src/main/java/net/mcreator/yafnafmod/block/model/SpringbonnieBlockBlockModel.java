package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.SpringbonnieBlockTileEntity;

public class SpringbonnieBlockBlockModel extends GeoModel<SpringbonnieBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringbonnieBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/springbonnie.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringbonnieBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/springbonnie.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringbonnieBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_springbonnie_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_springbonnie.png");
	}
}
