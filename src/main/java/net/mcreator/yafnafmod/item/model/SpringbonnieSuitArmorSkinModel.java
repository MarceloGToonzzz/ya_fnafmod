package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.SpringbonnieSuitArmorSkinItem;

public class SpringbonnieSuitArmorSkinModel extends GeoModel<SpringbonnieSuitArmorSkinItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringbonnieSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie_suit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringbonnieSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie_suit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringbonnieSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/springbonnie_suit-skin.png");
	}
}
