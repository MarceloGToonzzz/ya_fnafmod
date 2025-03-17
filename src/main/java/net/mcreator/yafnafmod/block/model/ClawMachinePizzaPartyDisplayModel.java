package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ClawMachinePizzaPartyDisplayItem;

public class ClawMachinePizzaPartyDisplayModel extends GeoModel<ClawMachinePizzaPartyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClawMachinePizzaPartyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clawmachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClawMachinePizzaPartyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clawmachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClawMachinePizzaPartyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clawmachine_pizzaparty.png");
	}
}
