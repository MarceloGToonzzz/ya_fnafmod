package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBoxStack1987DisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBoxStack1987DisplayItem;

public class PizzaBoxStack1987DisplayItemRenderer extends GeoItemRenderer<PizzaBoxStack1987DisplayItem> {
	public PizzaBoxStack1987DisplayItemRenderer() {
		super(new PizzaBoxStack1987DisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBoxStack1987DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
