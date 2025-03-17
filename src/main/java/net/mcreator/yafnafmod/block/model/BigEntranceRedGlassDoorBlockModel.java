package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BigEntranceRedGlassDoorTileEntity;

public class BigEntranceRedGlassDoorBlockModel extends GeoModel<BigEntranceRedGlassDoorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BigEntranceRedGlassDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/bigdooropen.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/bigdooropenback.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/bigdoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigEntranceRedGlassDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/bigdooropen.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/bigdooropenback.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/bigdoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigEntranceRedGlassDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_redglassentrance.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_redglassentrance.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_redglassentrance.png");
	}
}
