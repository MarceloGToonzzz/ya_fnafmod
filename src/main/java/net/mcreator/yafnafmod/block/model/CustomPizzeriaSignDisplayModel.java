package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CustomPizzeriaSignDisplayItem;

public class CustomPizzeriaSignDisplayModel extends GeoModel<CustomPizzeriaSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CustomPizzeriaSignDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzeriasign_generic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CustomPizzeriaSignDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzeriasign_generic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CustomPizzeriaSignDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzeriasign_generic1.png");
	}
}
