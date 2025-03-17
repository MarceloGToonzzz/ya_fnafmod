package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignFredbearsBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignFredbearsTileEntity;

public class PizzeriaSignFredbearsTileRenderer extends GeoBlockRenderer<PizzeriaSignFredbearsTileEntity> {
	public PizzeriaSignFredbearsTileRenderer() {
		super(new PizzeriaSignFredbearsBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignFredbearsTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
