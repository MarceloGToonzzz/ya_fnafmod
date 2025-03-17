package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignMovie2BlockModel;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignMovie2TileEntity;

public class PizzeriaSignMovie2TileRenderer extends GeoBlockRenderer<PizzeriaSignMovie2TileEntity> {
	public PizzeriaSignMovie2TileRenderer() {
		super(new PizzeriaSignMovie2BlockModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignMovie2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
