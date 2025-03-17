package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFredbearBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutFredbearTileEntity;

public class CutoutFredbearTileRenderer extends GeoBlockRenderer<CutoutFredbearTileEntity> {
	public CutoutFredbearTileRenderer() {
		super(new CutoutFredbearBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutFredbearTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
