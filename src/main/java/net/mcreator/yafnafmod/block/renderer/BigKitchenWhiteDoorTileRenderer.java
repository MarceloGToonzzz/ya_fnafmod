package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigKitchenWhiteDoorBlockModel;
import net.mcreator.yafnafmod.block.entity.BigKitchenWhiteDoorTileEntity;

public class BigKitchenWhiteDoorTileRenderer extends GeoBlockRenderer<BigKitchenWhiteDoorTileEntity> {
	public BigKitchenWhiteDoorTileRenderer() {
		super(new BigKitchenWhiteDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigKitchenWhiteDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
