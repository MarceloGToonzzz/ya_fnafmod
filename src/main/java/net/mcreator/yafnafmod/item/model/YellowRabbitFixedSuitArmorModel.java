package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.YellowRabbitFixedSuitArmorItem;

public class YellowRabbitFixedSuitArmorModel extends GeoModel<YellowRabbitFixedSuitArmorItem> {
	@Override
	public ResourceLocation getAnimationResource(YellowRabbitFixedSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie_suit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowRabbitFixedSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie_suit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowRabbitFixedSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/yellowrabbit_suit_fixed.png");
	}
}
