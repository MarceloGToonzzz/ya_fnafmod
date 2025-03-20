package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DittophobiaChicaBlockTileEntity;

public class DittophobiaChicaBlockBlockModel extends GeoModel<DittophobiaChicaBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DittophobiaChicaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dittophobia_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DittophobiaChicaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dittophobia_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DittophobiaChicaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/dittophobia_chica.png");
	}
}
