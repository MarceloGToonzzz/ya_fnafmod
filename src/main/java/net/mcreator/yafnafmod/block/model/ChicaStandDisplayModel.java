package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ChicaStandDisplayItem;

public class ChicaStandDisplayModel extends GeoModel<ChicaStandDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaStandDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/chica_stand.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaStandDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/chica_stand.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaStandDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stand_chica.png");
	}
}
