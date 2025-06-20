package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToyChicaHeadBlockModel;
import net.mcreator.yafnafmod.block.entity.ToyChicaHeadTileEntity;

public class ToyChicaHeadTileRenderer extends GeoBlockRenderer<ToyChicaHeadTileEntity> {
	public ToyChicaHeadTileRenderer() {
		super(new ToyChicaHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(ToyChicaHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
