package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutTreePineBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutTreePineTileEntity;

public class CutoutTreePineTileRenderer extends GeoBlockRenderer<CutoutTreePineTileEntity> {
	public CutoutTreePineTileRenderer() {
		super(new CutoutTreePineBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutTreePineTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
