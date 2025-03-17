package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RetroBonnieBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.RetroBonnieBlockTileEntity;

public class RetroBonnieBlockTileRenderer extends GeoBlockRenderer<RetroBonnieBlockTileEntity> {
	public RetroBonnieBlockTileRenderer() {
		super(new RetroBonnieBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(RetroBonnieBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
