package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigBackstageDoorBlack2BlockModel;
import net.mcreator.yafnafmod.block.entity.BigBackstageDoorBlack2TileEntity;

public class BigBackstageDoorBlack2TileRenderer extends GeoBlockRenderer<BigBackstageDoorBlack2TileEntity> {
	public BigBackstageDoorBlack2TileRenderer() {
		super(new BigBackstageDoorBlack2BlockModel());
	}

	@Override
	public RenderType getRenderType(BigBackstageDoorBlack2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
