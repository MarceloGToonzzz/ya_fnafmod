package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BoxPlatesBlockModel;
import net.mcreator.yafnafmod.block.entity.BoxPlatesTileEntity;

public class BoxPlatesTileRenderer extends GeoBlockRenderer<BoxPlatesTileEntity> {
	public BoxPlatesTileRenderer() {
		super(new BoxPlatesBlockModel());
	}

	@Override
	public RenderType getRenderType(BoxPlatesTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
