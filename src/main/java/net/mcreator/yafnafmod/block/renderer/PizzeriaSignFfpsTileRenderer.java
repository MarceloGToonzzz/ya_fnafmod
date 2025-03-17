package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignFfpsBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignFfpsTileEntity;

public class PizzeriaSignFfpsTileRenderer extends GeoBlockRenderer<PizzeriaSignFfpsTileEntity> {
	public PizzeriaSignFfpsTileRenderer() {
		super(new PizzeriaSignFfpsBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignFfpsTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
