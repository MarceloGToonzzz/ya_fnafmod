package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.IndigoBlockDisplayItem;

public class IndigoBlockDisplayModel extends GeoModel<IndigoBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IndigoBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/funtime_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IndigoBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/funtime_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IndigoBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_indigo.png");
	}
}
