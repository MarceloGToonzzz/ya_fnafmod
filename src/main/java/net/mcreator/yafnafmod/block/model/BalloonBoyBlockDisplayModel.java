package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BalloonBoyBlockDisplayItem;

public class BalloonBoyBlockDisplayModel extends GeoModel<BalloonBoyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BalloonBoyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloonBoyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloonBoyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_bb.png");
	}
}
