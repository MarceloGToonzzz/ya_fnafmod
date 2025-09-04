package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PizzeriaSignMovieLargeTileEntity;

public class PizzeriaSignMovieLargeBlockModel extends GeoModel<PizzeriaSignMovieLargeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignMovieLargeTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/large_pizzeria_sign-offset.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/large_pizzeria_sign.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "animations/large_pizzeria_sign-offset.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/large_pizzeria_sign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignMovieLargeTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/large_pizzeria_sign-offset.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/large_pizzeria_sign.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "geo/large_pizzeria_sign-offset.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/large_pizzeria_sign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignMovieLargeTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/pizzeriasign-large-fnafmovie1.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/pizzeriasign-large-fnafmovie1-on.png");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "textures/block/pizzeriasign-large-fnafmovie1.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzeriasign-large-fnafmovie1.png");
	}
}
