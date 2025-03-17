package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BulletinBoardDisplayItem;

public class BulletinBoardDisplayModel extends GeoModel<BulletinBoardDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BulletinBoardDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bulletinboard.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BulletinBoardDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bulletinboard.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BulletinBoardDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bulletinboard_blank.png");
	}
}
