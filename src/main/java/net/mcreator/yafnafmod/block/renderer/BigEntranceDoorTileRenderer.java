package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigEntranceDoorBlockModel;
import net.mcreator.yafnafmod.block.entity.BigEntranceDoorTileEntity;

public class BigEntranceDoorTileRenderer extends GeoBlockRenderer<BigEntranceDoorTileEntity> {
	public BigEntranceDoorTileRenderer() {
		super(new BigEntranceDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigEntranceDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
