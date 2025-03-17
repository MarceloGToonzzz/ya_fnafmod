package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox2023EmptyDisplayModel;
import net.mcreator.yafnafmod.block.display.PizzaBox2023EmptyDisplayItem;

public class PizzaBox2023EmptyDisplayItemRenderer extends GeoItemRenderer<PizzaBox2023EmptyDisplayItem> {
	public PizzaBox2023EmptyDisplayItemRenderer() {
		super(new PizzaBox2023EmptyDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox2023EmptyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
