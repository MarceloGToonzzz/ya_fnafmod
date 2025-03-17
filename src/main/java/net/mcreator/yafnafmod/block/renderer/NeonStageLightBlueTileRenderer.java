package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeonStageLightBlueBlockModel;
import net.mcreator.yafnafmod.block.entity.NeonStageLightBlueTileEntity;

public class NeonStageLightBlueTileRenderer extends GeoBlockRenderer<NeonStageLightBlueTileEntity> {
	public NeonStageLightBlueTileRenderer() {
		super(new NeonStageLightBlueBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonStageLightBlueTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
