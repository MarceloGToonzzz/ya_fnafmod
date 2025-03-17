package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutChicaRetroBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutChicaRetroTileEntity;

public class CutoutChicaRetroTileRenderer extends GeoBlockRenderer<CutoutChicaRetroTileEntity> {
	public CutoutChicaRetroTileRenderer() {
		super(new CutoutChicaRetroBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutChicaRetroTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
