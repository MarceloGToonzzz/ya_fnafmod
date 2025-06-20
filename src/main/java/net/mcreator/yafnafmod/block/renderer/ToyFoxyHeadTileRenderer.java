package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToyFoxyHeadBlockModel;
import net.mcreator.yafnafmod.block.entity.ToyFoxyHeadTileEntity;

public class ToyFoxyHeadTileRenderer extends GeoBlockRenderer<ToyFoxyHeadTileEntity> {
	public ToyFoxyHeadTileRenderer() {
		super(new ToyFoxyHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(ToyFoxyHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
