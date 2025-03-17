package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MangleBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.MangleBlockTileEntity;

public class MangleBlockTileRenderer extends GeoBlockRenderer<MangleBlockTileEntity> {
	public MangleBlockTileRenderer() {
		super(new MangleBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(MangleBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
