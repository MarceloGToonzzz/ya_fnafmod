package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ShreddyFazchairBlockTileEntity;

public class ShreddyFazchairBlockBlockModel extends GeoModel<ShreddyFazchairBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShreddyFazchairBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/shreddy_fazchair.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/shreddy_fazchair.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShreddyFazchairBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/shreddy_fazchair.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/shreddy_fazchair.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShreddyFazchairBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/shreddy_fazchair_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/shreddy_fazchair.png");
	}
}
