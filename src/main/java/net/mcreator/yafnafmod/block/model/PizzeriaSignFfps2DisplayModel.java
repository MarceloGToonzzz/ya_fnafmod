package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzeriaSignFfps2DisplayItem;

public class PizzeriaSignFfps2DisplayModel extends GeoModel<PizzeriaSignFfps2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignFfps2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignFfps2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignFfps2DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fnaf6sign2.png");
	}
}
