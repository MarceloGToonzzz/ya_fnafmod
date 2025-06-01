package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ArcadeTicketMuncherCupcakeTileEntity;

public class ArcadeTicketMuncherCupcakeBlockModel extends GeoModel<ArcadeTicketMuncherCupcakeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeTicketMuncherCupcakeTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcade_ticketmuncher.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeTicketMuncherCupcakeTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcade_ticketmuncher.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeTicketMuncherCupcakeTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcade_ticketmuncher_cupcake.png");
	}
}
