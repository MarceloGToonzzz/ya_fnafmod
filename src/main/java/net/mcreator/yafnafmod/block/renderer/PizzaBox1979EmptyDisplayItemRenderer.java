package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1979EmptyDisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBox1979EmptyDisplayItem;

public class PizzaBox1979EmptyDisplayItemRenderer extends GeoItemRenderer<PizzaBox1979EmptyDisplayItem> {
	public PizzaBox1979EmptyDisplayItemRenderer() {
		super(new PizzaBox1979EmptyDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1979EmptyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
