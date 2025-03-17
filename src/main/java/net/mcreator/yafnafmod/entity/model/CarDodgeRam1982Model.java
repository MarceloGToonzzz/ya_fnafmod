package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.CarDodgeRam1982Entity;

public class CarDodgeRam1982Model extends GeoModel<CarDodgeRam1982Entity> {
	@Override
	public ResourceLocation getAnimationResource(CarDodgeRam1982Entity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/car_dodge_ram_1982.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarDodgeRam1982Entity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/car_dodge_ram_1982.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarDodgeRam1982Entity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
