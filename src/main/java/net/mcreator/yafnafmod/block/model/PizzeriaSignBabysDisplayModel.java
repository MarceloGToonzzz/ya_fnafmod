package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzeriaSignBabysDisplayItem;

public class PizzeriaSignBabysDisplayModel extends GeoModel<PizzeriaSignBabysDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignBabysDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignBabysDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignBabysDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fnafslsign1.png");
	}
}
