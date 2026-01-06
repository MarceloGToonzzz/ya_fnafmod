package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.FreddySuitArmorSkinItem;

public class FreddySuitArmorSkinModel extends GeoModel<FreddySuitArmorSkinItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddySuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/fredbear_suit_armor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddySuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/fredbear_suit_armor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddySuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/freddyretro_suit-skin.png");
	}
}
