package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FryingPanDisplayModel;
import net.mcreator.yafnafmod.block.display.FryingPanDisplayItem;

public class FryingPanDisplayItemRenderer extends GeoItemRenderer<FryingPanDisplayItem> {
	public FryingPanDisplayItemRenderer() {
		super(new FryingPanDisplayModel());
	}

	@Override
	public RenderType getRenderType(FryingPanDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
