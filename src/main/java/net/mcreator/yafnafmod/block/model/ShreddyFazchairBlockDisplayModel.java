package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ShreddyFazchairBlockDisplayItem;

public class ShreddyFazchairBlockDisplayModel extends GeoModel<ShreddyFazchairBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ShreddyFazchairBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/shreddy_fazchair.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShreddyFazchairBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/shreddy_fazchair.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShreddyFazchairBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/shreddy_fazchair.png");
	}
}
