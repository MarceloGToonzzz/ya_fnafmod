package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.StageLightGreenDisplayModel;
import net.mcreator.yafnafmod.block.display.StageLightGreenDisplayItem;

public class StageLightGreenDisplayItemRenderer extends GeoItemRenderer<StageLightGreenDisplayItem> {
	public StageLightGreenDisplayItemRenderer() {
		super(new StageLightGreenDisplayModel());
	}

	@Override
	public RenderType getRenderType(StageLightGreenDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
