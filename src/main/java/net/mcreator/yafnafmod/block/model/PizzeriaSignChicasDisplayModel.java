package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzeriaSignChicasDisplayItem;

public class PizzeriaSignChicasDisplayModel extends GeoModel<PizzeriaSignChicasDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignChicasDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignChicasDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignChicasDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fnafslsign3.png");
	}
}
