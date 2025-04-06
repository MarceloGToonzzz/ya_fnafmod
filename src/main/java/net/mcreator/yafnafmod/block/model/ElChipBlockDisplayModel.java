package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ElChipBlockDisplayItem;

public class ElChipBlockDisplayModel extends GeoModel<ElChipBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ElChipBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/el_chip.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ElChipBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/el_chip.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ElChipBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_el_chip.png");
	}
}
