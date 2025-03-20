package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DittophobiaBonnieBlockTileEntity;

public class DittophobiaBonnieBlockBlockModel extends GeoModel<DittophobiaBonnieBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DittophobiaBonnieBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dittophobia_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DittophobiaBonnieBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dittophobia_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DittophobiaBonnieBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/dittophobia_bonnie.png");
	}
}
