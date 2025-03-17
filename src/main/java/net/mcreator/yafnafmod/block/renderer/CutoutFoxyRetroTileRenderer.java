package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFoxyRetroBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutFoxyRetroTileEntity;

public class CutoutFoxyRetroTileRenderer extends GeoBlockRenderer<CutoutFoxyRetroTileEntity> {
	public CutoutFoxyRetroTileRenderer() {
		super(new CutoutFoxyRetroBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutFoxyRetroTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
