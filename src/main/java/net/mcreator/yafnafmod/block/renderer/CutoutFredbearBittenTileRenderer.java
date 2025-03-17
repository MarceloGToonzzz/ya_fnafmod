package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFredbearBittenBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutFredbearBittenTileEntity;

public class CutoutFredbearBittenTileRenderer extends GeoBlockRenderer<CutoutFredbearBittenTileEntity> {
	public CutoutFredbearBittenTileRenderer() {
		super(new CutoutFredbearBittenBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutFredbearBittenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
