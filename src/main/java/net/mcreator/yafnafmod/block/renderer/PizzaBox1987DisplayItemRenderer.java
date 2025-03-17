package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1987DisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBox1987DisplayItem;

public class PizzaBox1987DisplayItemRenderer extends GeoItemRenderer<PizzaBox1987DisplayItem> {
	public PizzaBox1987DisplayItemRenderer() {
		super(new PizzaBox1987DisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1987DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
