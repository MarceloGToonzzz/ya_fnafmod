package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigBackstageDoorGray2BlockModel;
import net.mcreator.yafnafmod.block.entity.BigBackstageDoorGray2TileEntity;

public class BigBackstageDoorGray2TileRenderer extends GeoBlockRenderer<BigBackstageDoorGray2TileEntity> {
	public BigBackstageDoorGray2TileRenderer() {
		super(new BigBackstageDoorGray2BlockModel());
	}

	@Override
	public RenderType getRenderType(BigBackstageDoorGray2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
