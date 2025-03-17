package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBoxStack1985DisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBoxStack1985DisplayItem;

public class PizzaBoxStack1985DisplayItemRenderer extends GeoItemRenderer<PizzaBoxStack1985DisplayItem> {
	public PizzaBoxStack1985DisplayItemRenderer() {
		super(new PizzaBoxStack1985DisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBoxStack1985DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
