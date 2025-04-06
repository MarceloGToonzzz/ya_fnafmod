package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CindyCatBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.CindyCatBlockTileEntity;

public class CindyCatBlockTileRenderer extends GeoBlockRenderer<CindyCatBlockTileEntity> {
	public CindyCatBlockTileRenderer() {
		super(new CindyCatBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(CindyCatBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
