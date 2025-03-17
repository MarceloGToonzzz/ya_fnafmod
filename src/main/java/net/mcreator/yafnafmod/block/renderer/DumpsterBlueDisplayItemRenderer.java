package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DumpsterBlueDisplayModel;
import net.mcreator.yafnafmod.block.display.DumpsterBlueDisplayItem;

public class DumpsterBlueDisplayItemRenderer extends GeoItemRenderer<DumpsterBlueDisplayItem> {
	public DumpsterBlueDisplayItemRenderer() {
		super(new DumpsterBlueDisplayModel());
	}

	@Override
	public RenderType getRenderType(DumpsterBlueDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
