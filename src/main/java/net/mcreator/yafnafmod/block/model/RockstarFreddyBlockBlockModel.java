package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RockstarFreddyBlockTileEntity;

public class RockstarFreddyBlockBlockModel extends GeoModel<RockstarFreddyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockstarFreddyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/rockstar_freddy.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/rockstar_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockstarFreddyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/rockstar_freddy.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/rockstar_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockstarFreddyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_rockstar_freddy_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_rockstar_freddy.png");
	}
}
