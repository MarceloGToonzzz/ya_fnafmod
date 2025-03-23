package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigBackstageDoorGrayBlockModel;
import net.mcreator.yafnafmod.block.entity.BigBackstageDoorGrayTileEntity;

public class BigBackstageDoorGrayTileRenderer extends GeoBlockRenderer<BigBackstageDoorGrayTileEntity> {
	public BigBackstageDoorGrayTileRenderer() {
		super(new BigBackstageDoorGrayBlockModel());
	}

	@Override
	public RenderType getRenderType(BigBackstageDoorGrayTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
