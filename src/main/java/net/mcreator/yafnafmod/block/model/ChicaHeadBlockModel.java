package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ChicaHeadTileEntity;

public class ChicaHeadBlockModel extends GeoModel<ChicaHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaHeadTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/chica_head_diag1.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/chica_head_diag2.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "animations/chica_head_hori1.animation.json");
		if (blockstate == 4)
			return new ResourceLocation("ya_fnafmod", "animations/chica_head_hori2.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/chica_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaHeadTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/chica_head_diag1.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/chica_head_diag2.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "geo/chica_head_hori1.geo.json");
		if (blockstate == 4)
			return new ResourceLocation("ya_fnafmod", "geo/chica_head_hori2.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/chica_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaHeadTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/head_chicachicken.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/head_chicachicken.png");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "textures/block/head_chicachicken.png");
		if (blockstate == 4)
			return new ResourceLocation("ya_fnafmod", "textures/block/head_chicachicken.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/head_chicachicken.png");
	}
}
