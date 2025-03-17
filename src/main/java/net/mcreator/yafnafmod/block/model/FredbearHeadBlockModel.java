package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FredbearHeadTileEntity;

public class FredbearHeadBlockModel extends GeoModel<FredbearHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearHeadTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/freddy_head_diag1.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/freddy_head_diag2.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "animations/freddy_head_hori1.animation.json");
		if (blockstate == 4)
			return new ResourceLocation("ya_fnafmod", "animations/freddy_head_hori2.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/freddy_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearHeadTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/freddy_head_diag1.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/freddy_head_diag2.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "geo/freddy_head_hori1.geo.json");
		if (blockstate == 4)
			return new ResourceLocation("ya_fnafmod", "geo/freddy_head_hori2.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/freddy_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearHeadTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/head_fredbear.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/head_fredbear.png");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "textures/block/head_fredbear.png");
		if (blockstate == 4)
			return new ResourceLocation("ya_fnafmod", "textures/block/head_fredbear.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/head_fredbear.png");
	}
}
