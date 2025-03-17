package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigKitchenWhiteDoorWideDisplayModel;
import net.mcreator.yafnafmod.block.display.BigKitchenWhiteDoorWideDisplayItem;

public class BigKitchenWhiteDoorWideDisplayItemRenderer extends GeoItemRenderer<BigKitchenWhiteDoorWideDisplayItem> {
	public BigKitchenWhiteDoorWideDisplayItemRenderer() {
		super(new BigKitchenWhiteDoorWideDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigKitchenWhiteDoorWideDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
