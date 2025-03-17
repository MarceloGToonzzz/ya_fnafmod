package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BarryPolarBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.BarryPolarBlockTileEntity;

public class BarryPolarBlockTileRenderer extends GeoBlockRenderer<BarryPolarBlockTileEntity> {
	public BarryPolarBlockTileRenderer() {
		super(new BarryPolarBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(BarryPolarBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
