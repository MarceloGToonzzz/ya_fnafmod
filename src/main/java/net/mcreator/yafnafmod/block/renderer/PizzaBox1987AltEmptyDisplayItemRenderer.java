package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1987AltEmptyDisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBox1987AltEmptyDisplayItem;

public class PizzaBox1987AltEmptyDisplayItemRenderer extends GeoItemRenderer<PizzaBox1987AltEmptyDisplayItem> {
	public PizzaBox1987AltEmptyDisplayItemRenderer() {
		super(new PizzaBox1987AltEmptyDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1987AltEmptyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
