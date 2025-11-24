package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.SpringtrapBlockTileEntity;

public class SpringtrapBlockBlockModel extends GeoModel<SpringtrapBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringtrapBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/springtrap.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/springtrap.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringtrapBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/springtrap.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/springtrap.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringtrapBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_springtrap-skin.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_springtrap.png");
	}
}
