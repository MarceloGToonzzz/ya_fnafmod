package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignChicasBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignChicasTileEntity;

public class PizzeriaSignChicasTileRenderer extends GeoBlockRenderer<PizzeriaSignChicasTileEntity> {
	public PizzeriaSignChicasTileRenderer() {
		super(new PizzeriaSignChicasBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignChicasTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
