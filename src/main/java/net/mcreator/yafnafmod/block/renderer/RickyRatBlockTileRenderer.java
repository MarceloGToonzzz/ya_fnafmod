package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RickyRatBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.RickyRatBlockTileEntity;

public class RickyRatBlockTileRenderer extends GeoBlockRenderer<RickyRatBlockTileEntity> {
	public RickyRatBlockTileRenderer() {
		super(new RickyRatBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(RickyRatBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
