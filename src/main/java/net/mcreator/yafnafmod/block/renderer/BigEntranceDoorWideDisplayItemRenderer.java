package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigEntranceDoorWideDisplayModel;
import net.mcreator.yafnafmod.block.display.BigEntranceDoorWideDisplayItem;

public class BigEntranceDoorWideDisplayItemRenderer extends GeoItemRenderer<BigEntranceDoorWideDisplayItem> {
	public BigEntranceDoorWideDisplayItemRenderer() {
		super(new BigEntranceDoorWideDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigEntranceDoorWideDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
