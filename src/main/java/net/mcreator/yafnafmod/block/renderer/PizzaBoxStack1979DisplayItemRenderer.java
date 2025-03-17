package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBoxStack1979DisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBoxStack1979DisplayItem;

public class PizzaBoxStack1979DisplayItemRenderer extends GeoItemRenderer<PizzaBoxStack1979DisplayItem> {
	public PizzaBoxStack1979DisplayItemRenderer() {
		super(new PizzaBoxStack1979DisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBoxStack1979DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
