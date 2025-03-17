package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzeriaSignBabysAltDisplayItem;

public class PizzeriaSignBabysAltDisplayModel extends GeoModel<PizzeriaSignBabysAltDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignBabysAltDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignBabysAltDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignBabysAltDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fnafslsign2.png");
	}
}
