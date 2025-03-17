package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeonStageLightPinkBlockModel;
import net.mcreator.yafnafmod.block.entity.NeonStageLightPinkTileEntity;

public class NeonStageLightPinkTileRenderer extends GeoBlockRenderer<NeonStageLightPinkTileEntity> {
	public NeonStageLightPinkTileRenderer() {
		super(new NeonStageLightPinkBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonStageLightPinkTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
