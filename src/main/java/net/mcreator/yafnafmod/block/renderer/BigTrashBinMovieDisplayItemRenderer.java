package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigTrashBinMovieDisplayModel;
import net.mcreator.yafnafmod.block.display.BigTrashBinMovieDisplayItem;

public class BigTrashBinMovieDisplayItemRenderer extends GeoItemRenderer<BigTrashBinMovieDisplayItem> {
	public BigTrashBinMovieDisplayItemRenderer() {
		super(new BigTrashBinMovieDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigTrashBinMovieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
