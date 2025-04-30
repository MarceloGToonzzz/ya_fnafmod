package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.FredbearFmsSuitArmorItem;

public class FredbearFmsSuitArmorModel extends GeoModel<FredbearFmsSuitArmorItem> {
	@Override
	public ResourceLocation getAnimationResource(FredbearFmsSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/fredbear_suit_armor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearFmsSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/fredbear_suit_armor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearFmsSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/fredbear_suit_fms.png");
	}
}
