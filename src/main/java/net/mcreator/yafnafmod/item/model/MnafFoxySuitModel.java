package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.MnafFoxySuitItem;

public class MnafFoxySuitModel extends GeoModel<MnafFoxySuitItem> {
	@Override
	public ResourceLocation getAnimationResource(MnafFoxySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/mnaf_foxysuit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MnafFoxySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/mnaf_foxysuit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MnafFoxySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/mnaf_foxysuit.png");
	}
}
