package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PinTheBowtieToyFreddyDisplayItem;

public class PinTheBowtieToyFreddyDisplayModel extends GeoModel<PinTheBowtieToyFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PinTheBowtieToyFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pinthebowtie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinTheBowtieToyFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pinthebowtie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinTheBowtieToyFreddyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pinthebowtie_toy.png");
	}
}
