package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigEntranceDoorWideBlockModel;
import net.mcreator.yafnafmod.block.entity.BigEntranceDoorWideTileEntity;

public class BigEntranceDoorWideTileRenderer extends GeoBlockRenderer<BigEntranceDoorWideTileEntity> {
	public BigEntranceDoorWideTileRenderer() {
		super(new BigEntranceDoorWideBlockModel());
	}

	@Override
	public RenderType getRenderType(BigEntranceDoorWideTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
