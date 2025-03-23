package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigBackstageDoorGray2DisplayModel;
import net.mcreator.yafnafmod.block.display.BigBackstageDoorGray2DisplayItem;

public class BigBackstageDoorGray2DisplayItemRenderer extends GeoItemRenderer<BigBackstageDoorGray2DisplayItem> {
	public BigBackstageDoorGray2DisplayItemRenderer() {
		super(new BigBackstageDoorGray2DisplayModel());
	}

	@Override
	public RenderType getRenderType(BigBackstageDoorGray2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
