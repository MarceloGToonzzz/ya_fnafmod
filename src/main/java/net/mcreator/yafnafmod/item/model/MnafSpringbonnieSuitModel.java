package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.MnafSpringbonnieSuitItem;

public class MnafSpringbonnieSuitModel extends GeoModel<MnafSpringbonnieSuitItem> {
	@Override
	public ResourceLocation getAnimationResource(MnafSpringbonnieSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/mnaf_springbonniesuit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MnafSpringbonnieSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/mnaf_springbonniesuit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MnafSpringbonnieSuitItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/mnaf_springbonniesuit.png");
	}
}
