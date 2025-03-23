package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigBackstageDoorBlackDisplayModel;
import net.mcreator.yafnafmod.block.display.BigBackstageDoorBlackDisplayItem;

public class BigBackstageDoorBlackDisplayItemRenderer extends GeoItemRenderer<BigBackstageDoorBlackDisplayItem> {
	public BigBackstageDoorBlackDisplayItemRenderer() {
		super(new BigBackstageDoorBlackDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigBackstageDoorBlackDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
