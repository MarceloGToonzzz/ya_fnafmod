package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFazvanBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutFazvanTileEntity;

public class CutoutFazvanTileRenderer extends GeoBlockRenderer<CutoutFazvanTileEntity> {
	public CutoutFazvanTileRenderer() {
		super(new CutoutFazvanBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutFazvanTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
