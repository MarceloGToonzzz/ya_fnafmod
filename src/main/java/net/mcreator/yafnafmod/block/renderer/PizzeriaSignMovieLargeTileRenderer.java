package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignMovieLargeBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignMovieLargeTileEntity;

public class PizzeriaSignMovieLargeTileRenderer extends GeoBlockRenderer<PizzeriaSignMovieLargeTileEntity> {
	public PizzeriaSignMovieLargeTileRenderer() {
		super(new PizzeriaSignMovieLargeBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignMovieLargeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
