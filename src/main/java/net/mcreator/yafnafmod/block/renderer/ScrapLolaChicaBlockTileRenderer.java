package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ScrapLolaChicaBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.ScrapLolaChicaBlockTileEntity;

public class ScrapLolaChicaBlockTileRenderer extends GeoBlockRenderer<ScrapLolaChicaBlockTileEntity> {
	public ScrapLolaChicaBlockTileRenderer() {
		super(new ScrapLolaChicaBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(ScrapLolaChicaBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
