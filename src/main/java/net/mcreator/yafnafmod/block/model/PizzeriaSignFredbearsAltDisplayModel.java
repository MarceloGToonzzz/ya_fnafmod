package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzeriaSignFredbearsAltDisplayItem;

public class PizzeriaSignFredbearsAltDisplayModel extends GeoModel<PizzeriaSignFredbearsAltDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignFredbearsAltDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignFredbearsAltDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignFredbearsAltDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fnaf4sign2.png");
	}
}
