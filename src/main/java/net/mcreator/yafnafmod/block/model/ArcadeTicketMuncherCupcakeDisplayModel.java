package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ArcadeTicketMuncherCupcakeDisplayItem;

public class ArcadeTicketMuncherCupcakeDisplayModel extends GeoModel<ArcadeTicketMuncherCupcakeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeTicketMuncherCupcakeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcade_ticketmuncher.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeTicketMuncherCupcakeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcade_ticketmuncher.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeTicketMuncherCupcakeDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcade_ticketmuncher_cupcake.png");
	}
}
