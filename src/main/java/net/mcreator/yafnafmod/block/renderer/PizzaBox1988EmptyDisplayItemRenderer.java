package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1988EmptyDisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBox1988EmptyDisplayItem;

public class PizzaBox1988EmptyDisplayItemRenderer extends GeoItemRenderer<PizzaBox1988EmptyDisplayItem> {
	public PizzaBox1988EmptyDisplayItemRenderer() {
		super(new PizzaBox1988EmptyDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1988EmptyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
