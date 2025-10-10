package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RetroBonnieBlockTileEntity;

public class RetroBonnieBlockBlockModel extends GeoModel<RetroBonnieBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroBonnieBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/retro_bonnie.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/retro_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroBonnieBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/retro_bonnie.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/retro_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroBonnieBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_retro_bonnie-skin.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_retro_bonnie.png");
	}
}
