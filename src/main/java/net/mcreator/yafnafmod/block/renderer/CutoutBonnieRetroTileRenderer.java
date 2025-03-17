package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutBonnieRetroBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutBonnieRetroTileEntity;

public class CutoutBonnieRetroTileRenderer extends GeoBlockRenderer<CutoutBonnieRetroTileEntity> {
	public CutoutBonnieRetroTileRenderer() {
		super(new CutoutBonnieRetroBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutBonnieRetroTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
