package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignJrs2DisplayModel;
import net.mcreator.yafnafmod.block.display.PizzeriaSignJrs2DisplayItem;

public class PizzeriaSignJrs2DisplayItemRenderer extends GeoItemRenderer<PizzeriaSignJrs2DisplayItem> {
	public PizzeriaSignJrs2DisplayItemRenderer() {
		super(new PizzeriaSignJrs2DisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignJrs2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
