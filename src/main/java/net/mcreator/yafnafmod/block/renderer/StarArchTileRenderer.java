package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.StarArchBlockModel;
import net.mcreator.yafnafmod.block.entity.StarArchTileEntity;

public class StarArchTileRenderer extends GeoBlockRenderer<StarArchTileEntity> {
	public StarArchTileRenderer() {
		super(new StarArchBlockModel());
	}

	@Override
	public RenderType getRenderType(StarArchTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
