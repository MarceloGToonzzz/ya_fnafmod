package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigBackstageDoorGrayDisplayModel;
import net.mcreator.yafnafmod.block.display.BigBackstageDoorGrayDisplayItem;

public class BigBackstageDoorGrayDisplayItemRenderer extends GeoItemRenderer<BigBackstageDoorGrayDisplayItem> {
	public BigBackstageDoorGrayDisplayItemRenderer() {
		super(new BigBackstageDoorGrayDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigBackstageDoorGrayDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
