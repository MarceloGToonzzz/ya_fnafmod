package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigEntranceDoorDisplayModel;
import net.mcreator.yafnafmod.block.display.BigEntranceDoorDisplayItem;

public class BigEntranceDoorDisplayItemRenderer extends GeoItemRenderer<BigEntranceDoorDisplayItem> {
	public BigEntranceDoorDisplayItemRenderer() {
		super(new BigEntranceDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigEntranceDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
