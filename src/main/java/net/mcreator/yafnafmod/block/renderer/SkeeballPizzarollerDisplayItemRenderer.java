package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SkeeballPizzarollerDisplayModel;
import net.mcreator.yafnafmod.block.display.SkeeballPizzarollerDisplayItem;

public class SkeeballPizzarollerDisplayItemRenderer extends GeoItemRenderer<SkeeballPizzarollerDisplayItem> {
	public SkeeballPizzarollerDisplayItemRenderer() {
		super(new SkeeballPizzarollerDisplayModel());
	}

	@Override
	public RenderType getRenderType(SkeeballPizzarollerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
