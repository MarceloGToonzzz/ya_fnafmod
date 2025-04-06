package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigTrashBinMovieBlockModel;
import net.mcreator.yafnafmod.block.entity.BigTrashBinMovieTileEntity;

public class BigTrashBinMovieTileRenderer extends GeoBlockRenderer<BigTrashBinMovieTileEntity> {
	public BigTrashBinMovieTileRenderer() {
		super(new BigTrashBinMovieBlockModel());
	}

	@Override
	public RenderType getRenderType(BigTrashBinMovieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
