package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutBalloonTwinsBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutBalloonTwinsTileEntity;

public class CutoutBalloonTwinsTileRenderer extends GeoBlockRenderer<CutoutBalloonTwinsTileEntity> {
	public CutoutBalloonTwinsTileRenderer() {
		super(new CutoutBalloonTwinsBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutBalloonTwinsTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
