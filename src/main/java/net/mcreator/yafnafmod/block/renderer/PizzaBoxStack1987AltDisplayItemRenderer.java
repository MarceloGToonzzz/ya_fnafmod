package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBoxStack1987AltDisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBoxStack1987AltDisplayItem;

public class PizzaBoxStack1987AltDisplayItemRenderer extends GeoItemRenderer<PizzaBoxStack1987AltDisplayItem> {
	public PizzaBoxStack1987AltDisplayItemRenderer() {
		super(new PizzaBoxStack1987AltDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBoxStack1987AltDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
