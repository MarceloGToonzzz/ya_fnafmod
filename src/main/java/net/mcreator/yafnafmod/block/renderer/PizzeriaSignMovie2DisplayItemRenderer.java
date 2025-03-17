package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignMovie2DisplayModel;
import net.mcreator.yafnafmod.block.display.PizzeriaSignMovie2DisplayItem;

public class PizzeriaSignMovie2DisplayItemRenderer extends GeoItemRenderer<PizzeriaSignMovie2DisplayItem> {
	public PizzeriaSignMovie2DisplayItemRenderer() {
		super(new PizzeriaSignMovie2DisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignMovie2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
