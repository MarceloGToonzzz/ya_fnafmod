package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.MegaphoneItem;

public class MegaphoneItemModel extends GeoModel<MegaphoneItem> {
	@Override
	public ResourceLocation getAnimationResource(MegaphoneItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/megaphone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MegaphoneItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/megaphone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MegaphoneItem animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/item/megaphone.png");
	}
}
