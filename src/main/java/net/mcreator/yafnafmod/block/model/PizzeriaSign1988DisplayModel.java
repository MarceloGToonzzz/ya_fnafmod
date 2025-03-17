package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzeriaSign1988DisplayItem;

public class PizzeriaSign1988DisplayModel extends GeoModel<PizzeriaSign1988DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSign1988DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSign1988DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSign1988DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fnaf1sign.png");
	}
}
