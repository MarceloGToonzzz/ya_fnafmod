package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PizzeriaSign1988TileEntity;

public class PizzeriaSign1988BlockModel extends GeoModel<PizzeriaSign1988TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSign1988TileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign_offset.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign_offset.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSign1988TileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign_offset.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign_offset.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSign1988TileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/fnaf1sign.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/fnaf1sign.png");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "textures/block/fnaf1sign.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/fnaf1sign.png");
	}
}
