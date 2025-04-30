package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.LolaChicaBlockDisplayItem;

public class LolaChicaBlockDisplayModel extends GeoModel<LolaChicaBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LolaChicaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/lola_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LolaChicaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/lola_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LolaChicaBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_lolachica.png");
	}
}
