package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBoxStack1988DisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBoxStack1988DisplayItem;

public class PizzaBoxStack1988DisplayItemRenderer extends GeoItemRenderer<PizzaBoxStack1988DisplayItem> {
	public PizzaBoxStack1988DisplayItemRenderer() {
		super(new PizzaBoxStack1988DisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBoxStack1988DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
