package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigKitchenWhiteDoorWideBlockModel;
import net.mcreator.yafnafmod.block.entity.BigKitchenWhiteDoorWideTileEntity;

public class BigKitchenWhiteDoorWideTileRenderer extends GeoBlockRenderer<BigKitchenWhiteDoorWideTileEntity> {
	public BigKitchenWhiteDoorWideTileRenderer() {
		super(new BigKitchenWhiteDoorWideBlockModel());
	}

	@Override
	public RenderType getRenderType(BigKitchenWhiteDoorWideTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
