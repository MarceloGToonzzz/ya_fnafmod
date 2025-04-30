package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RetroBonnieHeadBlockModel;
import net.mcreator.yafnafmod.block.entity.RetroBonnieHeadTileEntity;

public class RetroBonnieHeadTileRenderer extends GeoBlockRenderer<RetroBonnieHeadTileEntity> {
	public RetroBonnieHeadTileRenderer() {
		super(new RetroBonnieHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(RetroBonnieHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
