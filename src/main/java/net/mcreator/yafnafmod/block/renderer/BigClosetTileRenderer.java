package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigClosetBlockModel;
import net.mcreator.yafnafmod.block.entity.BigClosetTileEntity;

public class BigClosetTileRenderer extends GeoBlockRenderer<BigClosetTileEntity> {
	public BigClosetTileRenderer() {
		super(new BigClosetBlockModel());
	}

	@Override
	public RenderType getRenderType(BigClosetTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
