package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFoxyFuntimeBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutFoxyFuntimeTileEntity;

public class CutoutFoxyFuntimeTileRenderer extends GeoBlockRenderer<CutoutFoxyFuntimeTileEntity> {
	public CutoutFoxyFuntimeTileRenderer() {
		super(new CutoutFoxyFuntimeBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutFoxyFuntimeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
