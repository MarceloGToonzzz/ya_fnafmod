package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PlushFingertrapBlockModel;
import net.mcreator.yafnafmod.block.entity.PlushFingertrapTileEntity;

public class PlushFingertrapTileRenderer extends GeoBlockRenderer<PlushFingertrapTileEntity> {
	public PlushFingertrapTileRenderer() {
		super(new PlushFingertrapBlockModel());
	}

	@Override
	public RenderType getRenderType(PlushFingertrapTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
