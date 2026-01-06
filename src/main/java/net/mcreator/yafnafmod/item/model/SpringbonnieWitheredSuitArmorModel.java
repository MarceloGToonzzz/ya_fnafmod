package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.SpringbonnieWitheredSuitArmorItem;

public class SpringbonnieWitheredSuitArmorModel extends GeoModel<SpringbonnieWitheredSuitArmorItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringbonnieWitheredSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie_suit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringbonnieWitheredSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie_suit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringbonnieWitheredSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/springbonnie_suit_withered.png");
	}
}
