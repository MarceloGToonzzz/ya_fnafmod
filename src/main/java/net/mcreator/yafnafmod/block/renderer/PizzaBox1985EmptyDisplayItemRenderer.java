package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1985EmptyDisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBox1985EmptyDisplayItem;

public class PizzaBox1985EmptyDisplayItemRenderer extends GeoItemRenderer<PizzaBox1985EmptyDisplayItem> {
	public PizzaBox1985EmptyDisplayItemRenderer() {
		super(new PizzaBox1985EmptyDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1985EmptyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
