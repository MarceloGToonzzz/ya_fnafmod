package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BallpitVintageBlockModel;
import net.mcreator.yafnafmod.block.entity.BallpitVintageTileEntity;

public class BallpitVintageTileRenderer extends GeoBlockRenderer<BallpitVintageTileEntity> {
	public BallpitVintageTileRenderer() {
		super(new BallpitVintageBlockModel());
	}

	@Override
	public RenderType getRenderType(BallpitVintageTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
