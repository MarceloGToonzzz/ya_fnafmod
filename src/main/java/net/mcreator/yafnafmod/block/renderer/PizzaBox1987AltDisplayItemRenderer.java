package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1987AltDisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBox1987AltDisplayItem;

public class PizzaBox1987AltDisplayItemRenderer extends GeoItemRenderer<PizzaBox1987AltDisplayItem> {
	public PizzaBox1987AltDisplayItemRenderer() {
		super(new PizzaBox1987AltDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1987AltDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
