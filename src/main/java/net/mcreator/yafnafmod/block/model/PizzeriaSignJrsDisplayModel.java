package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzeriaSignJrsDisplayItem;

public class PizzeriaSignJrsDisplayModel extends GeoModel<PizzeriaSignJrsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignJrsDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignJrsDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignJrsDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fnaf6sign_jrs1.png");
	}
}
