package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CarDodgeRam1982BlockTileEntity;

public class CarDodgeRam1982BlockBlockModel extends GeoModel<CarDodgeRam1982BlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarDodgeRam1982BlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/car_dodge_ram_1982.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarDodgeRam1982BlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/car_dodge_ram_1982.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarDodgeRam1982BlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/car_dodge_ram_1982.png");
	}
}
