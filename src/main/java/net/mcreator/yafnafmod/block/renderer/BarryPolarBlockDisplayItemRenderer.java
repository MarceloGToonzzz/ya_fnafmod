package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BarryPolarBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.BarryPolarBlockDisplayItem;

public class BarryPolarBlockDisplayItemRenderer extends GeoItemRenderer<BarryPolarBlockDisplayItem> {
	public BarryPolarBlockDisplayItemRenderer() {
		super(new BarryPolarBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(BarryPolarBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
