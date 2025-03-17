package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.StageLightBlueBlockModel;
import net.mcreator.yafnafmod.block.entity.StageLightBlueTileEntity;

public class StageLightBlueTileRenderer extends GeoBlockRenderer<StageLightBlueTileEntity> {
	public StageLightBlueTileRenderer() {
		super(new StageLightBlueBlockModel());
	}

	@Override
	public RenderType getRenderType(StageLightBlueTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
