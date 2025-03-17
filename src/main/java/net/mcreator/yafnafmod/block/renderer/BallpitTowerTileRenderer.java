package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BallpitTowerBlockModel;
import net.mcreator.yafnafmod.block.entity.BallpitTowerTileEntity;

public class BallpitTowerTileRenderer extends GeoBlockRenderer<BallpitTowerTileEntity> {
	public BallpitTowerTileRenderer() {
		super(new BallpitTowerBlockModel());
	}

	@Override
	public RenderType getRenderType(BallpitTowerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
