package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.NumberOneCrateBlockDisplayItem;

public class NumberOneCrateBlockDisplayModel extends GeoModel<NumberOneCrateBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NumberOneCrateBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/numberone_crate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NumberOneCrateBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/numberone_crate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NumberOneCrateBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_no1_crate.png");
	}
}
