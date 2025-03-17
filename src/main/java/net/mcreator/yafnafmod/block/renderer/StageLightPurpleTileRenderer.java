package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.StageLightPurpleBlockModel;
import net.mcreator.yafnafmod.block.entity.StageLightPurpleTileEntity;

public class StageLightPurpleTileRenderer extends GeoBlockRenderer<StageLightPurpleTileEntity> {
	public StageLightPurpleTileRenderer() {
		super(new StageLightPurpleBlockModel());
	}

	@Override
	public RenderType getRenderType(StageLightPurpleTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
