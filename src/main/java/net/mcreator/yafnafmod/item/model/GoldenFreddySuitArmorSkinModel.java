package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.GoldenFreddySuitArmorSkinItem;

public class GoldenFreddySuitArmorSkinModel extends GeoModel<GoldenFreddySuitArmorSkinItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldenFreddySuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/fredbear_suit_armor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenFreddySuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/fredbear_suit_armor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenFreddySuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/gfreddy_suit-skin.png");
	}
}
