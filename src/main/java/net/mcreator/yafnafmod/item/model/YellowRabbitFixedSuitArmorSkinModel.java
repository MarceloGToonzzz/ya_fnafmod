package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.YellowRabbitFixedSuitArmorSkinItem;

public class YellowRabbitFixedSuitArmorSkinModel extends GeoModel<YellowRabbitFixedSuitArmorSkinItem> {
	@Override
	public ResourceLocation getAnimationResource(YellowRabbitFixedSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie_suit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowRabbitFixedSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie_suit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowRabbitFixedSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/yellowrabbit_suit_fixed-skin.png");
	}
}
