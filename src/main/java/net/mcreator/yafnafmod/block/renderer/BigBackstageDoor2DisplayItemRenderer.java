package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigBackstageDoor2DisplayModel;
import net.mcreator.yafnafmod.block.display.BigBackstageDoor2DisplayItem;

public class BigBackstageDoor2DisplayItemRenderer extends GeoItemRenderer<BigBackstageDoor2DisplayItem> {
	public BigBackstageDoor2DisplayItemRenderer() {
		super(new BigBackstageDoor2DisplayModel());
	}

	@Override
	public RenderType getRenderType(BigBackstageDoor2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
