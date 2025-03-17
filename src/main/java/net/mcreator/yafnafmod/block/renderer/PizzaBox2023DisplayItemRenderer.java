package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox2023DisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBox2023DisplayItem;

public class PizzaBox2023DisplayItemRenderer extends GeoItemRenderer<PizzaBox2023DisplayItem> {
	public PizzaBox2023DisplayItemRenderer() {
		super(new PizzaBox2023DisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox2023DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
