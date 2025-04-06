package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzeriaSignJrs2DisplayItem;

public class PizzeriaSignJrs2DisplayModel extends GeoModel<PizzeriaSignJrs2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignJrs2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignJrs2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignJrs2DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fnaf6sign_jrs2.png");
	}
}
