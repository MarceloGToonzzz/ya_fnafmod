package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ControlPanelTileEntity;

public class ControlPanelBlockModel extends GeoModel<ControlPanelTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ControlPanelTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/controlpanel.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/controlpanel.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/controlpanel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ControlPanelTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/controlpanel.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/controlpanel.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/controlpanel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ControlPanelTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/controlpanel_light.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/controlpanel_shock.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/controlpanel.png");
	}
}
