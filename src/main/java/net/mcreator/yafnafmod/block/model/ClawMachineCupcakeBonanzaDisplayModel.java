package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ClawMachineCupcakeBonanzaDisplayItem;

public class ClawMachineCupcakeBonanzaDisplayModel extends GeoModel<ClawMachineCupcakeBonanzaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClawMachineCupcakeBonanzaDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clawmachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClawMachineCupcakeBonanzaDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clawmachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClawMachineCupcakeBonanzaDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clawmachine_cupcakebonanza.png");
	}
}
