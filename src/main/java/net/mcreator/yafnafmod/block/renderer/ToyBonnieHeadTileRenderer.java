package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToyBonnieHeadBlockModel;
import net.mcreator.yafnafmod.block.entity.ToyBonnieHeadTileEntity;

public class ToyBonnieHeadTileRenderer extends GeoBlockRenderer<ToyBonnieHeadTileEntity> {
	public ToyBonnieHeadTileRenderer() {
		super(new ToyBonnieHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(ToyBonnieHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
