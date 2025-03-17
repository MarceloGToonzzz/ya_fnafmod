package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PizzeriaSignBabysTileEntity;

public class PizzeriaSignBabysBlockModel extends GeoModel<PizzeriaSignBabysTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignBabysTileEntity animatable) {
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
	public ResourceLocation getModelResource(PizzeriaSignBabysTileEntity animatable) {
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
	public ResourceLocation getTextureResource(PizzeriaSignBabysTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/fnafslsign1.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/fnafslsign1.png");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "textures/block/fnafslsign1.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/fnafslsign1.png");
	}
}
