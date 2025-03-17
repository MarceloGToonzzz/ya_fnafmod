package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BalloonBarrelBlockModel;
import net.mcreator.yafnafmod.block.entity.BalloonBarrelTileEntity;

public class BalloonBarrelTileRenderer extends GeoBlockRenderer<BalloonBarrelTileEntity> {
	public BalloonBarrelTileRenderer() {
		super(new BalloonBarrelBlockModel());
	}

	@Override
	public RenderType getRenderType(BalloonBarrelTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
