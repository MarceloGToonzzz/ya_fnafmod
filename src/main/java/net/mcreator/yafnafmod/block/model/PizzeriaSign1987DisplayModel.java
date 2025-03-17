package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzeriaSign1987DisplayItem;

public class PizzeriaSign1987DisplayModel extends GeoModel<PizzeriaSign1987DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSign1987DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSign1987DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSign1987DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fnaf2sign.png");
	}
}
