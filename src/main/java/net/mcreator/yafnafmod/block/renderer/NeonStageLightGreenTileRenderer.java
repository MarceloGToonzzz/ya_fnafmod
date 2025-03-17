package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeonStageLightGreenBlockModel;
import net.mcreator.yafnafmod.block.entity.NeonStageLightGreenTileEntity;

public class NeonStageLightGreenTileRenderer extends GeoBlockRenderer<NeonStageLightGreenTileEntity> {
	public NeonStageLightGreenTileRenderer() {
		super(new NeonStageLightGreenBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonStageLightGreenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
