package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.MusicManBlockTileEntity;

public class MusicManBlockBlockModel extends GeoModel<MusicManBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MusicManBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/music_man.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/music_man.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MusicManBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/music_man.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/music_man.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MusicManBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_music_man_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_music_man.png");
	}
}
