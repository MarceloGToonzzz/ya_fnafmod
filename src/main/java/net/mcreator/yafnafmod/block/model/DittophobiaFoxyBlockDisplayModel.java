package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DittophobiaFoxyBlockDisplayItem;

public class DittophobiaFoxyBlockDisplayModel extends GeoModel<DittophobiaFoxyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DittophobiaFoxyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dittophobia_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DittophobiaFoxyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dittophobia_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DittophobiaFoxyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/dittophobia_foxy.png");
	}
}
