package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignFrightsBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignFrightsTileEntity;

public class PizzeriaSignFrightsTileRenderer extends GeoBlockRenderer<PizzeriaSignFrightsTileEntity> {
	public PizzeriaSignFrightsTileRenderer() {
		super(new PizzeriaSignFrightsBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignFrightsTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
