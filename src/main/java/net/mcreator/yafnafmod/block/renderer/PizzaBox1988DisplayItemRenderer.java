package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1988DisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBox1988DisplayItem;

public class PizzaBox1988DisplayItemRenderer extends GeoItemRenderer<PizzaBox1988DisplayItem> {
	public PizzaBox1988DisplayItemRenderer() {
		super(new PizzaBox1988DisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1988DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
