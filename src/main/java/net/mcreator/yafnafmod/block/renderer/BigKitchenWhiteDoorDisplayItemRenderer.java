package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigKitchenWhiteDoorDisplayModel;
import net.mcreator.yafnafmod.block.display.BigKitchenWhiteDoorDisplayItem;

public class BigKitchenWhiteDoorDisplayItemRenderer extends GeoItemRenderer<BigKitchenWhiteDoorDisplayItem> {
	public BigKitchenWhiteDoorDisplayItemRenderer() {
		super(new BigKitchenWhiteDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigKitchenWhiteDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
