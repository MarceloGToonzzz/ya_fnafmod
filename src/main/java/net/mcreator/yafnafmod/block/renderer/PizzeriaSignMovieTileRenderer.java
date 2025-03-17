package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignMovieBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignMovieTileEntity;

public class PizzeriaSignMovieTileRenderer extends GeoBlockRenderer<PizzeriaSignMovieTileEntity> {
	public PizzeriaSignMovieTileRenderer() {
		super(new PizzeriaSignMovieBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignMovieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
