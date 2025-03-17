package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FryerDisplayModel;
import net.mcreator.yafnafmod.block.display.FryerDisplayItem;

public class FryerDisplayItemRenderer extends GeoItemRenderer<FryerDisplayItem> {
	public FryerDisplayItemRenderer() {
		super(new FryerDisplayModel());
	}

	@Override
	public RenderType getRenderType(FryerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
