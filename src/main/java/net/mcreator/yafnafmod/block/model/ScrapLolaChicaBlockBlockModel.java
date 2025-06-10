package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ScrapLolaChicaBlockTileEntity;

public class ScrapLolaChicaBlockBlockModel extends GeoModel<ScrapLolaChicaBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ScrapLolaChicaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/scrap_lola_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScrapLolaChicaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/scrap_lola_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScrapLolaChicaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_lolachicascrap.png");
	}
}
