package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigBackstageDoorBlackBlockModel;
import net.mcreator.yafnafmod.block.entity.BigBackstageDoorBlackTileEntity;

public class BigBackstageDoorBlackTileRenderer extends GeoBlockRenderer<BigBackstageDoorBlackTileEntity> {
	public BigBackstageDoorBlackTileRenderer() {
		super(new BigBackstageDoorBlackBlockModel());
	}

	@Override
	public RenderType getRenderType(BigBackstageDoorBlackTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
