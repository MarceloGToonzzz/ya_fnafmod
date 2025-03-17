package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CarDodgeRam1982BlockDisplayItem;

public class CarDodgeRam1982BlockDisplayModel extends GeoModel<CarDodgeRam1982BlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarDodgeRam1982BlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/car_dodge_ram_1982.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarDodgeRam1982BlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/car_dodge_ram_1982.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarDodgeRam1982BlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/car_dodge_ram_1982.png");
	}
}
