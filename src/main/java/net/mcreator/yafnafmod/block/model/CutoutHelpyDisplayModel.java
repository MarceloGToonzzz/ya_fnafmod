package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutHelpyDisplayItem;

public class CutoutHelpyDisplayModel extends GeoModel<CutoutHelpyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutHelpyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutHelpyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutHelpyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_helpy.png");
	}
}
