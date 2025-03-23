package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.IgnitedChicaBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.IgnitedChicaBlockTileEntity;

public class IgnitedChicaBlockTileRenderer extends GeoBlockRenderer<IgnitedChicaBlockTileEntity> {
	public IgnitedChicaBlockTileRenderer() {
		super(new IgnitedChicaBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(IgnitedChicaBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
