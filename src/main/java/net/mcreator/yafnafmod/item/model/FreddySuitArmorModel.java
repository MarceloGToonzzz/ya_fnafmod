package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.FreddySuitArmorItem;

public class FreddySuitArmorModel extends GeoModel<FreddySuitArmorItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddySuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/fredbear_suit_armor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddySuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/fredbear_suit_armor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddySuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/freddyretro_suit.png");
	}
}
