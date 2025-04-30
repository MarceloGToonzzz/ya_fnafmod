package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ScrapLolaChicaBlockDisplayItem;

public class ScrapLolaChicaBlockDisplayModel extends GeoModel<ScrapLolaChicaBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ScrapLolaChicaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/scrap_lola_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScrapLolaChicaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/scrap_lola_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScrapLolaChicaBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_lolachicascrap.png");
	}
}
