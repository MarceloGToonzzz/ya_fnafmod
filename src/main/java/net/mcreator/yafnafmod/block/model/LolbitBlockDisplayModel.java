package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.LolbitBlockDisplayItem;

public class LolbitBlockDisplayModel extends GeoModel<LolbitBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LolbitBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/funtime_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LolbitBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/funtime_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LolbitBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_lolbit.png");
	}
}
