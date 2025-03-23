package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigBackstageDoorBlack2DisplayModel;
import net.mcreator.yafnafmod.block.display.BigBackstageDoorBlack2DisplayItem;

public class BigBackstageDoorBlack2DisplayItemRenderer extends GeoItemRenderer<BigBackstageDoorBlack2DisplayItem> {
	public BigBackstageDoorBlack2DisplayItemRenderer() {
		super(new BigBackstageDoorBlack2DisplayModel());
	}

	@Override
	public RenderType getRenderType(BigBackstageDoorBlack2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
