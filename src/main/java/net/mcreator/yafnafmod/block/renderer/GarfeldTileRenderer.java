package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.GarfeldBlockModel;
import net.mcreator.yafnafmod.block.entity.GarfeldTileEntity;

public class GarfeldTileRenderer extends GeoBlockRenderer<GarfeldTileEntity> {
	public GarfeldTileRenderer() {
		super(new GarfeldBlockModel());
	}

	@Override
	public RenderType getRenderType(GarfeldTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
