package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutPuppetBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutPuppetTileEntity;

public class CutoutPuppetTileRenderer extends GeoBlockRenderer<CutoutPuppetTileEntity> {
	public CutoutPuppetTileRenderer() {
		super(new CutoutPuppetBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutPuppetTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
