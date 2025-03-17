package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BallpitRottenBlockModel;
import net.mcreator.yafnafmod.block.entity.BallpitRottenTileEntity;

public class BallpitRottenTileRenderer extends GeoBlockRenderer<BallpitRottenTileEntity> {
	public BallpitRottenTileRenderer() {
		super(new BallpitRottenBlockModel());
	}

	@Override
	public RenderType getRenderType(BallpitRottenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
