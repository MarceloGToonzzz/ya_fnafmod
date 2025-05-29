package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CustomPizzeriaSignTileEntity;

public class CustomPizzeriaSignBlockModel extends GeoModel<CustomPizzeriaSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CustomPizzeriaSignTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzeriasign_generic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CustomPizzeriaSignTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzeriasign_generic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CustomPizzeriaSignTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzeriasign_generic1.png");
	}
}
