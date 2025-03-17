package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBoxStack2023DisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBoxStack2023DisplayItem;

public class PizzaBoxStack2023DisplayItemRenderer extends GeoItemRenderer<PizzaBoxStack2023DisplayItem> {
	public PizzaBoxStack2023DisplayItemRenderer() {
		super(new PizzaBoxStack2023DisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBoxStack2023DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
