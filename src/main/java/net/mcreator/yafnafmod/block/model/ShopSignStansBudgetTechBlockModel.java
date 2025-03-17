package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ShopSignStansBudgetTechTileEntity;

public class ShopSignStansBudgetTechBlockModel extends GeoModel<ShopSignStansBudgetTechTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShopSignStansBudgetTechTileEntity animatable) {
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
	public ResourceLocation getModelResource(ShopSignStansBudgetTechTileEntity animatable) {
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
	public ResourceLocation getTextureResource(ShopSignStansBudgetTechTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/sign_sbt.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/sign_sbt.png");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "textures/block/sign_sbt.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/sign_sbt.png");
	}
}
