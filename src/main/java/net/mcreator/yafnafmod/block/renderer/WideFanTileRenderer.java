package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.WideFanBlockModel;
import net.mcreator.yafnafmod.block.entity.WideFanTileEntity;

public class WideFanTileRenderer extends GeoBlockRenderer<WideFanTileEntity> {
	public WideFanTileRenderer() {
		super(new WideFanBlockModel());
	}

	@Override
	public RenderType getRenderType(WideFanTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
