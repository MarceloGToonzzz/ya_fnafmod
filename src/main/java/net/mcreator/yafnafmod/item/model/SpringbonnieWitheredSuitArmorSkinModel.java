package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.SpringbonnieWitheredSuitArmorSkinItem;

public class SpringbonnieWitheredSuitArmorSkinModel extends GeoModel<SpringbonnieWitheredSuitArmorSkinItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringbonnieWitheredSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie_suit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringbonnieWitheredSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie_suit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringbonnieWitheredSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/springbonnie_suit_withered-skin.png");
	}
}
