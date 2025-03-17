package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeonStageLightOrangeBlockModel;
import net.mcreator.yafnafmod.block.entity.NeonStageLightOrangeTileEntity;

public class NeonStageLightOrangeTileRenderer extends GeoBlockRenderer<NeonStageLightOrangeTileEntity> {
	public NeonStageLightOrangeTileRenderer() {
		super(new NeonStageLightOrangeBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonStageLightOrangeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
