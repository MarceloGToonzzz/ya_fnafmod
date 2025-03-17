package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzeriaSignFfpsDisplayItem;

public class PizzeriaSignFfpsDisplayModel extends GeoModel<PizzeriaSignFfpsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignFfpsDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignFfpsDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignFfpsDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fnaf6sign1.png");
	}
}
