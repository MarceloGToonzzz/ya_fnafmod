package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigKitchenDoorBlockModel;
import net.mcreator.yafnafmod.block.entity.BigKitchenDoorTileEntity;

public class BigKitchenDoorTileRenderer extends GeoBlockRenderer<BigKitchenDoorTileEntity> {
	public BigKitchenDoorTileRenderer() {
		super(new BigKitchenDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigKitchenDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
