package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DittophobiaChicaBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.DittophobiaChicaBlockTileEntity;

public class DittophobiaChicaBlockTileRenderer extends GeoBlockRenderer<DittophobiaChicaBlockTileEntity> {
	public DittophobiaChicaBlockTileRenderer() {
		super(new DittophobiaChicaBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(DittophobiaChicaBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
