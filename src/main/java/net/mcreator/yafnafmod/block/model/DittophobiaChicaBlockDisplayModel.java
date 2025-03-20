package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DittophobiaChicaBlockDisplayItem;

public class DittophobiaChicaBlockDisplayModel extends GeoModel<DittophobiaChicaBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DittophobiaChicaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dittophobia_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DittophobiaChicaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dittophobia_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DittophobiaChicaBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/dittophobia_chica.png");
	}
}
