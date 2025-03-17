package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1979DisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBox1979DisplayItem;

public class PizzaBox1979DisplayItemRenderer extends GeoItemRenderer<PizzaBox1979DisplayItem> {
	public PizzaBox1979DisplayItemRenderer() {
		super(new PizzaBox1979DisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1979DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
