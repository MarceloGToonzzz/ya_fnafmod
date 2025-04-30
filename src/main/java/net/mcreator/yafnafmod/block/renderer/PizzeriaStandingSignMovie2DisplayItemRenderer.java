package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaStandingSignMovie2DisplayModel;
import net.mcreator.yafnafmod.block.display.PizzeriaStandingSignMovie2DisplayItem;

public class PizzeriaStandingSignMovie2DisplayItemRenderer extends GeoItemRenderer<PizzeriaStandingSignMovie2DisplayItem> {
	public PizzeriaStandingSignMovie2DisplayItemRenderer() {
		super(new PizzeriaStandingSignMovie2DisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaStandingSignMovie2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
