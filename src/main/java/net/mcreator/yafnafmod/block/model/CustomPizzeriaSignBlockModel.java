package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CustomPizzeriaSignTileEntity;

public class CustomPizzeriaSignBlockModel extends GeoModel<CustomPizzeriaSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CustomPizzeriaSignTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/pizzeriasign_generic.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/pizzeriasign_generic.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "animations/pizzeriasign_generic.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/pizzeriasign_generic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CustomPizzeriaSignTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/pizzeriasign_generic.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/pizzeriasign_generic.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "geo/pizzeriasign_generic.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/pizzeriasign_generic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CustomPizzeriaSignTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/pizzeriasign_generic2.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/pizzeriasign_generic3.png");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "textures/block/pizzeriasign_generic4.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzeriasign_generic1.png");
	}
}
