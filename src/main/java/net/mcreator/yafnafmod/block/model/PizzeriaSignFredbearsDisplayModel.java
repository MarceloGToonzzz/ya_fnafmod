package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzeriaSignFredbearsDisplayItem;

public class PizzeriaSignFredbearsDisplayModel extends GeoModel<PizzeriaSignFredbearsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignFredbearsDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignFredbearsDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignFredbearsDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fnaf4sign.png");
	}
}
