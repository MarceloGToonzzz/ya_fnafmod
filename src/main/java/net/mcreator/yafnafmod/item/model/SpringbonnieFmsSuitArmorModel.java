package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.SpringbonnieFmsSuitArmorItem;

public class SpringbonnieFmsSuitArmorModel extends GeoModel<SpringbonnieFmsSuitArmorItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringbonnieFmsSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie_suit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringbonnieFmsSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie_suit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringbonnieFmsSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/springbonnie_suit_fms.png");
	}
}
