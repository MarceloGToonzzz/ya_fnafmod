package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.MnafGoldenFreddySuitItem;

public class MnafGoldenFreddySuitModel extends GeoModel<MnafGoldenFreddySuitItem> {
	@Override
	public ResourceLocation getAnimationResource(MnafGoldenFreddySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/mnaf_freddysuit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MnafGoldenFreddySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/mnaf_freddysuit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MnafGoldenFreddySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/mnaf_goldenfreddysuit.png");
	}
}
