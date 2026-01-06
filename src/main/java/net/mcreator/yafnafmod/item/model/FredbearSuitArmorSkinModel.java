package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.FredbearSuitArmorSkinItem;

public class FredbearSuitArmorSkinModel extends GeoModel<FredbearSuitArmorSkinItem> {
	@Override
	public ResourceLocation getAnimationResource(FredbearSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/fredbear_suit_armor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/fredbear_suit_armor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/fredbear_suit-skin.png");
	}
}
