package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CandyCadetBlockModel;
import net.mcreator.yafnafmod.block.entity.CandyCadetTileEntity;

public class CandyCadetTileRenderer extends GeoBlockRenderer<CandyCadetTileEntity> {
	public CandyCadetTileRenderer() {
		super(new CandyCadetBlockModel());
	}

	@Override
	public RenderType getRenderType(CandyCadetTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
