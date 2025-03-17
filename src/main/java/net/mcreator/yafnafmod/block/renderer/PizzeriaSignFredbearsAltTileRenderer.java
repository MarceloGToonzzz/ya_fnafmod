package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignFredbearsAltBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignFredbearsAltTileEntity;

public class PizzeriaSignFredbearsAltTileRenderer extends GeoBlockRenderer<PizzeriaSignFredbearsAltTileEntity> {
	public PizzeriaSignFredbearsAltTileRenderer() {
		super(new PizzeriaSignFredbearsAltBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignFredbearsAltTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
