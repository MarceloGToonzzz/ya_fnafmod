package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RascBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.RascBlockTileEntity;

public class RascBlockTileRenderer extends GeoBlockRenderer<RascBlockTileEntity> {
	public RascBlockTileRenderer() {
		super(new RascBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(RascBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
