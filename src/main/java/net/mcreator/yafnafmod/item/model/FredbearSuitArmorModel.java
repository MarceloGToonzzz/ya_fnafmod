package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.FredbearSuitArmorItem;

public class FredbearSuitArmorModel extends GeoModel<FredbearSuitArmorItem> {
	@Override
	public ResourceLocation getAnimationResource(FredbearSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/fredbear_suit_armor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/fredbear_suit_armor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/fredbear_suit.png");
	}
}
