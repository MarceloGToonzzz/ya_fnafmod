package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RustyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.RustyBlockTileEntity;

public class RustyBlockTileRenderer extends GeoBlockRenderer<RustyBlockTileEntity> {
	public RustyBlockTileRenderer() {
		super(new RustyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(RustyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
