package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CandyCatBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.CandyCatBlockTileEntity;

public class CandyCatBlockTileRenderer extends GeoBlockRenderer<CandyCatBlockTileEntity> {
	public CandyCatBlockTileRenderer() {
		super(new CandyCatBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(CandyCatBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
