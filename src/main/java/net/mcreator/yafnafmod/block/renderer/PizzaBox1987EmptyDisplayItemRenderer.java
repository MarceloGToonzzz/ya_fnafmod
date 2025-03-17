package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1987EmptyDisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBox1987EmptyDisplayItem;

public class PizzaBox1987EmptyDisplayItemRenderer extends GeoItemRenderer<PizzaBox1987EmptyDisplayItem> {
	public PizzaBox1987EmptyDisplayItemRenderer() {
		super(new PizzaBox1987EmptyDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1987EmptyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
