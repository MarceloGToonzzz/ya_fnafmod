package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigKitchenDoorWideDisplayModel;
import net.mcreator.yafnafmod.block.display.BigKitchenDoorWideDisplayItem;

public class BigKitchenDoorWideDisplayItemRenderer extends GeoItemRenderer<BigKitchenDoorWideDisplayItem> {
	public BigKitchenDoorWideDisplayItemRenderer() {
		super(new BigKitchenDoorWideDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigKitchenDoorWideDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
