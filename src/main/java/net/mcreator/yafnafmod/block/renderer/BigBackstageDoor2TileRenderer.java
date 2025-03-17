package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigBackstageDoor2BlockModel;
import net.mcreator.yafnafmod.block.entity.BigBackstageDoor2TileEntity;

public class BigBackstageDoor2TileRenderer extends GeoBlockRenderer<BigBackstageDoor2TileEntity> {
	public BigBackstageDoor2TileRenderer() {
		super(new BigBackstageDoor2BlockModel());
	}

	@Override
	public RenderType getRenderType(BigBackstageDoor2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
