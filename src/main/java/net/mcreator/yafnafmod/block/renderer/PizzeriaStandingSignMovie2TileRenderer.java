package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaStandingSignMovie2BlockModel;
import net.mcreator.yafnafmod.block.entity.PizzeriaStandingSignMovie2TileEntity;

public class PizzeriaStandingSignMovie2TileRenderer extends GeoBlockRenderer<PizzeriaStandingSignMovie2TileEntity> {
	public PizzeriaStandingSignMovie2TileRenderer() {
		super(new PizzeriaStandingSignMovie2BlockModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaStandingSignMovie2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
