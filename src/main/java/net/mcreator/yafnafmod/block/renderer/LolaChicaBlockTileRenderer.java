package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.LolaChicaBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.LolaChicaBlockTileEntity;

public class LolaChicaBlockTileRenderer extends GeoBlockRenderer<LolaChicaBlockTileEntity> {
	public LolaChicaBlockTileRenderer() {
		super(new LolaChicaBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(LolaChicaBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
