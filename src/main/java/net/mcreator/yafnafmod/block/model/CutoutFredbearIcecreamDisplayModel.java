package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutFredbearIcecreamDisplayItem;

public class CutoutFredbearIcecreamDisplayModel extends GeoModel<CutoutFredbearIcecreamDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutFredbearIcecreamDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutFredbearIcecreamDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutFredbearIcecreamDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_fredbear_icecream.png");
	}
}
