package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PizzeriaSignFredbearsAltTileEntity;

public class PizzeriaSignFredbearsAltBlockModel extends GeoModel<PizzeriaSignFredbearsAltTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignFredbearsAltTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign2_offset.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign2.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign2_offset.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignFredbearsAltTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign2_offset.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign2.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign2_offset.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignFredbearsAltTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/fnaf4sign2.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/fnaf4sign2.png");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "textures/block/fnaf4sign2.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/fnaf4sign2.png");
	}
}
