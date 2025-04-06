package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignJrsBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignJrsTileEntity;

public class PizzeriaSignJrsTileRenderer extends GeoBlockRenderer<PizzeriaSignJrsTileEntity> {
	public PizzeriaSignJrsTileRenderer() {
		super(new PizzeriaSignJrsBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignJrsTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
