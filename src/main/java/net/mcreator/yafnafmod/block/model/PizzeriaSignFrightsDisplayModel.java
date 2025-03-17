package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzeriaSignFrightsDisplayItem;

public class PizzeriaSignFrightsDisplayModel extends GeoModel<PizzeriaSignFrightsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignFrightsDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignFrightsDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignFrightsDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fnaf3sign.png");
	}
}
