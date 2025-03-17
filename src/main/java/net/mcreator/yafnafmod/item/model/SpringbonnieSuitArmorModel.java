package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.SpringbonnieSuitArmorItem;

public class SpringbonnieSuitArmorModel extends GeoModel<SpringbonnieSuitArmorItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringbonnieSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie_suit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringbonnieSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie_suit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringbonnieSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/springbonnie_suit.png");
	}
}
