package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutTreePalmBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutTreePalmTileEntity;

public class CutoutTreePalmTileRenderer extends GeoBlockRenderer<CutoutTreePalmTileEntity> {
	public CutoutTreePalmTileRenderer() {
		super(new CutoutTreePalmBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutTreePalmTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
