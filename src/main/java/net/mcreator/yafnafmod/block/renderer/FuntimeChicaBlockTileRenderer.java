package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FuntimeChicaBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.FuntimeChicaBlockTileEntity;

public class FuntimeChicaBlockTileRenderer extends GeoBlockRenderer<FuntimeChicaBlockTileEntity> {
	public FuntimeChicaBlockTileRenderer() {
		super(new FuntimeChicaBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(FuntimeChicaBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
