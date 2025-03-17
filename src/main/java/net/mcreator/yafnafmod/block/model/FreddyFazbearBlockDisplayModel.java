package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FreddyFazbearBlockDisplayItem;

public class FreddyFazbearBlockDisplayModel extends GeoModel<FreddyFazbearBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/freddyfazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/freddyfazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_freddyfazbear.png");
	}
}
