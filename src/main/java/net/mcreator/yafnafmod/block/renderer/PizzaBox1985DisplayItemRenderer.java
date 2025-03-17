package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1985DisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBox1985DisplayItem;

public class PizzaBox1985DisplayItemRenderer extends GeoItemRenderer<PizzaBox1985DisplayItem> {
	public PizzaBox1985DisplayItemRenderer() {
		super(new PizzaBox1985DisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1985DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
