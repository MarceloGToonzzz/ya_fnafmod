package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DittophobiaFreddyBlockDisplayItem;

public class DittophobiaFreddyBlockDisplayModel extends GeoModel<DittophobiaFreddyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DittophobiaFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dittophobia_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DittophobiaFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dittophobia_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DittophobiaFreddyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/dittophobia_freddy.png");
	}
}
