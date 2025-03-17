package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ChicaHeadBlockModel;
import net.mcreator.yafnafmod.block.entity.ChicaHeadTileEntity;

public class ChicaHeadTileRenderer extends GeoBlockRenderer<ChicaHeadTileEntity> {
	public ChicaHeadTileRenderer() {
		super(new ChicaHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(ChicaHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
