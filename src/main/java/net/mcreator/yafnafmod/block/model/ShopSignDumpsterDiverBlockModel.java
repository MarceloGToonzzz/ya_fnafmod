package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ShopSignDumpsterDiverTileEntity;

public class ShopSignDumpsterDiverBlockModel extends GeoModel<ShopSignDumpsterDiverTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShopSignDumpsterDiverTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/flatsign1_offcenter.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/flatsign1.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "animations/flatsign1_offcenter.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/flatsign1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShopSignDumpsterDiverTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/flatsign1_offcenter.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/flatsign1.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "geo/flatsign1_offcenter.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/flatsign1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShopSignDumpsterDiverTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/sign_ddw.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/sign_ddw.png");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "textures/block/sign_ddw.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/sign_ddw.png");
	}
}
