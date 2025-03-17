package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClawMachinePizzaPartyDisplayModel;
import net.mcreator.yafnafmod.block.display.ClawMachinePizzaPartyDisplayItem;

public class ClawMachinePizzaPartyDisplayItemRenderer extends GeoItemRenderer<ClawMachinePizzaPartyDisplayItem> {
	public ClawMachinePizzaPartyDisplayItemRenderer() {
		super(new ClawMachinePizzaPartyDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClawMachinePizzaPartyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
