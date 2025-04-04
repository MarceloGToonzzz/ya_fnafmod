package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DeluxeBallpitBlockModel;
import net.mcreator.yafnafmod.block.entity.DeluxeBallpitTileEntity;

public class DeluxeBallpitTileRenderer extends GeoBlockRenderer<DeluxeBallpitTileEntity> {
	public DeluxeBallpitTileRenderer() {
		super(new DeluxeBallpitBlockModel());
	}

	@Override
	public RenderType getRenderType(DeluxeBallpitTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
