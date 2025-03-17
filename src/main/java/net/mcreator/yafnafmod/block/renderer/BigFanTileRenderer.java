package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigFanBlockModel;
import net.mcreator.yafnafmod.block.entity.BigFanTileEntity;

public class BigFanTileRenderer extends GeoBlockRenderer<BigFanTileEntity> {
	public BigFanTileRenderer() {
		super(new BigFanBlockModel());
	}

	@Override
	public RenderType getRenderType(BigFanTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
