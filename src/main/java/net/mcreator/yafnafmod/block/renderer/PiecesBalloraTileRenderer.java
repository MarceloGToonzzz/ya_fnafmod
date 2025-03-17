package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PiecesBalloraBlockModel;
import net.mcreator.yafnafmod.block.entity.PiecesBalloraTileEntity;

public class PiecesBalloraTileRenderer extends GeoBlockRenderer<PiecesBalloraTileEntity> {
	public PiecesBalloraTileRenderer() {
		super(new PiecesBalloraBlockModel());
	}

	@Override
	public RenderType getRenderType(PiecesBalloraTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
