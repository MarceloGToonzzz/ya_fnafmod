package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.WitheredChicaBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.WitheredChicaBlockTileEntity;

public class WitheredChicaBlockTileRenderer extends GeoBlockRenderer<WitheredChicaBlockTileEntity> {
	public WitheredChicaBlockTileRenderer() {
		super(new WitheredChicaBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(WitheredChicaBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
