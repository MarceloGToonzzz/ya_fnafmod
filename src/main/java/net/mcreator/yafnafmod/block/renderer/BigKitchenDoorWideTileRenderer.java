package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigKitchenDoorWideBlockModel;
import net.mcreator.yafnafmod.block.entity.BigKitchenDoorWideTileEntity;

public class BigKitchenDoorWideTileRenderer extends GeoBlockRenderer<BigKitchenDoorWideTileEntity> {
	public BigKitchenDoorWideTileRenderer() {
		super(new BigKitchenDoorWideBlockModel());
	}

	@Override
	public RenderType getRenderType(BigKitchenDoorWideTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
