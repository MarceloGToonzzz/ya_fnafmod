package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.YellowRabbitSuitArmorSkinItem;

public class YellowRabbitSuitArmorSkinModel extends GeoModel<YellowRabbitSuitArmorSkinItem> {
	@Override
	public ResourceLocation getAnimationResource(YellowRabbitSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie_suit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowRabbitSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie_suit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowRabbitSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/yellowrabbit_suit-skin.png");
	}
}
