package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.YellowRabbitSuitArmorItem;

public class YellowRabbitSuitArmorModel extends GeoModel<YellowRabbitSuitArmorItem> {
	@Override
	public ResourceLocation getAnimationResource(YellowRabbitSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie_suit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowRabbitSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie_suit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowRabbitSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/yellowrabbit_suit.png");
	}
}
