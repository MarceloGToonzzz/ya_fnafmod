package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigKitchenDoorDisplayModel;
import net.mcreator.yafnafmod.block.display.BigKitchenDoorDisplayItem;

public class BigKitchenDoorDisplayItemRenderer extends GeoItemRenderer<BigKitchenDoorDisplayItem> {
	public BigKitchenDoorDisplayItemRenderer() {
		super(new BigKitchenDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigKitchenDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
