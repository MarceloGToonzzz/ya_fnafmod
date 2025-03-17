package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignChicasDisplayModel;
import net.mcreator.yafnafmod.block.display.PizzeriaSignChicasDisplayItem;

public class PizzeriaSignChicasDisplayItemRenderer extends GeoItemRenderer<PizzeriaSignChicasDisplayItem> {
	public PizzeriaSignChicasDisplayItemRenderer() {
		super(new PizzeriaSignChicasDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignChicasDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
