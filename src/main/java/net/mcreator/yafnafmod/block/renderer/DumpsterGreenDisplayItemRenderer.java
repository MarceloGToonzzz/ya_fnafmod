package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DumpsterGreenDisplayModel;
import net.mcreator.yafnafmod.block.display.DumpsterGreenDisplayItem;

public class DumpsterGreenDisplayItemRenderer extends GeoItemRenderer<DumpsterGreenDisplayItem> {
	public DumpsterGreenDisplayItemRenderer() {
		super(new DumpsterGreenDisplayModel());
	}

	@Override
	public RenderType getRenderType(DumpsterGreenDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
