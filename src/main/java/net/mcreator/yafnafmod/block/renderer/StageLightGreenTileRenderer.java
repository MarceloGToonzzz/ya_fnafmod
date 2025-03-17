package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.StageLightGreenBlockModel;
import net.mcreator.yafnafmod.block.entity.StageLightGreenTileEntity;

public class StageLightGreenTileRenderer extends GeoBlockRenderer<StageLightGreenTileEntity> {
	public StageLightGreenTileRenderer() {
		super(new StageLightGreenBlockModel());
	}

	@Override
	public RenderType getRenderType(StageLightGreenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
