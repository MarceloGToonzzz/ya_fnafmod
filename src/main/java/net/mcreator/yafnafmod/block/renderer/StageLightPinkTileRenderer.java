package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.StageLightPinkBlockModel;
import net.mcreator.yafnafmod.block.entity.StageLightPinkTileEntity;

public class StageLightPinkTileRenderer extends GeoBlockRenderer<StageLightPinkTileEntity> {
	public StageLightPinkTileRenderer() {
		super(new StageLightPinkBlockModel());
	}

	@Override
	public RenderType getRenderType(StageLightPinkTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
