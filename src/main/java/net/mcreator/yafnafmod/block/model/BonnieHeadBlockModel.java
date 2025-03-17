package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BonnieHeadTileEntity;

public class BonnieHeadBlockModel extends GeoModel<BonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieHeadTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/bonnie_head_diag1.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/bonnie_head_diag2.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "animations/bonnie_head_hori1.animation.json");
		if (blockstate == 4)
			return new ResourceLocation("ya_fnafmod", "animations/bonnie_head_hori2.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/bonnie_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieHeadTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/bonnie_head_diag1.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/bonnie_head_diag2.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "geo/bonnie_head_hori1.geo.json");
		if (blockstate == 4)
			return new ResourceLocation("ya_fnafmod", "geo/bonnie_head_hori2.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/bonnie_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieHeadTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/head_bonniebunny.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/head_bonniebunny.png");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "textures/block/head_bonniebunny.png");
		if (blockstate == 4)
			return new ResourceLocation("ya_fnafmod", "textures/block/head_bonniebunny.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/head_bonniebunny.png");
	}
}
