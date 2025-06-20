package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.MnafFredbearSuitItem;

public class MnafFredbearSuitModel extends GeoModel<MnafFredbearSuitItem> {
	@Override
	public ResourceLocation getAnimationResource(MnafFredbearSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/mnaf_fredbearsuit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MnafFredbearSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/mnaf_fredbearsuit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MnafFredbearSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/mnaf_fredbearsuit.png");
	}
}
