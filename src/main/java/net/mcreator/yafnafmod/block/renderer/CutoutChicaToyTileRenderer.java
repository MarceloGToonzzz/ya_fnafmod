package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutChicaToyBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutChicaToyTileEntity;

public class CutoutChicaToyTileRenderer extends GeoBlockRenderer<CutoutChicaToyTileEntity> {
	public CutoutChicaToyTileRenderer() {
		super(new CutoutChicaToyBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutChicaToyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
